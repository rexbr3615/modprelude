package net.rexbr.preludejurassika;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.rexbr.preludejurassika.block.ModBlocks;
import net.rexbr.preludejurassika.block.TileEntity.ModBlockEntities;
import net.rexbr.preludejurassika.config.PreludeClientConfigs;
import net.rexbr.preludejurassika.config.PreludeCommonConfig;
import net.rexbr.preludejurassika.entity.ModEntityTypes;

import net.rexbr.preludejurassika.entity.client.*;

import net.rexbr.preludejurassika.entity.client.Allo.AllossaurusRenderer;
import net.rexbr.preludejurassika.entity.client.achilobator.AchilobatorRenderer;
import net.rexbr.preludejurassika.entity.client.bajada.BajadaRenderer;
import net.rexbr.preludejurassika.entity.client.conodonta.ConoRenderer;
import net.rexbr.preludejurassika.entity.client.deinonychus.DeinonychusRenderer;
import net.rexbr.preludejurassika.entity.client.diablo.DiabloRenderer;
import net.rexbr.preludejurassika.entity.client.dilophosaurus.DilophosaurusRenderer;
import net.rexbr.preludejurassika.entity.client.dryo.DryoRenderer;
import net.rexbr.preludejurassika.entity.client.eocarcharia.EocarchariaRenderer;
import net.rexbr.preludejurassika.entity.client.eotriceratops.EotriceratopsRenderer;
import net.rexbr.preludejurassika.entity.client.giganotosaurus.GiganotosaurusRenderer;
import net.rexbr.preludejurassika.entity.client.incisivosaurus.IncisivosaurusRenderer;
import net.rexbr.preludejurassika.entity.client.irritator.IrritatorRenderer;
import net.rexbr.preludejurassika.entity.client.juravenator.JuravenatorRenderer;


import net.rexbr.preludejurassika.entity.client.ornithomimus.OrnithomimusRenderer;
import net.rexbr.preludejurassika.entity.client.oro.OroRenderer;
import net.rexbr.preludejurassika.entity.client.paleolama.PaleoLamaRenderer;
import net.rexbr.preludejurassika.entity.client.prognathodon.PrognathodonRenderer;
import net.rexbr.preludejurassika.entity.client.prolibytherium.ProlibytheriumRenderer;
import net.rexbr.preludejurassika.entity.client.proterosuchus.ProterosuchusRenderer;
import net.rexbr.preludejurassika.entity.client.silessaurus.SilessaurusRenderer;
import net.rexbr.preludejurassika.entity.client.sturgeon.SturgeonRenderer;
import net.rexbr.preludejurassika.entity.client.tapejara.TapejaraRenderer;
import net.rexbr.preludejurassika.entity.client.teno.TenontosaurusRenderer;
import net.rexbr.preludejurassika.entity.client.tiktaalik.TiktaalikRenderer;
import net.rexbr.preludejurassika.entity.client.torvosaurus.TorvosaurusRenderer;
import net.rexbr.preludejurassika.entity.client.uraniasloanus.UraniasloanusRenderer;
import net.rexbr.preludejurassika.entity.client.ypupiara.YpupiaraRenderer;
import net.rexbr.preludejurassika.item.ModBones;
import net.rexbr.preludejurassika.item.ModItems;

import net.rexbr.preludejurassika.recipes.ModRecipes;
import net.rexbr.preludejurassika.screen.ModMenuTypes;
import net.rexbr.preludejurassika.screen.slots.*;
import net.rexbr.preludejurassika.sound.ModSounds;
import net.rexbr.preludejurassika.tech.TechEntities;
import net.rexbr.preludejurassika.tech.block.TechBlocks;
import net.rexbr.preludejurassika.tech.block.common.SeatRenderer;
import net.rexbr.preludejurassika.tech.items.TechItems;

import net.rexbr.preludejurassika.villager.ModVillagers;

import net.rexbr.preludejurassika.world.PreludeModFeatures;

import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(prelude.MODID)
public class prelude {

    public static final String MODID = "prelude";
    public static final preludeConfig CONFIG_OPTIONS = new preludeConfig();
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final boolean DEBUG = false;

    // add a comment
    public prelude() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // prelude stuff

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModBones.register(eventBus);
        ModEntityTypes.register(eventBus);
        ModSounds.register(eventBus);
        ModRecipes.register(eventBus);
        ModVillagers.register(eventBus);
        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        PreludeModFeatures.REGISTRY.register(eventBus);

        // tech stuffs

        TechItems.register(eventBus);
        TechBlocks.register(eventBus);
        TechEntities.REGISTER.register(eventBus);

        // test stuff



        // setup stuffs

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);


        // other

        GeckoLib.initialize();

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, PreludeClientConfigs.SPEC, "prelude-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, PreludeCommonConfig.SPEC, "prelude-common.toml");


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COOKSONIA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_COOKSONIA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CALAMITES_SAPLING2.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CALAMITES_TRAPDOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CALAMITES_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TechBlocks.SEAT2.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GINKGO_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GINKGO_TRAPDOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GINKGO_DOOR.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COMMON_FENCE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SWARTPUNTIA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENCRINUS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENCRINUS_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CALAMITES_LEAVES.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COOKSONIA_PLANT.get(), RenderType.cutout());

        EntityRenderers.register(ModEntityTypes.JURAVENATOR.get(), JuravenatorRenderer::new);
        EntityRenderers.register(ModEntityTypes.MIMODACTYLUS.get(), MimodactylusRenderer::new);
        EntityRenderers.register(ModEntityTypes.ALBERTOSAURUS.get(), AlbertosaurusRenderer::new);
        EntityRenderers.register(ModEntityTypes.AVACERATOPS.get(), AvaceratopsRenderer::new);
        EntityRenderers.register(ModEntityTypes.PYRORAPTOR.get(), PyroraptorRenderer::new);
        EntityRenderers.register(ModEntityTypes.AMAZONSAURUS.get(), AmazonsaurusRenderer::new);
        EntityRenderers.register(ModEntityTypes.TORVOSAURUS.get(), TorvosaurusRenderer::new);
        EntityRenderers.register(ModEntityTypes.PALEOLAMA.get(), PaleoLamaRenderer::new);
        EntityRenderers.register(ModEntityTypes.DRYOSAURUS.get(), DryoRenderer::new);
        EntityRenderers.register(ModEntityTypes.YPUPIARA.get(), YpupiaraRenderer::new);
        EntityRenderers.register(ModEntityTypes.TENONTOSAURUS.get(), TenontosaurusRenderer::new);
        EntityRenderers.register(ModEntityTypes.IRRITATOR.get(), IrritatorRenderer::new);
        EntityRenderers.register(ModEntityTypes.PROLIBYTHERIUM.get(), ProlibytheriumRenderer::new);
        EntityRenderers.register(ModEntityTypes.EOTRICERATOPS.get(), EotriceratopsRenderer::new);
        EntityRenderers.register(ModEntityTypes.INCISIVOSAURUS.get(), IncisivosaurusRenderer::new);
        EntityRenderers.register(ModEntityTypes.ORNITHOMIMUS.get(), OrnithomimusRenderer::new);
        EntityRenderers.register(ModEntityTypes.SILESSAURUS.get(), SilessaurusRenderer::new);
        EntityRenderers.register(ModEntityTypes.DEINONYCHUS.get(), DeinonychusRenderer::new);
        EntityRenderers.register(ModEntityTypes.STURGEON.get(), SturgeonRenderer::new);
        EntityRenderers.register(ModEntityTypes.CONODONTA.get(), ConoRenderer::new);
        EntityRenderers.register(ModEntityTypes.PROGNATHODON.get(), PrognathodonRenderer::new);
        EntityRenderers.register(ModEntityTypes.GIGANOTOSAURUS.get(), GiganotosaurusRenderer::new);
        EntityRenderers.register(ModEntityTypes.DILOPHOSAURUS.get(), DilophosaurusRenderer::new);
        EntityRenderers.register(ModEntityTypes.PROTEROSUCHUS.get(), ProterosuchusRenderer::new);
        EntityRenderers.register(ModEntityTypes.TIKTAALIK.get(), TiktaalikRenderer::new);
        EntityRenderers.register(ModEntityTypes.ACHILOBATOR.get(), AchilobatorRenderer::new);
        EntityRenderers.register(ModEntityTypes.TAPEJARA.get(), TapejaraRenderer::new);
        EntityRenderers.register(ModEntityTypes.BAJADASAURUS.get(), BajadaRenderer::new);
        EntityRenderers.register(ModEntityTypes.ALLOSAURUS.get(), AllossaurusRenderer::new);
        EntityRenderers.register(ModEntityTypes.DIABLOCERATOPS.get(), DiabloRenderer::new);
        EntityRenderers.register(ModEntityTypes.ORODROMEUS.get(), OroRenderer::new);
        EntityRenderers.register(ModEntityTypes.EOCARCHARIA.get(), EocarchariaRenderer::new);
        //EntityRenderers.register(ModEntityTypes.URANIASLOANUS.get(), UraniasloanusRenderer::new);
        EntityRenderers.register(TechEntities.SEAT.get(), SeatRenderer::new);

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANALYZER.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CULTURE_VAT.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RESSONATOR.get(), RenderType.translucent());

        MenuScreens.register(ModMenuTypes.ANALYZER_MENU.get(), AnalyzerScreen::new);
        MenuScreens.register(ModMenuTypes.CULTURE_MENU.get(), CultureScreen::new);
        MenuScreens.register(ModMenuTypes.CLEANER_MENU.get(), CleanerScreen::new);
        MenuScreens.register(ModMenuTypes.RESSONATOR_MENU.get(), RessonatorScreen::new);
        MenuScreens.register(ModMenuTypes.CRUSHER_MENU.get(), CrusherScreen::new);


    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.COOKSONIA.getId(), ModBlocks.POTTED_COOKSONIA);



//// normal spawn XD ////

            SpawnPlacements.register(ModEntityTypes.STURGEON.get(),
                    SpawnPlacements.Type.IN_WATER,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);


            ModVillagers.registerPOIs();



        });
    }


    
}