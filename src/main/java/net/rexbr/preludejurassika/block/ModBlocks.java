package net.rexbr.preludejurassika.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
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
import net.rexbr.preludejurassika.block.plants.CooksoniaPlantBlock;
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

    public static final RegistryObject<Block> ADOBE = registerBlock("adobe",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.25f, 4.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.FOSSIL_MOD_ITEMS);

    public static final RegistryObject<Block> ZYGOPTERIS = registerBlock("zygopteris",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()), ModCreativeModeTab.PALEO_BOTANIC);

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


    //==========================seeds=================================================


    public static final RegistryObject<Block> COOKSONIA_PLANT = registerBlockWithoutBlockItem("cooksonia_plant",
            () -> new CooksoniaPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));


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