package net.rexbr.preludejurassika.tech.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.item.ModCreativeModeTab;
import net.rexbr.preludejurassika.prelude;
import net.rexbr.preludejurassika.tech.items.common.BitumenItem;
import net.rexbr.preludejurassika.tech.items.common.CokeItem;
import net.rexbr.preludejurassika.tech.items.common.MiniAxeItem;

public class TechItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, prelude.MODID);


    public static final RegistryObject<Item> COKE = ITEMS.register("coke",
            () -> new CokeItem(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));

    public static final RegistryObject<Item> SAWDUST = ITEMS.register("sawdust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> BITUMEN = ITEMS.register("bitumen",
            () -> new BitumenItem(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));

    public static final RegistryObject<Item> SIFTED_ORE = ITEMS.register("sifted_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));

    public static final RegistryObject<Item> RAW_SULFUR = ITEMS.register("raw_sulphur",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> BIOMASS = ITEMS.register("biomass",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));

    public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> METAL_PLATE = ITEMS.register("metal_plate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> TITANIUM_PLATE = ITEMS.register("titanium_plate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));

    public static final RegistryObject<Item> SAW_BLADE = ITEMS.register("saw_blade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));


    // chemical

    public static final RegistryObject<Item> CALCIUM = ITEMS.register("calcium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> FLUORITE = ITEMS.register("fluorite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));

    // pc

    public static final RegistryObject<Item> CPU = ITEMS.register("cpu",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> RAM = ITEMS.register("ram",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> DRIVER = ITEMS.register("driver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> CIRCUIT = ITEMS.register("circuit",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));

    // othr

    public static final RegistryObject<Item> CESIUM = ITEMS.register("cesium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> COIL = ITEMS.register("coil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> ETHANOL = ITEMS.register("ethanol",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> LATEX = ITEMS.register("latex",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));
    public static final RegistryObject<Item> MINI_AXE = ITEMS.register("mini_axe",
            () -> new MiniAxeItem());
    public static final RegistryObject<Item> TAR = ITEMS.register("tar",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));

    // dusts

    public static final RegistryObject<Item> SILICA = ITEMS.register("silica",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS)));

    // gears

    // plates



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
