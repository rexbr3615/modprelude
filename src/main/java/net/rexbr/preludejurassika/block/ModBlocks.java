package net.rexbr.preludejurassika.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.block.common.*;
import net.rexbr.preludejurassika.item.ModCreativeModeTab;
import net.rexbr.preludejurassika.item.ModItems;
import net.rexbr.preludejurassika.prelude;

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

    public static final RegistryObject<Block> ZYGOPTERIS = registerBlock("zygopteris",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()), CreativeModeTab.TAB_SEARCH);

    public static final RegistryObject<Block> PLANT1 = registerBlock("plant1",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> POTTED_PLANT1 = registerBlockWithoutBlockItem("potted_plant1.json",
            () -> new FlowerPotBlock(null, ModBlocks.PLANT1,
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


    // ======================================= araucaria ==========================

    public static final RegistryObject<Block> ARAUCARIA_LOG = registerBlock("araucaria_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    public static final RegistryObject<Block> ARAUCARIA_WOOD = registerBlock("araucaria_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    public static final RegistryObject<Block> ARAUCARIA_PLANKS = registerBlock("araucaria_planks",
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
    public static final RegistryObject<Block> ARAUCARIA_DOOR = registerBlock("araucaria_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);
    public static final RegistryObject<Block> ARAUCARIA_TRAPDOOR = registerBlock("araucaria_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);


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