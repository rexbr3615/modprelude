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

    public static final RegistryObject<EntityType<JuravenatorEntity>> JURAVENATOR =
            ENTITY_TYPES.register("jura",
                    () -> EntityType.Builder.of(JuravenatorEntity::new, MobCategory.CREATURE)
                            .sized(0.34f, 0.5f)
                            .build(new ResourceLocation(prelude.MODID, "jura").toString()));

    public static final RegistryObject<EntityType<OrnithomimusEntity>> ORNITHOMIMUS =
            ENTITY_TYPES.register("ornithomimus",
                    () -> EntityType.Builder.of(OrnithomimusEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 1.8f)
                            .build(new ResourceLocation(prelude.MODID, "ornithomimus").toString()));

    public static final RegistryObject<EntityType<AlbertosaurusEntity>> ALBERTOSAURUS =
            ENTITY_TYPES.register("albertosaurus",
                    () -> EntityType.Builder.of(AlbertosaurusEntity::new, MobCategory.CREATURE)
                            .sized(1.2f, 3.1f)
                            .build(new ResourceLocation(prelude.MODID, "albertosaurus").toString()));

    public static final RegistryObject<EntityType<AvaceratopsEntity>> AVACERATOPS =
            ENTITY_TYPES.register("avaceratops",
                    () -> EntityType.Builder.of(AvaceratopsEntity::new, MobCategory.CREATURE)
                            .sized(1.05f, 1.4f)
                            .build(new ResourceLocation(prelude.MODID, "avaceratops").toString()));

    public static final RegistryObject<EntityType<PyroraptorEntity>> PYRORAPTOR =
            ENTITY_TYPES.register("pyroraptor",
                    () -> EntityType.Builder.of(PyroraptorEntity::new, MobCategory.CREATURE)
                            .sized(0.66f, 0.84f)
                            .build(new ResourceLocation(prelude.MODID, "pyroraptor").toString()));

    public static final RegistryObject<EntityType<AmazonsaurusEntity>> AMAZONSAURUS =
            ENTITY_TYPES.register("amazonsaurus",
                    () -> EntityType.Builder.of(AmazonsaurusEntity::new, MobCategory.CREATURE)
                            .sized(1.3f, 2.23f)
                            .build(new ResourceLocation(prelude.MODID, "amazonsaurus").toString()));

    public static final RegistryObject<EntityType<TorvosaurusEntity>> TORVOSAURUS =
            ENTITY_TYPES.register("torvosaurus",
                    () -> EntityType.Builder.of(TorvosaurusEntity::new, MobCategory.CREATURE)
                            .sized(1.8f, 3.0f)
                            .build(new ResourceLocation(prelude.MODID, "torvosaurus").toString()));

    public static final RegistryObject<EntityType<PaleolamaMajorEntity>> PALEOLAMA =
            ENTITY_TYPES.register("paleolama",
                    () -> EntityType.Builder.of(PaleolamaMajorEntity::new, MobCategory.CREATURE)
                            .sized(1.8f, 3.2f)
                            .build(new ResourceLocation(prelude.MODID, "paleolama").toString()));

    public static final RegistryObject<EntityType<DryosaurusEntity>> DRYOSAURUS =
            ENTITY_TYPES.register("dryosaurus",
                    () -> EntityType.Builder.of(DryosaurusEntity::new, MobCategory.CREATURE)
                            .sized(1.8f, 3.2f)
                            .build(new ResourceLocation(prelude.MODID, "dryosaurus").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
