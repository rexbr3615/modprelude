package net.rexbr.preludejurassika.Utils.preludeUtils;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.entity.ModEntityTypes;
import net.rexbr.preludejurassika.entity.custom.JuravenatorEntity;

public enum PrehistoricEntityType {
    JURAVENATOR(ModEntityTypes.JURAVENATOR, MobType.DINOSAUR, TimePeriod.MESOZOIC, Diet.HERBIVORE, 1);

    public static final ResourceLocation DINOSAUR_LOOT = null;
    private EntityType entityType;
    public MobType mobType;
    private float eggScale = 1.0F;
    public TimePeriod timePeriod;
    public Diet diet;
    public Item eggItem;
    public Item uncultivatedEggItem;

    PrehistoricEntityType(EntityType entityType, MobType mobType, TimePeriod timePeriod, Diet diet, float eggScale){
        this.entityType = entityType;
        this.mobType = mobType;
        this.diet = diet;
        this.timePeriod = timePeriod;
    }

    PrehistoricEntityType(RegistryObject<EntityType<JuravenatorEntity>> juravenator, MobType dinosaur, TimePeriod mesozoic, Diet herbivore, int i) {
    }

}
