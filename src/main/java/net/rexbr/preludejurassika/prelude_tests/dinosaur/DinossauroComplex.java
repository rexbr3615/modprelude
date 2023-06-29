package net.rexbr.preludejurassika.prelude_tests.dinosaur;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.EntityDamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class DinossauroComplex extends TamableAnimal {

    private static final EntityDataAccessor<Integer> GENDER = SynchedEntityData.defineId(DinossauroComplex.class, EntityDataSerializers.INT); // 0 - Male, 1 - Female
    private static final EntityDataAccessor<Boolean> SLEEPING = SynchedEntityData.defineId(DinossauroComplex.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> SITTING = SynchedEntityData.defineId(DinossauroComplex.class, EntityDataSerializers.BOOLEAN);


    public DinossauroComplex(EntityType<? extends DinossauroComplex> type, Level worldIn){
        super(type, worldIn);
        this.moveControl = new MoveControl(this);
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(GENDER, 0);
        this.entityData.define(SLEEPING, false);
        this.entityData.define(SITTING, false);
    }

    public boolean checkSpawnRules(LevelAccessor worldIn, MobSpawnType spawnReasonIn) {
        return true;
    }

    // Why is a method called 'checkSpawnObstruction()' also checking for Water?
    @Override
    public boolean checkSpawnObstruction(LevelReader worldIn) {
        //return !p_21433_.containsAnyLiquid(this.getBoundingBox()) && p_21433_.isUnobstructed(this);
        return worldIn.isUnobstructed(this);
    }

    @Override
    public boolean canBeLeashed(Player player) {
        if (player.isCreative()) {
            return !this.isLeashed();
        }
        return (!this.isLeashed() && this.isTame());
    }

    @Override
    public boolean removeWhenFarAway(double p_21542_) {
        return false;
    }

    public void setGender(int gender){ this.entityData.set(GENDER, gender); }
    public int getGender(){	return (this.entityData.get(GENDER)); }
    public boolean isMale() { return this.getGender() == 0; }
    public String getGenderString() {
        return this.isMale() ? "male" : "female";
    }

    public void setSleeping(boolean sleeping){ this.entityData.set(SLEEPING, sleeping); }
    public boolean isSleeping(){ return (this.entityData.get(SLEEPING)); }

    public void setSitting(boolean sitting){ this.entityData.set(SITTING, sitting); }
    public boolean isSitting(){ return (this.entityData.get(SITTING)); }

    public boolean isNotMoving(){
        return this.getDeltaMovement().x == 0 && this.getDeltaMovement().z == 0;
    }

    public double getCurrentSpeed() { return Math.sqrt(this.getDeltaMovement().x * this.getDeltaMovement().x + this.getDeltaMovement().z * this.getDeltaMovement().z); }

    public int getAmbientSoundInterval() {
        //return Integer.MAX_VALUE;
        return 300;
    }

    public boolean isFood(ItemStack stack) {

            return false;

    }
    public boolean canTakeItem(ItemStack stack) {

        return false;

    }

    public boolean canMove() { return !this.isSitting() && !this.isSleeping() && !this.isVehicle(); }

    public void addAdditionalSaveData(CompoundTag compound){
        super.addAdditionalSaveData(compound);
        compound.putInt("Gender", this.getGender());
    }

    public void readAdditionalSaveData(CompoundTag compound){
        super.readAdditionalSaveData(compound);
        this.setGender(compound.getInt("Gender"));
    }

    @Nullable
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor worldIn, DifficultyInstance difficultyIn, MobSpawnType reason, @Nullable SpawnGroupData spawnDataIn, @Nullable CompoundTag dataTag) {
        if (reason != MobSpawnType.DISPENSER && reason != MobSpawnType.BUCKET && reason != MobSpawnType.BREEDING) {

            this.setGender(this.random.nextInt(2));


            this.setAge(0);
        }

        return spawnDataIn;
    }

}
