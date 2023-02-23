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

    public static final RegistryObject<EntityType<mimodactylusEntity>> MIMODACTYLUS =
            ENTITY_TYPES.register("mimodactylus",
                    () -> EntityType.Builder.of(mimodactylusEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.8f)
                            .build(new ResourceLocation(prelude.MODID, "mimodactylus").toString()));

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
                            .sized(1.0f, 1.6f)
                            .build(new ResourceLocation(prelude.MODID, "paleolama").toString()));

    public static final RegistryObject<EntityType<DryosaurusEntity>> DRYOSAURUS =
            ENTITY_TYPES.register("dryosaurus",
                    () -> EntityType.Builder.of(DryosaurusEntity::new, MobCategory.CREATURE)
                            .sized(1.2f, 1.4f)
                            .build(new ResourceLocation(prelude.MODID, "dryosaurus").toString()));

    public static final RegistryObject<EntityType<YpupiaraEntity>> YPUPIARA =
            ENTITY_TYPES.register("ypupiara",
                    () -> EntityType.Builder.of(YpupiaraEntity::new, MobCategory.CREATURE)
                            .sized(0.86f, 1.1f)
                            .build(new ResourceLocation(prelude.MODID, "ypupiara").toString()));

    public static final RegistryObject<EntityType<TenontosaurusEntity>> TENONTOSAURUS =
            ENTITY_TYPES.register("tenontosaurus",
                    () -> EntityType.Builder.of(TenontosaurusEntity::new, MobCategory.CREATURE)
                            .sized(1.23f, 1.76f)
                            .build(new ResourceLocation(prelude.MODID, "tenontosaurus").toString()));

    public static final RegistryObject<EntityType<IrritatorEntity>> IRRITATOR =
            ENTITY_TYPES.register("irritator",
                    () -> EntityType.Builder.of(IrritatorEntity::new, MobCategory.CREATURE)
                            .sized(1.03f, 1.76f)
                            .build(new ResourceLocation(prelude.MODID, "irritator").toString()));

    public static final RegistryObject<EntityType<ProlibytheriumEntity>> PROLIBYTHERIUM =
            ENTITY_TYPES.register("prolibytherium",
                    () -> EntityType.Builder.of(ProlibytheriumEntity::new, MobCategory.CREATURE)
                            .sized(0.9f, 1.6f)
                            .build(new ResourceLocation(prelude.MODID, "prolibytherium").toString()));

    public static final RegistryObject<EntityType<EotriceratopsEntity>> EOTRICERATOPS =
            ENTITY_TYPES.register("eotriceratops",
                    () -> EntityType.Builder.of(EotriceratopsEntity::new, MobCategory.CREATURE)
                            .sized(2.2f, 3.8f)
                            .build(new ResourceLocation(prelude.MODID, "eotriceratops").toString()));

    public static final RegistryObject<EntityType<IncisivosaurusEntity>> INCISIVOSAURUS =
            ENTITY_TYPES.register("incisivosaurus",
                    () -> EntityType.Builder.of(IncisivosaurusEntity::new, MobCategory.CREATURE)
                            .sized(0.58f, 1.06f)
                            .build(new ResourceLocation(prelude.MODID, "incisivosaurus").toString()));

    public static final RegistryObject<EntityType<OrnithomimusEntity>> ORNITHOMIMUS =
            ENTITY_TYPES.register("ornithomimus",
                    () -> EntityType.Builder.of(OrnithomimusEntity::new, MobCategory.CREATURE)
                            .sized(0.75f, 1.8f)
                            .build(new ResourceLocation(prelude.MODID, "ornithomimus").toString()));

    public static final RegistryObject<EntityType<SilessaurusEntity>> SILESSAURUS =
            ENTITY_TYPES.register("silessaurus",
                    () -> EntityType.Builder.of(SilessaurusEntity::new, MobCategory.CREATURE)
                            .sized(0.65f, 0.93f)
                            .build(new ResourceLocation(prelude.MODID, "silessaurus").toString()));

    public static final RegistryObject<EntityType<DeinonychusEntity>> DEINONYCHUS =
            ENTITY_TYPES.register("deinonychus",
                    () -> EntityType.Builder.of(DeinonychusEntity::new, MobCategory.CREATURE)
                            .sized(0.65f, 1.05f)
                            .build(new ResourceLocation(prelude.MODID, "deinonychus").toString()));

    public static final RegistryObject<EntityType<SturgeonEntity>> STURGEON =
            ENTITY_TYPES.register("sturgeon",
                    () -> EntityType.Builder.of(SturgeonEntity::new, MobCategory.CREATURE)
                            .sized(1.2f, 0.6f)
                            .build(new ResourceLocation(prelude.MODID, "sturgeon").toString()));

    public static final RegistryObject<EntityType<ConodontaEntity>> CONODONTA =
            ENTITY_TYPES.register("conodonta",
                    () -> EntityType.Builder.of(ConodontaEntity::new, MobCategory.CREATURE)
                            .sized(0.6f, 0.3f)
                            .build(new ResourceLocation(prelude.MODID, "conodonta").toString()));

    public static final RegistryObject<EntityType<PrognathodonEntity>> PROGNATHODON =
            ENTITY_TYPES.register("prognathodon",
                    () -> EntityType.Builder.of(PrognathodonEntity::new, MobCategory.CREATURE)
                            .sized(2.85f, 1.8f)
                            .build(new ResourceLocation(prelude.MODID, "prognathodon").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
