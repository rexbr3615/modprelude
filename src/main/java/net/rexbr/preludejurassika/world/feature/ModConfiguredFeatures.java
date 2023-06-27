package net.rexbr.preludejurassika.world.feature;

import com.google.common.collect.ImmutableList;
import net.minecraft.advancements.critereon.PlacedBlockTrigger;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.BiasedToBottomInt;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TrunkVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.registries.ForgeRegistryEntry;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.block.ModBlocks;
import net.rexbr.preludejurassika.config.PreludeCommonConfig;
import net.rexbr.preludejurassika.tech.block.TechBlocks;


import java.util.List;


public class ModConfiguredFeatures {
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_FOSSIL_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.FOSSIL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEP_FOSSIL_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TIN_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, TechBlocks.TIN_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TechBlocks.DEEPSLATED_TIN_ORE.get().defaultBlockState()));


    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_MARBLE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MARBLE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.MARBLE.get().defaultBlockState()));


    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> FOSSIL_ORE = FeatureUtils.register("fossil_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_FOSSIL_ORES, PreludeCommonConfig.FOSSIL_ORE_VEIN_SIZE.get())); //20

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TIN_ORE = FeatureUtils.register("tin_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_FOSSIL_ORES, PreludeCommonConfig.TIN_VEIN_SIZE.get())); //20


    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MARBLE_ORE = FeatureUtils.register("marble_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_MARBLE_ORES, PreludeCommonConfig.MARBLE_VEIN_SIZE.get())); //20


    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> CALAMITES_TREE =
            FeatureUtils.register("calamites", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.CALAMITES_LOG.get()),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.simple(ModBlocks.CALAMITES_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 7),

                    new TwoLayersFeatureSize(1, 0, 2)).build());


    public static final Holder<PlacedFeature> CALAMITES_CHECKED = PlacementUtils.register("calamites_checked", CALAMITES_TREE,
            PlacementUtils.filteredByBlockSurvival(ModBlocks.CALAMITES_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> CALAMITES_SPAWN =
            FeatureUtils.register("calamites_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(CALAMITES_CHECKED,
                            0.5F)), CALAMITES_CHECKED));





}
