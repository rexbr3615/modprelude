package net.rexbr.preludejurassika.item;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.entity.ModEntityTypes;
import net.rexbr.preludejurassika.item.Cryo.CryoDisc;
import net.rexbr.preludejurassika.item.Cryo.CryoDna;
import net.rexbr.preludejurassika.item.Cryo.CryoSyr;
import net.rexbr.preludejurassika.item.common.FossisHoe;
import net.rexbr.preludejurassika.item.common.FossisPick;
import net.rexbr.preludejurassika.item.common.FossisShov;
import net.rexbr.preludejurassika.prelude;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, prelude.MODID);

    // items
    public static final RegistryObject<Item> DISC_DRIVE = ITEMS.register("diskdrive",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> NUCLEOTIDES = ITEMS.register("unsaturated_nucleotides",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DNA_NUCLEOTIDES = ITEMS.register("dna_nucleotides",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> NUTRIENTS = ITEMS.register("nutrients",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> SALT_DUST = ITEMS.register("salty_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PETRI = ITEMS.register("petri",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PAINT_BRUSH = ITEMS.register("brusher",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).durability(32)));

    //dinossaurs fossils
    public static final RegistryObject<Item> FOSSIL = ITEMS.register("fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ACHILLO_FOSSIL = ITEMS.register("achillo_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_DODO_FOSSIL = ITEMS.register("cleaned_dodo_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_ACHILLO_FOSSIL = ITEMS.register("cleaned_achillo_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> FOSSIL_CRYO = ITEMS.register("cryo_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_CRYO_FOSSIL = ITEMS.register("cleaned_cryo_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> FOSSIL_PROTO = ITEMS.register("proto_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_PROTO_FOSSIL = ITEMS.register("cleaned_proto_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> FOSSIL_GALLI = ITEMS.register("galli_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_GALLI_FOSSIL = ITEMS.register("cleaned_galli_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> FOSSIL_JURA = ITEMS.register("jura_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_JURA_FOSSIL = ITEMS.register("cleaned_jura_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    //foods
    public static final RegistryObject<Item> DODO_RAW = ITEMS.register("raw_dodo",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.DODO_RAW)));
    public static final RegistryObject<Item> COOCKED_DODO = ITEMS.register("coocked_dodo",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.COOCKED_DODO)));

    //eggs

    //syringues and tube
    public static final RegistryObject<Item> SYRINGUE = ITEMS.register("syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> TUBE = ITEMS.register("tube",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    //spawn eggs
    public static final RegistryObject<Item> ACHILLOBATOR_SPAWN_EGG = ITEMS.register("achillobator_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ACHILLOBATOR,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DODO_SPAWN_EGG = ITEMS.register("dodo_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DODO,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> JURA_SPAWN_EGG = ITEMS.register("jura_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.JURAVENATOR,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> REX_SPAWN_EGG = ITEMS.register("trex_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.TREX,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> GIGA_SPAWN_EGG = ITEMS.register("giga_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GIGANOTOSAURUS,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CRYO_SPAWN_EGG = ITEMS.register("cryo_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CRYO,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> VELOGII_SPAWN_EGG = ITEMS.register("velociraptor2_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.VELOGII,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    //dna
    public static final RegistryObject<Item> DODO_DNA = ITEMS.register("dodo_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> DODO_DISC = ITEMS.register("dodo_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> DODO_SYRINGUE = ITEMS.register("dodo_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> ACHILLO_DNA = ITEMS.register("achillo_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> ACHILLO_DISC = ITEMS.register("achillo_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> ACHILLO_SYRINGUE = ITEMS.register("achillo_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> CRYO_DNA = ITEMS.register("cryo_dna", () -> new CryoDna());
    public static final RegistryObject<Item> CRYO_SYRINGUE = ITEMS.register("cryo_syringue", () -> new CryoSyr());
    public static final RegistryObject<Item> CRYO_DISC = ITEMS.register("cryo_disc", () -> new CryoDisc());

    public static final RegistryObject<Item> GALLI_DNA = ITEMS.register("galli_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> GALLI_DISC = ITEMS.register("galli_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> GALLI_SYRINGUE = ITEMS.register("galli_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> PROTO_DNA = ITEMS.register("protoceratops_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> PROTO_DISC = ITEMS.register("protoceratops_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> PROTO_SYRINGUE = ITEMS.register("protoceratops_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> JURA_DNA = ITEMS.register("jura_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> JURA_DISC = ITEMS.register("jura_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> JURA_SYRINGUE = ITEMS.register("jura_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    //weapons
    public static final RegistryObject<Item> FOSSIL_SWORD = ITEMS.register("fossil_sword",
            () -> new SwordItem(ModTiers.FOSSIL, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).durability(900)));
    public static final RegistryObject<Item> FOSSIL_AXE = ITEMS.register("fossil_axe",
            () -> new AxeItem(ModTiers.FOSSIL, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).durability(900)));

    public static final RegistryObject<Item> FOSSIS_PICKX = ITEMS.register("fossil_pickaxe", () -> new FossisPick());
    public static final RegistryObject<Item> FOSSIS_SHOV = ITEMS.register("fossil_shovel", () -> new FossisShov());
    public static final RegistryObject<Item> FOSSIS_HOE = ITEMS.register("fossil_hoe", () -> new FossisHoe());

    //guns

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
