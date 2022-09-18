package net.rexbr.preludejurassika.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.entity.custom.AchillobatorEntity;
import net.rexbr.preludejurassika.entity.custom.DodoEntity;
import net.rexbr.preludejurassika.entity.custom.TRexEntity;
import net.rexbr.preludejurassika.prelude;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, prelude.MODID);

    public static final RegistryObject<EntityType<AchillobatorEntity>> ACHILLOBATOR =
            ENTITY_TYPES.register("achillobator",
                    () -> EntityType.Builder.of(AchillobatorEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 1.2f)
                            .build(new ResourceLocation(prelude.MODID, "achillobator").toString()));

    public static final RegistryObject<EntityType<DodoEntity>> DODO =
            ENTITY_TYPES.register("dodo",
                    () -> EntityType.Builder.of(DodoEntity::new, MobCategory.CREATURE)
                            .sized(0.52f, 0.94f)
                            .build(new ResourceLocation(prelude.MODID, "dodo").toString()));

    public static final RegistryObject<EntityType<TRexEntity>> TREX =
            ENTITY_TYPES.register("trex",
                    () -> EntityType.Builder.of(TRexEntity::new, MobCategory.CREATURE)
                            .sized(3f, 4.5f)
                            .build(new ResourceLocation(prelude.MODID, "trex").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
