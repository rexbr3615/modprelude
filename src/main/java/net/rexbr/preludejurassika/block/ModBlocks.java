package net.rexbr.preludejurassika.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.block.common.*;
import net.rexbr.preludejurassika.block.plants.CooksoniaPlantBlock;
import net.rexbr.preludejurassika.item.ModCreativeModeTab;
import net.rexbr.preludejurassika.item.ModItems;
import net.rexbr.preludejurassika.prelude;
import net.rexbr.preludejurassika.world.feature.tree.CalamitesTreeGrower;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, prelude.MODID);

    public static final RegistryObject<Block> FOSSIL_ORE = registerBlock("fossil_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);


    public static final RegistryObject<Block> DEEP_FOSSIL_ORE = registerBlock("deep_fossil_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> ADOBE = registerBlock("adobe",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.25f, 4.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> COOKSONIA = registerBlock("cooksonia",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()), ModCreativeModeTab.PALEO_BOTANIC);

    public static final RegistryObject<Block> POTTED_COOKSONIA = registerBlockWithoutBlockItem("potted_cooksonia.json",
            () -> new FlowerPotBlock(null, ModBlocks.COOKSONIA,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }
    public static final RegistryObject<Block> ANALYZER = registerBlock("analyzer",
            () -> new AnalyzerBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    public static final RegistryObject<Block> CULTURE_VAT = registerBlock("culture_vat",
            () -> new CultureBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    public static final RegistryObject<Block> CLEANER = registerBlock("cleaner",
            () -> new CleanerBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    public static final RegistryObject<Block> RESSONATOR = registerBlock("dna_ressonator",
            () -> new DnaressonatorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);


    public static final RegistryObject<Block> PROTOTAXITES = registerBlock("prototaxites",
            () -> new SugarCaneBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE).randomTicks().dynamicShape()){

                @Override
                public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
                    BlockPos blockpos = pos.below();
                    BlockState groundState = worldIn.getBlockState(blockpos);
                    return groundState.is(this) || groundState.is(Blocks.SAND) || groundState.is(Blocks.RED_SAND) || groundState.is(Blocks.STONE)
                            || groundState.is(Blocks.MOSSY_COBBLESTONE) || groundState.is(Blocks.COBBLESTONE) || groundState.is(Blocks.GRANITE)
                            || groundState.is(Blocks.DIORITE) || groundState.is(Blocks.POLISHED_ANDESITE) || groundState.is(Blocks.DRIPSTONE_BLOCK)
                            || groundState.is(ModBlocks.ADOBE.get())

                            ;
                }

                @Override
                public void randomTick(BlockState blockstate, ServerLevel world, BlockPos blockpos, Random random) {
                    if (world.isEmptyBlock(blockpos.above())) {
                        int i = 1;
                        for (; world.getBlockState(blockpos.below(i)).is(this); ++i);
                        if (i < 7) {
                            int j = blockstate.getValue(AGE);
                            if (ForgeHooks.onCropsGrowPre(world, blockpos, blockstate, true)) {
                                if (j == 15) {
                                    world.setBlockAndUpdate(blockpos.above(), defaultBlockState());
                                    world.setBlock(blockpos, blockstate.setValue(AGE, 0), 4);
                                } else
                                    world.setBlock(blockpos, blockstate.setValue(AGE, j + 1), 4);
                            }
                        }
                    }
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 100;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
                    List<ItemStack> dropsOriginal = super.getDrops(state, builder);
                    if (!dropsOriginal.isEmpty())
                        return dropsOriginal;
                    return Collections.singletonList(new ItemStack(this, 1));
                }




            }, ModCreativeModeTab.PALEO_BOTANIC);


    //===============================trees===========================================


    public static final RegistryObject<Block> CALAMITES_LOG = registerBlock("calamites_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    public static final RegistryObject<Block> CALAMITES_WOOD = registerBlock("calamites_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    public static final RegistryObject<Block> STRIPPED_CALAMITES_LOG = registerBlock("stripped_calamites_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    public static final RegistryObject<Block> STRIPPED_CALAMITES_WOOD = registerBlock("stripped_calamites_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);


    public static final RegistryObject<Block> CALAMITES_PLANKS = registerBlock("calamites_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.FOSSIL_MOD_ITEMS);


    public static final RegistryObject<Block> CALAMITES_LEAVES = registerBlock("calamites_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.FOSSIL_MOD_ITEMS);


    public static final RegistryObject<Block> CALAMITES_SAPLING = registerBlock("calamites_sapling",
            () -> new SaplingBlock(new CalamitesTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.PALEO_BOTANIC);


    //==========================seeds=================================================


    public static final RegistryObject<Block> COOKSONIA_PLANT = registerBlockWithoutBlockItem("cooksonia_plant",
            () -> new CooksoniaPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));


    //========================decorations===============================================


    //==================================================================================

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}