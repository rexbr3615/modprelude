package net.rexbr.preludejurassika.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> FOSSIL_ORE_PLACED = PlacementUtils.register("fossil_ore_placed",
            ModConfiguredFeatures.FOSSIL_ORE, ModOrePlacement.commonOrePlacement(20, // VeinsPerChunk
                     HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(128))));

}
