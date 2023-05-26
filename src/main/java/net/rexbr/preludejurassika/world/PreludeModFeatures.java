package net.rexbr.preludejurassika.world;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;
import net.rexbr.preludejurassika.prelude;


import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class PreludeModFeatures {
    public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, prelude.MODID);
    private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();

    public static final RegistryObject<Feature<?>> PETROILSAND = register("petroilsand", PetroilsandFeature::feature,
            new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PetroilsandFeature.GENERATE_BIOMES, PetroilsandFeature::placedFeature));
    public static final RegistryObject<Feature<?>> SHELL = register("shell", ShellFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, ShellFeature.GENERATE_BIOMES, ShellFeature::placedFeature));
    public static final RegistryObject<Feature<?>> PETROILREDSAND = register("petroilredsand", PetroilredsandFeature::feature,
            new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PetroilredsandFeature.GENERATE_BIOMES, PetroilredsandFeature::placedFeature));


    private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
        FEATURE_REGISTRATIONS.add(featureRegistration);
        return REGISTRY.register(registryname, feature);
    }

    @SubscribeEvent
    public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
        for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
            if (registration.biomes() == null || registration.biomes().contains(event.getName()))
                event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
        }
    }

    private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
    }
}
