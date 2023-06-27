package net.rexbr.preludejurassika.tech.block;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.PipeBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.rexbr.preludejurassika.item.ModCreativeModeTab;
import net.rexbr.preludejurassika.item.ModItems;
import net.rexbr.preludejurassika.prelude;
import net.rexbr.preludejurassika.tech.block.common.*;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class TechBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, prelude.MODID);



    public static final RegistryObject<Block> SHELL = registerBlock("shell",
            () -> new ShellBlock(), ModCreativeModeTab.TECH_ITEMS);
    public static final RegistryObject<Block> PETROILSAND = registerBlock("petroilsand",
            () -> new PetroilsandBlock(), ModCreativeModeTab.TECH_ITEMS);
    public static final RegistryObject<Block> PETROILREDSAND = registerBlock("petroilredsand",
            () -> new PetroilredsandBlock(), ModCreativeModeTab.TECH_ITEMS);



    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.25f, 4.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.TECH_ITEMS);
    public static final RegistryObject<Block> DEEPSLATED_TIN_ORE = registerBlock("deepslated_tin_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.25f, 4.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.TECH_ITEMS);



    public static final RegistryObject<Block> SEAT1 = registerBlock("seat1",
            () -> new ChairLikeBlock_2(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(1.2f, 2.4f)), ModCreativeModeTab.TECH_ITEMS);

    public static final RegistryObject<Block> SEAT2 = registerBlock("seat2",
            () -> new SeatAllongableBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(1.2f, 2.4f)), ModCreativeModeTab.TECH_ITEMS);

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
