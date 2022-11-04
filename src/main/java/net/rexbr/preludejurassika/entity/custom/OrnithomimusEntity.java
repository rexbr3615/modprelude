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
import net.minecraft.world.entity.ai.behavior.Swim;
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
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.Vec3;
import net.rexbr.preludejurassika.entity.ModEntityTypes;
import net.rexbr.preludejurassika.entity.custom.base.Sex;
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

public class OrnithomimusEntity extends Animal implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);

    private static final EntityDataAccessor<Integer> DATA_ID_TYPE_SEX =
            SynchedEntityData.defineId(OrnithomimusEntity.class, EntityDataSerializers.INT);

    public OrnithomimusEntity(EntityType<? extends Animal> entityType, Level level) {

        super(entityType, level);
        xpReward = 0;
        this.setPathfindingMalus(BlockPathTypes.WATER, 0);

    }

    @Override
    protected PathNavigation createNavigation(Level world) {
        return new FlyingPathNavigation(this, world);
    }


    public static AttributeSupplier setAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 46.0D)
                .add(Attributes.FLYING_SPEED, 0.9f)
                .add(Attributes.FOLLOW_RANGE, 12.0f)
                .add(Attributes.ATTACK_DAMAGE, 4.0f)
                .add(Attributes.ATTACK_SPEED, 2.0f)

                .add(Attributes.MOVEMENT_SPEED, 0.35f).build();
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FollowMobGoal(this, (float) 1, 10, 5));
        this.goalSelector.addGoal(2, new RandomStrollGoal(this, 0.8, 20) {
            @Override
            protected Vec3 getPosition() {
                Random random = OrnithomimusEntity.this.getRandom();
                double dir_x = OrnithomimusEntity.this.getX() + ((random.nextFloat() * 3 - 1) * 16);
                double dir_y = OrnithomimusEntity.this.getY() + ((random.nextFloat() * 3 - 1) * 16);
                double dir_z = OrnithomimusEntity.this.getZ() + ((random.nextFloat() * 3 - 1) * 16);
                return new Vec3(dir_x, dir_y, dir_z);
            }
        });
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));

        this.goalSelector.addGoal(5, new LeapAtTargetGoal(this, (float) 0.5));


    }

    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob mob) {
        OrnithomimusEntity baby = ModEntityTypes.ORNITHOMIMUS.get().create(serverLevel);

        Sex sex = Util.getRandom(Sex.values(), this.random);

        baby.setSex(sex);

        return baby;
    }

    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.getItem() == Items.BEEF;
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addRepeatingAnimation("animation.ornithomimus.walk", 999));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addRepeatingAnimation("animation.ornithomimus.idle", 999));
        return PlayState.CONTINUE;
    }

    private PlayState attackPredicate(AnimationEvent event) {
        if(this.swinging && event.getController().getAnimationState().equals(AnimationState.Stopped)) {
            event.getController().markNeedsReload();
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.ornithomimus.attack", false));
            this.swinging = false;
        }

        return PlayState.CONTINUE;
    }

    private PlayState flyPredicate(AnimationEvent event) {
        if(isFallFlying() && event.getController().getAnimationState().equals(AnimationState.Stopped)) {
            event.getController().markNeedsReload();
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.ornithomimus.aaaa", false));
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
        data.addAnimationController(new AnimationController(this, "flyController",
                0, this::flyPredicate));
    }



    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, 0.15F, 1.0F);
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.CAT_STRAY_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.DOLPHIN_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.DOLPHIN_DEATH;
    }

    protected float getSoundVolume() {
        return 0.2F;
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);

        this.entityData.set(DATA_ID_TYPE_SEX, tag.getInt("Sex"));
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt("Sex", this.getTypeSex());
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE_SEX, 0);
    }

    /* VARIANTS */
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor p_146746_, DifficultyInstance p_146747_,
                                        MobSpawnType p_146748_, @Nullable SpawnGroupData p_146749_,
                                        @Nullable CompoundTag p_146750_) {
        Sex sex = Util.getRandom(Sex.values(), this.random);
        setSex(sex);
        return super.finalizeSpawn(p_146746_, p_146747_, p_146748_, p_146749_, p_146750_);
    }


    public Sex getSex() {
        return Sex.byId(this.getTypeSex() & 255);
    }

    private int getTypeSex() {
        return this.entityData.get(DATA_ID_TYPE_SEX);
    }

    private void setSex(Sex sex) {
        this.entityData.set(DATA_ID_TYPE_SEX, sex.getId() & 255);
    }



}
