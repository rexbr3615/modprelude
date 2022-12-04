package net.rexbr.preludejurassika.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.rexbr.preludejurassika.config.PreludeCommonConfig;

import java.util.List;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> FOSSIL_ORE_PLACED = PlacementUtils.register("fossil_ore_placed",
            ModConfiguredFeatures.FOSSIL_ORE, ModOrePlacement.commonOrePlacement(PreludeCommonConfig.FOSSIL_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk //20
                     HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(128)))); //-80 e 128


    public static final Holder<PlacedFeature> CALAMITES_PLACED = PlacementUtils.register("calamites_placed",
            ModConfiguredFeatures.CALAMITES_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));



}
