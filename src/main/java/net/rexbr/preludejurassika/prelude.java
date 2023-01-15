package net.rexbr.preludejurassika;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import net.rexbr.preludejurassika.block.ModBlocks;
import net.rexbr.preludejurassika.block.TileEntity.ModBlockEntities;
import net.rexbr.preludejurassika.config.PreludeClientConfigs;
import net.rexbr.preludejurassika.config.PreludeCommonConfig;
import net.rexbr.preludejurassika.entity.ModEntityTypes;

import net.rexbr.preludejurassika.entity.client.*;

import net.rexbr.preludejurassika.entity.client.dryo.DryoRenderer;
import net.rexbr.preludejurassika.entity.client.eotriceratops.EotriceratopsRenderer;
import net.rexbr.preludejurassika.entity.client.incisivosaurus.IncisivosaurusRenderer;
import net.rexbr.preludejurassika.entity.client.irritator.IrritatorRenderer;
import net.rexbr.preludejurassika.entity.client.juravenator.JuravenatorRenderer;


import net.rexbr.preludejurassika.entity.client.ornithomimus.OrnithomimusRenderer;
import net.rexbr.preludejurassika.entity.client.paleolama.PaleoLamaRenderer;
import net.rexbr.preludejurassika.entity.client.prolibytherium.ProlibytheriumRenderer;
import net.rexbr.preludejurassika.entity.client.silessaurus.SilessaurusRenderer;
import net.rexbr.preludejurassika.entity.client.teno.TenontosaurusRenderer;
import net.rexbr.preludejurassika.entity.client.torvosaurus.TorvosaurusRenderer;
import net.rexbr.preludejurassika.entity.client.ypupiara.YpupiaraRenderer;
import net.rexbr.preludejurassika.item.ModItems;

import net.rexbr.preludejurassika.recipes.ModRecipes;
import net.rexbr.preludejurassika.screen.ModMenuTypes;
import net.rexbr.preludejurassika.screen.slots.AnalyzerScreen;
import net.rexbr.preludejurassika.screen.slots.CleanerScreen;
import net.rexbr.preludejurassika.screen.slots.CultureScreen;
import net.rexbr.preludejurassika.screen.slots.RessonatorScreen;
import net.rexbr.preludejurassika.sound.ModSounds;
import net.rexbr.preludejurassika.villager.ModVillagers;

import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;



// The value here should match an entry in the META-INF/mods.toml file
@Mod(prelude.MODID)
public class prelude {

    public static final String MODID = "prelude";
    public static final preludeConfig CONFIG_OPTIONS = new preludeConfig();
    private static final Logger LOGGER = LogUtils.getLogger();



    // add a comment
    public prelude() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModEntityTypes.register(eventBus);
        ModSounds.register(eventBus);

        ModRecipes.register(eventBus);
        ModVillagers.register(eventBus);

        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);


        GeckoLib.initialize();

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, PreludeClientConfigs.SPEC, "prelude-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, PreludeCommonConfig.SPEC, "prelude-common.toml");

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COOKSONIA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_COOKSONIA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CALAMITES_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CALAMITES_TRAPDOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CALAMITES_DOOR.get(), RenderType.translucent());

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

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANALYZER.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CULTURE_VAT.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RESSONATOR.get(), RenderType.translucent());

        MenuScreens.register(ModMenuTypes.ANALYZER_MENU.get(), AnalyzerScreen::new);
        MenuScreens.register(ModMenuTypes.CULTURE_MENU.get(), CultureScreen::new);
        MenuScreens.register(ModMenuTypes.CLEANER_MENU.get(), CleanerScreen::new);
        MenuScreens.register(ModMenuTypes.RESSONATOR_MENU.get(), RessonatorScreen::new);



    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.COOKSONIA.getId(), ModBlocks.POTTED_COOKSONIA);


            SpawnPlacements.register(ModEntityTypes.ALBERTOSAURUS.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);
            SpawnPlacements.register(ModEntityTypes.ORNITHOMIMUS.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);
            SpawnPlacements.register(ModEntityTypes.AVACERATOPS.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);
            SpawnPlacements.register(ModEntityTypes.AMAZONSAURUS.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);
            SpawnPlacements.register(ModEntityTypes.JURAVENATOR.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);
            SpawnPlacements.register(ModEntityTypes.PYRORAPTOR.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);
            SpawnPlacements.register(ModEntityTypes.PALEOLAMA.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);
            SpawnPlacements.register(ModEntityTypes.TORVOSAURUS.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);
            SpawnPlacements.register(ModEntityTypes.PROLIBYTHERIUM.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);
            SpawnPlacements.register(ModEntityTypes.IRRITATOR.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules);



            ModVillagers.registerPOIs();



        });
    }


}