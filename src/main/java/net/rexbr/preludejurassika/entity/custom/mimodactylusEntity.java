package net.rexbr.preludejurassika.entity.custom;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.rexbr.preludejurassika.entity.ModEntityTypes;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.Random;

public class mimodactylusEntity extends Animal implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);

    private static final EntityDataAccessor<Integer> DATA_ID_TYPE_SEX =
            SynchedEntityData.defineId(mimodactylusEntity.class, EntityDataSerializers.INT);

    public mimodactylusEntity(EntityType<? extends Animal> entityType, Level level) {

        super(entityType, level);
        xpReward = 0;
        this.moveControl = new FlyingMoveControl(this, 10, true);

    }

    @Override
    protected PathNavigation createNavigation(Level world) {
        return new FlyingPathNavigation(this, world);
    }


    public static AttributeSupplier setAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 46.0D)
                .add(Attributes.FLYING_SPEED, 1.0f)
                .add(Attributes.FOLLOW_RANGE, 12.0f)
                .add(Attributes.ATTACK_DAMAGE, 4.0f)
                .add(Attributes.ATTACK_SPEED, 2.0f)

                .add(Attributes.MOVEMENT_SPEED, 0.35f).build();
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(1, new RandomStrollGoal(this, 0.8, 20) {
            @Override
            protected Vec3 getPosition() {
                Random random = mimodactylusEntity.this.getRandom();
                double dir_x = mimodactylusEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
                double dir_y = mimodactylusEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
                double dir_z = mimodactylusEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
                return new Vec3(dir_x, dir_y, dir_z);
            }
        });
        this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(3, new FloatGoal(this));
        this.goalSelector.addGoal(4, new LeapAtTargetGoal(this, (float) 0.5));

    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving() && !this.isFallFlying()) {
            event.getController().setAnimation(new AnimationBuilder().addRepeatingAnimation("animation.mimodactylus.fly", 999));
            return PlayState.CONTINUE;
        }

        if (this.isFallFlying()) {
            event.getController().setAnimation(new AnimationBuilder().addRepeatingAnimation("animation.mimodactylus.fly", 999));
            return PlayState.CONTINUE;
        }

        if (this.isOnGround()) {
            event.getController().setAnimation(new AnimationBuilder().addRepeatingAnimation("animation.mimodactylus.idle", 999));
            return PlayState.CONTINUE;
        }

        if (event.isMoving() && !this.isOnGround()) {
            event.getController().setAnimation(new AnimationBuilder().addRepeatingAnimation("animation.mimodactylus.walk", 999));
            return PlayState.CONTINUE;
        }

        return PlayState.STOP;

    }

    private PlayState attackPredicate(AnimationEvent event) {
        if(this.swinging && event.getController().getAnimationState().equals(AnimationState.Stopped)) {
            event.getController().markNeedsReload();
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.mimodactylus.attack", false));
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



    protected float getSoundVolume() {
        return 0.2F;
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);

        this.entityData.set(DATA_ID_TYPE_SEX, tag.getInt("Sex"));
    }


    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
        return null;
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE_SEX, 0);
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (source == DamageSource.FALL)
            return false;
        return super.hurt(source, amount);
    }

    @Override
    protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
    }

    @Override
    public void setNoGravity(boolean ignored) {
        super.setNoGravity(true);
    }



}
