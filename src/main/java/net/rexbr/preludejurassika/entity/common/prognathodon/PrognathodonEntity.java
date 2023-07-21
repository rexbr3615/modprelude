package net.rexbr.preludejurassika.entity.common.prognathodon;

import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.entity.monster.Drowned;
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

public class PrognathodonEntity extends Animal implements IAnimatable 
{
    private AnimationFactory factory = new AnimationFactory(this);

    private static final EntityDataAccessor<Boolean> FROM_BUCKET = SynchedEntityData.defineId(PrognathodonEntity.class, EntityDataSerializers.BOOLEAN);

    public PrognathodonEntity(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
        this.setPathfindingMalus(BlockPathTypes.WATER, 0);
        this.moveControl = new MoveControl(this) {

            @Override
            public void tick() {
                if (PrognathodonEntity.this.isInWater())
                    PrognathodonEntity.this.setDeltaMovement(PrognathodonEntity.this.getDeltaMovement().add(0, 0.005, 0));
                if (this.operation == MoveControl.Operation.MOVE_TO && !PrognathodonEntity.this.getNavigation().isDone()) {
                    double dx = this.wantedX - PrognathodonEntity.this.getX();
                    double dy = this.wantedY - PrognathodonEntity.this.getY();
                    double dz = this.wantedZ - PrognathodonEntity.this.getZ();
                    float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
                    float f1 = (float) (this.speedModifier * PrognathodonEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
                    PrognathodonEntity.this.setYRot(this.rotlerp(PrognathodonEntity.this.getYRot(), f, 10));
                    PrognathodonEntity.this.yBodyRot = PrognathodonEntity.this.getYRot();
                    PrognathodonEntity.this.yHeadRot = PrognathodonEntity.this.getYRot();
                    if (PrognathodonEntity.this.isInWater()) {
                        PrognathodonEntity.this.setSpeed((float) PrognathodonEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
                        float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
                        f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
                        PrognathodonEntity.this.setXRot(this.rotlerp(PrognathodonEntity.this.getXRot(), f2, 5));
                        float f3 = Mth.cos(PrognathodonEntity.this.getXRot() * (float) (Math.PI / 180.0));
                        PrognathodonEntity.this.setZza(f3 * f1);
                        PrognathodonEntity.this.setYya((float) (f1 * dy));
                    } else {
                        PrognathodonEntity.this.setSpeed(f1 * 0.05F);
                    }
                } else {
                    PrognathodonEntity.this.setSpeed(0);
                    PrognathodonEntity.this.setYya(0);
                    PrognathodonEntity.this.setZza(0);
                }
            }
        };

    }

    @Override
    protected PathNavigation createNavigation(Level world) {
        return new WaterBoundPathNavigation(this, world);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
            @Override
            protected double getAttackReachSqr(LivingEntity entity) {
                return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
            }
        });
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(3, new RandomSwimmingGoal(this, 3, 40));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, false, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Cod.class, false, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Salmon.class, false, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, TropicalFish.class, false, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Drowned.class, false, false));

    }

    @Override
    public MobType getMobType() {
        return MobType.WATER;
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


    public static AttributeSupplier setAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 68.0D)
                .add(Attributes.ATTACK_DAMAGE, 10f)
                .add(Attributes.ATTACK_SPEED, 1.0f)
                .add(ForgeMod.SWIM_SPEED.get(), 3.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.25f).build();
    }



    @Nullable
    public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
        return null;
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {

        if (event.isMoving() && this.isInWater()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.prognathodon.swim", true));
            return PlayState.CONTINUE;
        }
        if (event.isMoving() && this.isInWaterOrBubble()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.prognathodon.swim", true));
            return PlayState.CONTINUE;
        }
        if (this.isInWaterOrBubble()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.prognathodon.idle", true));
            return PlayState.CONTINUE;
        }
        if (event.isMoving() && this.isOnGround()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.prognathodon.landed", true));
            return PlayState.CONTINUE;
        }
        if (this.isOnGround())
        {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.prognathodon.landed", true));
            return PlayState.CONTINUE;
        }
        return PlayState.STOP;
    }

    private PlayState attackPredicate(AnimationEvent event) {
        if(this.swinging && event.getController().getAnimationState().equals(AnimationState.Stopped)) {
            event.getController().markNeedsReload();
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.prognathodon.attack", false));
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
        this.playSound(SoundEvents.GRASS_STEP, 0.15F, 1.0F);
    }


}


