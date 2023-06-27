package net.rexbr.preludejurassika.world.gen;

import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.rexbr.preludejurassika.world.feature.ModPlacedFeatures;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.FOSSIL_ORE_PLACED);
        base.add(ModPlacedFeatures.TIN_ORE_PLACED);
        base.add(ModPlacedFeatures.MARBLE_ORE_PLACED);
    }
}
