package net.rexbr.preludejurassika.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.entity.custom.*;
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
                    () -> EntityType.Builder.of(DodoEntity::new, MobCategory.MONSTER)
                            .sized(0.52f, 0.94f)
                            .build(new ResourceLocation(prelude.MODID, "dodo").toString()));

    public static final RegistryObject<EntityType<TRexEntity>> TREX =
            ENTITY_TYPES.register("trex",
                    () -> EntityType.Builder.of(TRexEntity::new, MobCategory.MONSTER)
                            .sized(2.6f, 4.5f)
                            .build(new ResourceLocation(prelude.MODID, "trex").toString()));

    public static final RegistryObject<EntityType<JuravenatorEntity>> JURAVENATOR =
            ENTITY_TYPES.register("jura",
                    () -> EntityType.Builder.of(JuravenatorEntity::new, MobCategory.CREATURE)
                            .sized(0.34f, 0.5f)
                            .build(new ResourceLocation(prelude.MODID, "jura").toString()));

    public static final RegistryObject<EntityType<GiganothossaurusEntity>> GIGANOTOSAURUS =
            ENTITY_TYPES.register("giganotosaurus",
                    () -> EntityType.Builder.of(GiganothossaurusEntity::new, MobCategory.MONSTER)
                            .sized(4f, 8f)
                            .build(new ResourceLocation(prelude.MODID, "giganotosaurus").toString()));

    public static final RegistryObject<EntityType<PostosuchusEntity>> POSTOSUCHUS =
            ENTITY_TYPES.register("postosuchus",
                    () -> EntityType.Builder.of(PostosuchusEntity::new, MobCategory.MONSTER)
                            .sized(4f, 8f)
                            .build(new ResourceLocation(prelude.MODID, "postosuchus").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
