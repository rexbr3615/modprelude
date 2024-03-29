package net.rexbr.preludejurassika.entity.testcontent;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraftforge.common.ForgeMod;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class KronosaurusEntity extends Animal implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);

    public KronosaurusEntity(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
        this.setPathfindingMalus(BlockPathTypes.WATER, 0);
        this.moveControl = new MoveControl(this) {
            @Override
            public void tick() {
                if (KronosaurusEntity.this.isInWater())
                    KronosaurusEntity.this.setDeltaMovement(KronosaurusEntity.this.getDeltaMovement().add(0, 0.005, 0));
                if (this.operation == MoveControl.Operation.MOVE_TO && !KronosaurusEntity.this.getNavigation().isDone()) {
                    double dx = this.wantedX - KronosaurusEntity.this.getX();
                    double dy = this.wantedY - KronosaurusEntity.this.getY();
                    double dz = this.wantedZ - KronosaurusEntity.this.getZ();
                    float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
                    float f1 = (float) (this.speedModifier * KronosaurusEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
                    KronosaurusEntity.this.setYRot(this.rotlerp(KronosaurusEntity.this.getYRot(), f, 10));
                    KronosaurusEntity.this.yBodyRot = KronosaurusEntity.this.getYRot();
                    KronosaurusEntity.this.yHeadRot = KronosaurusEntity.this.getYRot();
                    if (KronosaurusEntity.this.isInWater()) {
                        KronosaurusEntity.this.setSpeed((float) KronosaurusEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
                        float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
                        f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
                        KronosaurusEntity.this.setXRot(this.rotlerp(KronosaurusEntity.this.getXRot(), f2, 5));
                        float f3 = Mth.cos(KronosaurusEntity.this.getXRot() * (float) (Math.PI / 180.0));
                        KronosaurusEntity.this.setZza(f3 * f1);
                        KronosaurusEntity.this.setYya((float) (f1 * dy));
                    } else {
                        KronosaurusEntity.this.setSpeed(f1 * 0.05F);
                    }
                } else {
                    KronosaurusEntity.this.setSpeed(0);
                    KronosaurusEntity.this.setYya(0);
                    KronosaurusEntity.this.setZza(0);
                }
            }
        };

    }

    public static AttributeSupplier setAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 24.0D)
                .add(Attributes.ATTACK_DAMAGE, 6f)
                .add(Attributes.ATTACK_SPEED, 2.0f)
                .add(ForgeMod.SWIM_SPEED.get(), 0.3f)
                .add(Attributes.MOVEMENT_SPEED, 0.25f).build();
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new RandomSwimmingGoal(this, 1, 40));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, false, false));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
    }


    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
        return null;
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addRepeatingAnimation("animation.pyroraptor.move", 999));
            return PlayState.CONTINUE;
        }

        if (this.isInWaterOrBubble()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.pyroraptor.swim", true));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addRepeatingAnimation("animation.pyroraptor.idle", 999));
        return PlayState.CONTINUE;
    }

    private PlayState attackPredicate(AnimationEvent event) {
        if(this.swinging && event.getController().getAnimationState().equals(AnimationState.Stopped)) {
            event.getController().markNeedsReload();
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.pyroraptor.attack", false));
            this.swinging = false;
        }

        return PlayState.CONTINUE;
    }



    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
        data.addAnimationController(new AnimationController(this, "attackController",
                0, this::attackPredicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, 0.15F, 1.0F);
    }

    @Override
    protected PathNavigation createNavigation(Level world) {
        return new WaterBoundPathNavigation(this, world);
    }



    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (source == DamageSource.DROWN)
            return false;
        return super.hurt(source, amount);
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }


    @Override
    public boolean isPushedByFluid() {
        return false;
    }



}
