package net.rexbr.preludejurassika.world;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;
import net.rexbr.preludejurassika.tech.block.TechBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class PetroilredsandFeature extends OreFeature {
    public static PetroilredsandFeature FEATURE = null;
    public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
    public static Holder<PlacedFeature> PLACED_FEATURE = null;

    public static Feature<?> feature() {
        FEATURE = new PetroilredsandFeature();
        CONFIGURED_FEATURE = FeatureUtils.register("prelude:petroilredsand", FEATURE, new OreConfiguration(PetroilredsandFeatureRuleTest.INSTANCE, TechBlocks.PETROILREDSAND.get().defaultBlockState(), 18));
        PLACED_FEATURE = PlacementUtils.register("prelude:petroilredsand", CONFIGURED_FEATURE,
                List.of(CountPlacement.of(8), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(28), VerticalAnchor.absolute(128)), BiomeFilter.biome()));
        return FEATURE;
    }

    public static Holder<PlacedFeature> placedFeature() {
        return PLACED_FEATURE;
    }

    public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("badlands"), new ResourceLocation("eroded_badlands"));
    private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

    public PetroilredsandFeature() {
        super(OreConfiguration.CODEC);
    }

    public boolean place(FeaturePlaceContext<OreConfiguration> context) {
        WorldGenLevel world = context.level();
        if (!generate_dimensions.contains(world.getLevel().dimension()))
            return false;
        return super.place(context);
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    private static class PetroilredsandFeatureRuleTest extends RuleTest {
        static final PetroilredsandFeatureRuleTest INSTANCE = new PetroilredsandFeatureRuleTest();
        private static final com.mojang.serialization.Codec<PetroilredsandFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
        private static final RuleTestType<PetroilredsandFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

        @SubscribeEvent
        public static void init(FMLCommonSetupEvent event) {
            Registry.register(Registry.RULE_TEST, new ResourceLocation("prelude:petroilredsand_match"), CUSTOM_MATCH);
        }

        private List<Block> base_blocks = null;

        public boolean test(BlockState blockAt, Random random) {
            if (base_blocks == null) {
                base_blocks = List.of(Blocks.RED_SAND);
            }
            return base_blocks.contains(blockAt.getBlock());
        }

        protected RuleTestType<?> getType() {
            return CUSTOM_MATCH;
        }
    }
}

