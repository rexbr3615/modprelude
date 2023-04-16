package net.rexbr.preludejurassika.entity.custom;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.loot.LootContext;
import software.bernie.geckolib3.core.IAnimatable;

public abstract class PreludeEntity extends Animal implements IAnimatable {

    public static int HUNGRY = 000;
    public static double HEALTH = 000;


    protected String GeoLocation = "";
    public String AnimLocation = "";
    public String texLocation = "";



    protected PreludeEntity(EntityType<? extends Animal> p_27557_, Level p_27558_) {
        super(p_27557_, p_27558_);
        GeoLocation = GeoLocation;
        AnimLocation = AnimLocation;
        texLocation = texLocation;
        HUNGRY = HUNGRY;
        HEALTH = HEALTH;
    }



}
