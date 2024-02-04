package net.rexbr.preludejurassika.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.entity.common.araripesuchus.AraripesuchusEntity;
import net.rexbr.preludejurassika.entity.common.giganotosaurus.GiganotosaurusEntity;
import net.rexbr.preludejurassika.entity.common.herrerassaurus.HerreraEntity;
import net.rexbr.preludejurassika.entity.common.incisivosaurus.IncisivosaurusEntity;
import net.rexbr.preludejurassika.entity.common.kaprosuchus.KaprosuchusEntity;
import net.rexbr.preludejurassika.entity.common.ornithomimus.OrnithomimusEntity;
import net.rexbr.preludejurassika.entity.common.paleolama.PaleolamaMajorEntity;
import net.rexbr.preludejurassika.entity.common.prolibytherium.ProlibytheriumEntity;
import net.rexbr.preludejurassika.entity.common.bajadasaurus.BajadasaurusEntity;
import net.rexbr.preludejurassika.entity.common.diabloceratops.DiabloceratopsEntity;
import net.rexbr.preludejurassika.entity.common.eotriceratops.EotriceratopsEntity;

import net.rexbr.preludejurassika.entity.common.achilobator.AchilobatorEntity;
import net.rexbr.preludejurassika.entity.common.albertosaurus.AlbertosaurusEntity;
import net.rexbr.preludejurassika.entity.common.allo.AlosaurusEntity;
import net.rexbr.preludejurassika.entity.common.amazonsaurus.AmazonsaurusEntity;
import net.rexbr.preludejurassika.entity.common.avaceratops.AvaceratopsEntity;
import net.rexbr.preludejurassika.entity.common.conodonta.ConodontaEntity;
import net.rexbr.preludejurassika.entity.common.deinonychus.DeinonychusEntity;
import net.rexbr.preludejurassika.entity.common.dilophosaurus.DilophosaurusEntity;
import net.rexbr.preludejurassika.entity.common.dryo.DryosaurusEntity;
import net.rexbr.preludejurassika.entity.common.eocarcharia.EocarchariaEntity;
import net.rexbr.preludejurassika.entity.common.irritator.IrritatorEntity;
import net.rexbr.preludejurassika.entity.common.juravenator.JuravenatorEntity;
import net.rexbr.preludejurassika.entity.common.mimodactylus.mimodactylusEntity;
import net.rexbr.preludejurassika.entity.common.orodromeus.OrodromeusEntity;
import net.rexbr.preludejurassika.entity.common.prognathodon.PrognathodonEntity;
import net.rexbr.preludejurassika.entity.common.proterosuchus.ProterosuchusEntity;
import net.rexbr.preludejurassika.entity.common.pyroraptor.PyroraptorEntity;
import net.rexbr.preludejurassika.entity.common.silessaurus.SilessaurusEntity;
import net.rexbr.preludejurassika.entity.common.sturgeon.SturgeonEntity;
import net.rexbr.preludejurassika.entity.common.suchomimus.SuchoEntity;
import net.rexbr.preludejurassika.entity.common.tapejara.TapejaraEntity;
import net.rexbr.preludejurassika.entity.common.tenontosaurus.TenontosaurusEntity;
import net.rexbr.preludejurassika.entity.common.tiktaalik.TiktaalikEntity;
import net.rexbr.preludejurassika.entity.common.torvosaurus.TorvosaurusEntity;
import net.rexbr.preludejurassika.entity.common.velociraptor.VelociraptorEntity;
import net.rexbr.preludejurassika.entity.common.ypupiara.YpupiaraEntity;
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
                            .sized(1.45f, 3.28f)
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
                            .sized(1.1f, 1.76f)
                            .build(new ResourceLocation(prelude.MODID, "irritator").toString()));

    public static final RegistryObject<EntityType<ProlibytheriumEntity>> PROLIBYTHERIUM =
            ENTITY_TYPES.register("prolibytherium",
                    () -> EntityType.Builder.of(ProlibytheriumEntity::new, MobCategory.CREATURE)
                            .sized(1.0f, 1.72f)
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

    public static final RegistryObject<EntityType<GiganotosaurusEntity>> GIGANOTOSAURUS =
            ENTITY_TYPES.register("giganothosaurus",
                    () -> EntityType.Builder.of(GiganotosaurusEntity::new, MobCategory.CREATURE)
                            .sized(2.85f, 4.6f)
                            .build(new ResourceLocation(prelude.MODID, "giganothosaurus").toString()));

    public static final RegistryObject<EntityType<DilophosaurusEntity>> DILOPHOSAURUS =
            ENTITY_TYPES.register("dilophosaurus",
                    () -> EntityType.Builder.of(DilophosaurusEntity::new, MobCategory.CREATURE)
                            .sized(1.6f, 2.23f)
                            .build(new ResourceLocation(prelude.MODID, "dilophosaurus").toString()));

    public static final RegistryObject<EntityType<ProterosuchusEntity>> PROTEROSUCHUS =
            ENTITY_TYPES.register("proterosuchus",
                    () -> EntityType.Builder.of(ProterosuchusEntity::new, MobCategory.CREATURE)
                            .sized(1.1f, 0.85f)
                            .build(new ResourceLocation(prelude.MODID, "proterosuchus").toString()));

    public static final RegistryObject<EntityType<TiktaalikEntity>> TIKTAALIK =
            ENTITY_TYPES.register("tiktaalik",
                    () -> EntityType.Builder.of(TiktaalikEntity::new, MobCategory.CREATURE)
                            .sized(1.1f, 0.85f)
                            .build(new ResourceLocation(prelude.MODID, "tiktaalik").toString()));

    public static final RegistryObject<EntityType<AchilobatorEntity>> ACHILOBATOR =
            ENTITY_TYPES.register("achilobator",
                    () -> EntityType.Builder.of(AchilobatorEntity::new, MobCategory.CREATURE)
                            .sized(0.86f, 1.82f)
                            .build(new ResourceLocation(prelude.MODID, "achilobator").toString()));

    public static final RegistryObject<EntityType<TapejaraEntity>> TAPEJARA =
            ENTITY_TYPES.register("tapejara",
                    () -> EntityType.Builder.of(TapejaraEntity::new, MobCategory.CREATURE)
                            .sized(0.86f, 0.86f)
                            .build(new ResourceLocation(prelude.MODID, "tapejara").toString()));

    public static final RegistryObject<EntityType<BajadasaurusEntity>> BAJADASAURUS =
            ENTITY_TYPES.register("bajadasaurus",
                    () -> EntityType.Builder.of(BajadasaurusEntity::new, MobCategory.CREATURE)
                            .sized(1.67f, 2.4f)
                            .build(new ResourceLocation(prelude.MODID, "bajadasaurus").toString()));

    public static final RegistryObject<EntityType<AlosaurusEntity>> ALLOSAURUS =
            ENTITY_TYPES.register("allosaurus",
                    () -> EntityType.Builder.of(AlosaurusEntity::new, MobCategory.CREATURE)
                            .sized(1.67f, 2.4f)
                            .build(new ResourceLocation(prelude.MODID, "allosaurus").toString()));

    public static final RegistryObject<EntityType<DiabloceratopsEntity>> DIABLOCERATOPS =
            ENTITY_TYPES.register("diabloceratops",
                    () -> EntityType.Builder.of(DiabloceratopsEntity::new, MobCategory.CREATURE)
                            .sized(1.67f, 2.4f)
                            .build(new ResourceLocation(prelude.MODID, "diabloceratops").toString()));

    public static final RegistryObject<EntityType<OrodromeusEntity>> ORODROMEUS =
            ENTITY_TYPES.register("orodromeus",
                    () -> EntityType.Builder.of(OrodromeusEntity::new, MobCategory.CREATURE)
                            .sized(0.3f, 0.5f)
                            .build(new ResourceLocation(prelude.MODID, "orodromeus").toString()));

    public static final RegistryObject<EntityType<EocarchariaEntity>> EOCARCHARIA =
            ENTITY_TYPES.register("eocarcharia",
                    () -> EntityType.Builder.of(EocarchariaEntity::new, MobCategory.CREATURE)
                            .sized(1.3f, 2.3f)
                            .build(new ResourceLocation(prelude.MODID, "eocarcharia").toString()));

    public static final RegistryObject<EntityType<AraripesuchusEntity>> ARARIPESUCUS =
            ENTITY_TYPES.register("araripesuchus",
                    () -> EntityType.Builder.of(AraripesuchusEntity::new, MobCategory.CREATURE)
                            .sized(0.68f, 0.5f)
                            .build(new ResourceLocation(prelude.MODID, "araripesuchus").toString()));

    public static final RegistryObject<EntityType<KaprosuchusEntity>> KAPROSUCHUS =
            ENTITY_TYPES.register("kaprosuchus",
                    () -> EntityType.Builder.of(KaprosuchusEntity::new, MobCategory.CREATURE)
                            .sized(1.1f, 0.8f)
                            .build(new ResourceLocation(prelude.MODID, "kaprosuchus").toString()));

    public static final RegistryObject<EntityType<SuchoEntity>> SUCHOMIMUS =
            ENTITY_TYPES.register("suchomimus",
                    () -> EntityType.Builder.of(SuchoEntity::new, MobCategory.CREATURE)
                            .sized(1.5f, 2.6f)
                            .build(new ResourceLocation(prelude.MODID, "suchomimus").toString()));

    public static final RegistryObject<EntityType<HerreraEntity>> HERRERASSAURUS =
            ENTITY_TYPES.register("herrerassaurus",
                    () -> EntityType.Builder.of(HerreraEntity::new, MobCategory.CREATURE)
                            .sized(1.2f, 1.9f)
                            .build(new ResourceLocation(prelude.MODID, "herrerassaurus").toString()));

    public static final RegistryObject<EntityType<VelociraptorEntity>> VELOCIRAPTOR =
            ENTITY_TYPES.register("velociraptor",
                    () -> EntityType.Builder.of(VelociraptorEntity::new, MobCategory.CREATURE)
                            .sized(1.2f, 1.9f)
                            .build(new ResourceLocation(prelude.MODID, "velociraptor").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
