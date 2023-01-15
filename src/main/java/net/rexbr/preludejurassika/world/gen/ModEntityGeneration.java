package net.rexbr.preludejurassika.world.gen;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ambient.AmbientCreature;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.rexbr.preludejurassika.config.PreludeCommonConfig;
import net.rexbr.preludejurassika.entity.ModEntityTypes;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ModEntityGeneration {
    public static void onEntitySpawn(final BiomeLoadingEvent event) {
        if (PreludeCommonConfig.dinosaurSpawning.get()) {

            addEntityToSpecificBiomes(event, ModEntityTypes.ALBERTOSAURUS.get(),
                    25, 1, 2, Biomes.BADLANDS, Biomes.PLAINS , Biomes.DESERT , Biomes.FOREST );

            addEntityToSpecificBiomes(event, ModEntityTypes.ORNITHOMIMUS.get(),
                    32, 1, 5, Biomes.BADLANDS,  Biomes.PLAINS , Biomes.FOREST);

            addEntityToSpecificBiomes(event, ModEntityTypes.JURAVENATOR.get(),
                    32, 1, 5, Biomes.PLAINS , Biomes.FOREST , Biomes.JUNGLE);

            addEntityToSpecificBiomes(event, ModEntityTypes.AVACERATOPS.get(),
                    32, 1, 5, Biomes.PLAINS,  Biomes.DESERT , Biomes.FOREST , Biomes.JUNGLE);

            addEntityToSpecificBiomes(event, ModEntityTypes.PYRORAPTOR.get(),
                    32, 1, 5, Biomes.BADLANDS,  Biomes.ERODED_BADLANDS , Biomes.FOREST , Biomes.ERODED_BADLANDS);

            addEntityToSpecificBiomes(event, ModEntityTypes.AMAZONSAURUS.get(),
                    32, 1, 5, Biomes.JUNGLE,  Biomes.PLAINS , Biomes.FOREST , Biomes.BAMBOO_JUNGLE);

            addEntityToSpecificBiomes(event, ModEntityTypes.PALEOLAMA.get(),
                    32, 1, 5, Biomes.DESERT,  Biomes.BADLANDS , Biomes.ERODED_BADLANDS , Biomes.SAVANNA , Biomes.SAVANNA_PLATEAU);

            addEntityToSpecificBiomes(event, ModEntityTypes.TORVOSAURUS.get(),
                    32, 1, 5, Biomes.BIRCH_FOREST,  Biomes.PLAINS , Biomes.FOREST , Biomes.JUNGLE);

            addEntityToSpecificBiomes(event, ModEntityTypes.PROLIBYTHERIUM.get(),
                    32, 1, 5, Biomes.SAVANNA,  Biomes.SAVANNA_PLATEAU , Biomes.WINDSWEPT_SAVANNA );

            addEntityToSpecificBiomes(event, ModEntityTypes.IRRITATOR.get(),
                    32, 1, 5, Biomes.SWAMP,  Biomes.RIVER );


        }
    }







    private static void addEntityToAllBiomesExceptThese(BiomeLoadingEvent event, EntityType<?> type,
                                                        int weight, int minCount, int maxCount, ResourceKey<Biome>... biomes) {
        // Goes through each entry in the biomes and sees if it matches the current biome we are loading
        boolean isBiomeSelected = Arrays.stream(biomes).map(ResourceKey::location)
                .map(Object::toString).anyMatch(s -> s.equals(event.getName().toString()));

        if(!isBiomeSelected) {
            addEntityToAllBiomes(event, type, weight, minCount, maxCount);
        }
    }

    @SafeVarargs
    private static void addEntityToSpecificBiomes(BiomeLoadingEvent event, EntityType<?> type,
                                                  int weight, int minCount, int maxCount, ResourceKey<Biome>... biomes) {
        // Goes through each entry in the biomes and sees if it matches the current biome we are loading
        boolean isBiomeSelected = Arrays.stream(biomes).map(ResourceKey::location)
                .map(Object::toString).anyMatch(s -> s.equals(event.getName().toString()));

        if(isBiomeSelected) {
            addEntityToAllBiomes(event, type, weight, minCount, maxCount);
        }
    }

    private static void addEntityToAllOverworldBiomes(BiomeLoadingEvent event, EntityType<?> type,
                                                      int weight, int minCount, int maxCount) {
        if(!event.getCategory().equals(Biome.BiomeCategory.THEEND) && !event.getCategory().equals(Biome.BiomeCategory.NETHER)) {
            addEntityToAllBiomes(event, type, weight, minCount, maxCount);
        }
    }

    private static void addEntityToAllBiomesNoNether(BiomeLoadingEvent event, EntityType<?> type,
                                                     int weight, int minCount, int maxCount) {
        if(!event.getCategory().equals(Biome.BiomeCategory.NETHER)) {
            List<MobSpawnSettings.SpawnerData> base = event.getSpawns().getSpawner(type.getCategory());
            base.add(new MobSpawnSettings.SpawnerData(type,weight, minCount, maxCount));
        }
    }

    private static void addEntityToAllBiomesNoEnd(BiomeLoadingEvent event, EntityType<?> type,
                                                  int weight, int minCount, int maxCount) {
        if(!event.getCategory().equals(Biome.BiomeCategory.THEEND)) {
            List<MobSpawnSettings.SpawnerData> base = event.getSpawns().getSpawner(type.getCategory());
            base.add(new MobSpawnSettings.SpawnerData(type,weight, minCount, maxCount));
        }
    }

    private static void addEntityToAllBiomes(BiomeLoadingEvent event, EntityType<?> type,
                                             int weight, int minCount, int maxCount) {
        List<MobSpawnSettings.SpawnerData> base = event.getSpawns().getSpawner(type.getCategory());
        base.add(new MobSpawnSettings.SpawnerData(type,weight, minCount, maxCount));
    }
}
