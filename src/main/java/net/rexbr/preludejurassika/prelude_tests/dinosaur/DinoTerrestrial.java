package net.rexbr.preludejurassika.prelude_tests.dinosaur;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public abstract class DinoTerrestrial extends DinossauroComplex {
    public int sitProgress; // A counter which defines the progress towards the Sitting Poses
    public int ticksToSit;
    public int sleepProgress; // A counter which defines the progress towards the Sleeping Poses
    public int forceSleep; // Negative forceSleep keeps the mob awake, Positive forceSleep keeps the mob as

    private static final EntityDataAccessor<Integer> HUNGER = SynchedEntityData.defineId(DinoTerrestrial.class, EntityDataSerializers.INT);

    public DinoTerrestrial(EntityType<? extends DinoTerrestrial> type, Level worldIn){
        super(type, worldIn);
        this.moveControl = new MoveControl(this);
        this.ticksToSit = 40;
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(HUNGER, 79); // One point less than the breeding threshold
    }



    private void setHunger(int hunger){
        this.entityData.set(HUNGER, hunger);
    }
    public int getHunger(){
        return (this.entityData.get(HUNGER));
    }

    public boolean isStarving() { return this.getHunger() <= 0; }
    public void addHunger(int change) {
        int i = this.getHunger() + change;
        this.setHunger((i > 200) ? 200 : (Math.max(i, 0)));
    }

    public void addAdditionalSaveData(CompoundTag compound){
        super.addAdditionalSaveData(compound);
        compound.putBoolean("Sleeping", this.isSleeping());
        compound.putInt("SleepingTicks", this.forceSleep);
        compound.putBoolean("Sitting", this.isSitting());
        compound.putInt("Hunger", this.getHunger());
    }

    public void readAdditionalSaveData(CompoundTag compound){
        super.readAdditionalSaveData(compound);
        this.setSleeping(compound.getBoolean("Sleeping"));
        this.forceSleep = compound.getInt("SleepingTicks");
        this.setSitting(compound.getBoolean("Sitting"));
        this.setHunger(compound.getInt("Hunger"));
    }





}
