package net.rexbr.preludejurassika.event;

import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rexbr.preludejurassika.entity.ModEntityTypes;
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
import net.rexbr.preludejurassika.recipes.AnalyzerRecipe;
import net.rexbr.preludejurassika.recipes.RessonatorRecipe;

@Mod.EventBusSubscriber(modid = prelude.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.JURAVENATOR.get(), JuravenatorEntity.setAttributes());
        event.put(ModEntityTypes.MIMODACTYLUS.get(), mimodactylusEntity.setAttributes());
        event.put(ModEntityTypes.ALBERTOSAURUS.get(), AlbertosaurusEntity.setAttributes());
        event.put(ModEntityTypes.AVACERATOPS.get(), AvaceratopsEntity.setAttributes());
        event.put(ModEntityTypes.PYRORAPTOR.get(), PyroraptorEntity.setAttributes());
        event.put(ModEntityTypes.AMAZONSAURUS.get(), AmazonsaurusEntity.setAttributes());
        event.put(ModEntityTypes.TORVOSAURUS.get(), TorvosaurusEntity.setAttributes());
        event.put(ModEntityTypes.PALEOLAMA.get(), PaleolamaMajorEntity.setAttributes());
        event.put(ModEntityTypes.DRYOSAURUS.get(), DryosaurusEntity.setAttributes());
        event.put(ModEntityTypes.YPUPIARA.get(), YpupiaraEntity.setAttributes());
        event.put(ModEntityTypes.TENONTOSAURUS.get(), TenontosaurusEntity.setAttributes());
        event.put(ModEntityTypes.IRRITATOR.get(), IrritatorEntity.setAttributes());
        event.put(ModEntityTypes.PROLIBYTHERIUM.get(), ProlibytheriumEntity.setAttributes());
        event.put(ModEntityTypes.EOTRICERATOPS.get(), EotriceratopsEntity.setAttributes());
        event.put(ModEntityTypes.INCISIVOSAURUS.get(), IncisivosaurusEntity.setAttributes());
        event.put(ModEntityTypes.ORNITHOMIMUS.get(), OrnithomimusEntity.setAttributes());
        event.put(ModEntityTypes.SILESSAURUS.get(), SilessaurusEntity.setAttributes());
        event.put(ModEntityTypes.DEINONYCHUS.get(), DeinonychusEntity.setAttributes());
        event.put(ModEntityTypes.STURGEON.get(), SturgeonEntity.setAttributes());
        event.put(ModEntityTypes.CONODONTA.get(), ConodontaEntity.setAttributes());
        event.put(ModEntityTypes.PROGNATHODON.get(), PrognathodonEntity.setAttributes());
        event.put(ModEntityTypes.GIGANOTOSAURUS.get(), GiganotosaurusEntity.setAttributes());
        event.put(ModEntityTypes.DILOPHOSAURUS.get(), DilophosaurusEntity.setAttributes());
        event.put(ModEntityTypes.PROTEROSUCHUS.get(), ProterosuchusEntity.setAttributes());
        event.put(ModEntityTypes.TIKTAALIK.get(), TiktaalikEntity.setAttributes());
        event.put(ModEntityTypes.ACHILOBATOR.get(), AchilobatorEntity.setAttributes());
        event.put(ModEntityTypes.TAPEJARA.get(), TapejaraEntity.setAttributes());
        event.put(ModEntityTypes.BAJADASAURUS.get(), BajadasaurusEntity.setAttributes());
        event.put(ModEntityTypes.ALLOSAURUS.get(), AlosaurusEntity.setAttributes());
        event.put(ModEntityTypes.DIABLOCERATOPS.get(), DiabloceratopsEntity.setAttributes());
        event.put(ModEntityTypes.ORODROMEUS.get(), OrodromeusEntity.setAttributes());
        event.put(ModEntityTypes.EOCARCHARIA.get(), EocarchariaEntity.setAttributes());
        event.put(ModEntityTypes.ARARIPESUCUS.get(), AraripesuchusEntity.setAttributes());
        event.put(ModEntityTypes.KAPROSUCHUS.get(), KaprosuchusEntity.setAttributes());
        event.put(ModEntityTypes.SUCHOMIMUS.get(), SuchoEntity.setAttributes());
        event.put(ModEntityTypes.HERRERASSAURUS.get(), HerreraEntity.setAttributes());
        event.put(ModEntityTypes.VELOCIRAPTOR.get(), VelociraptorEntity.setAttributes());
    }

    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, AnalyzerRecipe.Type.ID, AnalyzerRecipe.Type.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, RessonatorRecipe.Type.ID, RessonatorRecipe.Type.INSTANCE);
    }

}
