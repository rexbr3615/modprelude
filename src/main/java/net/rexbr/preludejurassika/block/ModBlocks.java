package net.rexbr.preludejurassika.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.BlockHitResult;
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
import net.rexbr.preludejurassika.procedurals.CalamitesTreeGrowing;

import net.rexbr.preludejurassika.procedurals.EncaseFossil;
import net.rexbr.preludejurassika.procedurals.GinkgoTreeGrowing;

import net.rexbr.preludejurassika.world.feature.tree.CalamitesTreeGrower;


import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, prelude.MODID);

    public static final RegistryObject<Block> FOSSIL_ORE = registerBlock("fossil_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()){

                @Override
                public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
                    super.use(blockstate, world, pos, entity, hand, hit);
                    int x = pos.getX();
                    int y = pos.getY();
                    int z = pos.getZ();
                    double hitX = hit.getLocation().x;
                    double hitY = hit.getLocation().y;
                    double hitZ = hit.getLocation().z;
                    Direction direction = hit.getDirection();

                    EncaseFossil.execute(world, x, y, z, entity);
                    return InteractionResult.SUCCESS;
                }


            }, ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> DEEP_FOSSIL_ORE = registerBlock("deep_fossil_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops()){

                @Override
                public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
                    super.use(blockstate, world, pos, entity, hand, hit);
                    int x = pos.getX();
                    int y = pos.getY();
                    int z = pos.getZ();
                    double hitX = hit.getLocation().x;
                    double hitY = hit.getLocation().y;
                    double hitZ = hit.getLocation().z;
                    Direction direction = hit.getDirection();

                    EncaseFossil.execute(world, x, y, z, entity);
                    return InteractionResult.SUCCESS;
                }

            }, ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> ENCHASED_FOSSIL = registerBlock("enchased_fossil",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> ADOBE = registerBlock("adobe",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.25f, 4.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    /*public static final RegistryObject<Block> VOLCANIC_ASH = registerBlock("volcanic_ash",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.25f, 4.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);*/

    public static final RegistryObject<Block> MARBLE = registerBlock("marble",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.45f, 4.6f).requiresCorrectToolForDrops()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> MARBLE_BRICKS = registerBlock("marble_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.45f, 4.6f).requiresCorrectToolForDrops()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> MARBLE_TILES = registerBlock("marble_tiles",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.45f, 4.6f).requiresCorrectToolForDrops()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> MARBLE_FLOOR = registerBlock("marble_floor",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.25f, 4.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> MARBLE_PILLAR = registerBlock("marble_pillar",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.25f, 4.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);



    public static final RegistryObject<Block> COOKSONIA = registerBlock("cooksonia",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> POTTED_COOKSONIA = registerBlockWithoutBlockItem("potted_cooksonia.json",
            () -> new FlowerPotBlock(null, ModBlocks.COOKSONIA,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));


    public static final RegistryObject<Block> ADOBE_BRICKS = registerBlock("adobe_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.25f, 4.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> ASFALT = registerBlock("asfalt",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.25f, 4.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);




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




            }, ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> SWARTPUNTIA = registerBlock("swartpuntia",
            () -> new BlockPreludeCustomWaterGrass(
                    BlockBehaviour.Properties.copy(Blocks.SEAGRASS).noOcclusion()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<GrowingPlantHeadBlock> ENCRINUS = registerBlock("encrinus",
            () -> new BlockKrethrossTop(BlockBehaviour.Properties.of(Material.WATER_PLANT)
                    .noCollission()
                    .randomTicks()
                    .instabreak()

                    .sound(SoundType.WET_GRASS)), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<GrowingPlantBlock> ENCRINUS_PLANT = registerBlock("encrinus_stem",
            () -> new BlockKrethross(BlockBehaviour.Properties.of(Material.WATER_PLANT)
                    .noCollission()
                    .randomTicks()
                    .instabreak()

                    .sound(SoundType.WET_GRASS)), ModCreativeModeTab.FOSSIL_MOD_ITEMS);



    //==tree==


    public static final RegistryObject<Block> CALAMITES_LOG = registerBlock("calamites_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    public static final RegistryObject<Block> CALAMITES_WOOD = registerBlock("calamites_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    /*public static final RegistryObject<Block> STRIPPED_CALAMITES_LOG = registerBlock("stripped_calamites_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    public static final RegistryObject<Block> STRIPPED_CALAMITES_WOOD = registerBlock("stripped_calamites_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);*/


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

    public static final RegistryObject<Block> CALAMITES_STAIRS = registerBlock("calamites_stairs",
            () -> new StairBlock(() -> ModBlocks.CALAMITES_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> CALAMITES_SLAB = registerBlock("calamites_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)
                    ), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> CALAMITES_FENCE = registerBlock("calamites_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                    ), ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    
    public static final RegistryObject<Block> CALAMITES_FENCE_GATE = registerBlock("calamites_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    ), ModCreativeModeTab.FOSSIL_MOD_ITEMS);


    public static final RegistryObject<Block> CALAMITES_BUTTON = registerBlock("calamites_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)
                    .noCollission()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> CALAMITES_PRESSURE_PLATE = registerBlock("calamites_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)
                    ), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> CALAMITES_DOOR = registerBlock("calamites_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .noOcclusion()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    public static final RegistryObject<Block> CALAMITES_TRAPDOOR = registerBlock("calamites_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)
                    .noOcclusion()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    

    public static final RegistryObject<Block> CALAMITES_SAPLING = registerBlock("calamites_sapling",
            () -> new SaplingBlock(new CalamitesTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> CALAMITES_SAPLING2 = registerBlock("calamites_sapling1",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8,
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).noOcclusion().noCollission().instabreak()){


                @Override
                public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
                    super.onPlace(blockstate, world, pos, oldState, moving);
                    CalamitesTreeGrowing.execute(world, pos.getX(), pos.getY(), pos.getZ());
                }



            }, ModCreativeModeTab.FOSSIL_MOD_ITEMS);






    public static final RegistryObject<Block> GINKGO_LOG = registerBlock("ginkgo_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    public static final RegistryObject<Block> GINKGO_WOOD = registerBlock("ginkgo_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    public static final RegistryObject<Block> GINKGO_PLANKS = registerBlock("ginkgo_planks",
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
    public static final RegistryObject<Block> GINKGO_LEAVES = registerBlock("ginkgo_leaves",
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
    public static final RegistryObject<Block> GINKGO_LEAVES_FRUIT = registerBlock("ginkgo_leaves_fruit",
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

    public static final RegistryObject<Block> GINKGO_STAIRS = registerBlock("ginkgo_stairs",
            () -> new StairBlock(() -> ModBlocks.CALAMITES_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> GINKGO_SLAB = registerBlock("ginkgo_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)
            ), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> GINKGO_FENCE = registerBlock("ginkgo_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
            ), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> GINKGO_FENCE_GATE = registerBlock("ginkgo_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
            ), ModCreativeModeTab.FOSSIL_MOD_ITEMS);


    public static final RegistryObject<Block> GINKGO_BUTTON = registerBlock("ginkgo_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)
                    .noCollission()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> GINKGO_PRESSURE_PLATE = registerBlock("ginkgo_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)
            ), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> GINKGO_DOOR = registerBlock("ginkgo_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .noOcclusion()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    public static final RegistryObject<Block> GINKGO_TRAPDOOR = registerBlock("ginkgo_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)
                    .noOcclusion()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);


    public static final RegistryObject<Block> GINKGO_SAPLING = registerBlock("ginkgo_sapling",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion().noCollission().instabreak()){


                @Override
                public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
                    super.onPlace(blockstate, world, pos, oldState, moving);
                    GinkgoTreeGrowing.execute(world, pos.getX(), pos.getY(), pos.getZ());
                }



            }, ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    //==========================seeds=================================================


    public static final RegistryObject<Block> COOKSONIA_PLANT = registerBlockWithoutBlockItem("cooksonia_plant",
            () -> new CooksoniaPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));


    //========================decorations===============================================

    public static final RegistryObject<Block> COMMON_FENCE = registerBlock("common_fence",
            () -> new common_fence(),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);



    //==================================================================================



    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });
    }

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