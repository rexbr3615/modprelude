package net.rexbr.preludejurassika.item;

import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.entity.ModEntityTypes;
import net.rexbr.preludejurassika.prelude;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, prelude.MODID);

    // items
    public static final RegistryObject<Item> FOSSIL = ITEMS.register("fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DISC_DRIVE = ITEMS.register("diskdrive",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    //foods
    public static final RegistryObject<Item> DODO_RAW = ITEMS.register("raw_dodo",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.DODO_RAW)));
    public static final RegistryObject<Item> COOCKED_DODO = ITEMS.register("coocked_dodo",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.COOCKED_DODO)));

    //eggs

    //syringues
    public static final RegistryObject<Item> SYRINGUE = ITEMS.register("syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    //spawn eggs
    public static final RegistryObject<Item> ACHILLOBATOR_SPAWN_EGG = ITEMS.register("achillobator_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ACHILLOBATOR,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DODO_SPAWN_EGG = ITEMS.register("dodo_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DODO,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    //dna
    public static final RegistryObject<Item> DODO_DNA = ITEMS.register("dodo_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> DODO_DISC = ITEMS.register("dodo_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> DODO_SYRINGUE = ITEMS.register("dodo_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    //weapons
    public static final RegistryObject<Item> FOSSIL_SWORD = ITEMS.register("fossil_sword",
            () -> new SwordItem(ModTiers.FOSSIL, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).durability(900)));
    public static final RegistryObject<Item> FOSSIL_PICKAXE = ITEMS.register("fossil_pickaxe",
            () -> new PickaxeItem(ModTiers.FOSSIL, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).durability(900)));
    public static final RegistryObject<Item> FOSSIL_SHOVEL = ITEMS.register("fossil_shovel",
            () -> new ShovelItem(ModTiers.FOSSIL, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).durability(900)));
    public static final RegistryObject<Item> FOSSIL_AXE = ITEMS.register("fossil_axe",
            () -> new AxeItem(ModTiers.FOSSIL, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).durability(900)));
    public static final RegistryObject<Item> FOSSIL_HOE = ITEMS.register("fossil_hoe",
            () -> new HoeItem(ModTiers.FOSSIL, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).durability(900)));

    //plants
    public static final RegistryObject<Item> plant1 = ITEMS.register("plant1",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
