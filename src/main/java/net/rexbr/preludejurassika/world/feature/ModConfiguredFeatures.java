package net.rexbr.preludejurassika.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.rexbr.preludejurassika.block.ModBlocks;
import net.rexbr.preludejurassika.config.PreludeCommonConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_FOSSIL_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.FOSSIL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEP_FOSSIL_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> FOSSIL_ORE = FeatureUtils.register("fossil_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_FOSSIL_ORES, PreludeCommonConfig.FOSSIL_ORE_VEIN_SIZE.get())); //20
}
