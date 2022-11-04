package net.rexbr.preludejurassika.item;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.entity.ModEntityTypes;
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
    public static final RegistryObject<Item> EMPTY_EGG = ITEMS.register("empty_eggy",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(16)));

    //misc

    public static final RegistryObject<Item> TOKEN = ITEMS.register("token",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    //dinossaurs fossils
    public static final RegistryObject<Item> FOSSIL_GENERIC = ITEMS.register("fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_JURA = ITEMS.register("jura_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_JURA_FOSSIL = ITEMS.register("cleaned_jura_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> FOSSIL_ALBERTOSAURUS = ITEMS.register("albertosaurus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_ALBERTOSAURUS_FOSSIL = ITEMS.register("cleaned_albertosaurus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> FOSSIL_AVACERATOPS = ITEMS.register("avaceratops_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_AVACERATOPS_FOSSIL = ITEMS.register("cleaned_avaceratops_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_PYRORAPTOR = ITEMS.register("pyro_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_PYRORAPTOR_FOSSIL = ITEMS.register("cleaned_pyro_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_AMAZONSAURUS = ITEMS.register("amazonsaurus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_AMAZONSAURUS_FOSSIL = ITEMS.register("cleaned_amazonsaurus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_TORVO = ITEMS.register("torvo_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_TORVO_FOSSIL = ITEMS.register("cleaned_torvo_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    //foods
    public static final RegistryObject<Item> DODO_RAW = ITEMS.register("raw_dodo",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(ModFoods.DODO_RAW)));
    public static final RegistryObject<Item> COOCKED_DODO = ITEMS.register("coocked_dodo",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(ModFoods.COOCKED_DODO)));

    //eggs

    //syringues and tube
    public static final RegistryObject<Item> SYRINGUE = ITEMS.register("syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> TUBE = ITEMS.register("tube",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    //spawn eggs
    public static final RegistryObject<Item> JURA_SPAWN_EGG = ITEMS.register("jura_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.JURAVENATOR,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> ALBERTOSAURUS_SPAWN_EGG = ITEMS.register("albertosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ALBERTOSAURUS,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> AVACERATOPS_SPAWN_EGG = ITEMS.register("avaceratops_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.AVACERATOPS,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> PYRORAPTOR_SPAWN_EGG = ITEMS.register("pyroraptor_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.PYRORAPTOR,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> AMAZONSAURUS_SPAWN_EGG = ITEMS.register("amazonsaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.AMAZONSAURUS,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> TORVOSAURUS_SPAWN_EGG = ITEMS.register("torvosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.TORVOSAURUS,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> PALEOLAMA_GESTATION_SYRINGUE = ITEMS.register("paleolama_gest_syringue",
            () -> new ForgeSpawnEggItem(ModEntityTypes.PALEOLAMA,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    //dna

    public static final RegistryObject<Item> JURA_DNA = ITEMS.register("jura_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> JURA_DISC = ITEMS.register("jura_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> JURA_SYRINGUE = ITEMS.register("jura_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> ALBERTOSAURUS_DNA = ITEMS.register("albertosaurus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> ALBERTOSAURUS_DISC = ITEMS.register("albertosaurus_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> ALBERTOSAURUS_SYRINGUE = ITEMS.register("albertosaurus_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> AVA_DNA = ITEMS.register("avaceratops_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> AVA_DISC = ITEMS.register("avaceratops_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> AVA_SYRINGUE = ITEMS.register("avaceratops_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> PYRO_DNA = ITEMS.register("pyro_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> PYRO_DISC = ITEMS.register("pyro_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> PYRO_SYRINGUE = ITEMS.register("pyro_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> AMAZONSAURUS_DNA = ITEMS.register("amazonsaurus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> AMAZONSAURUS_DISC = ITEMS.register("amazonsaurus_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> AMAZONSAURUS_SYRINGUE = ITEMS.register("amazonsaurus_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> TORVO_DNA = ITEMS.register("torvo_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> TORVO_DISC = ITEMS.register("torvo_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> TORVO_SYRINGUE = ITEMS.register("torvo_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    //weapons
    public static final RegistryObject<Item> FOSSIL_SWORD = ITEMS.register("fossil_sword",
            () -> new SwordItem(ModTiers.FOSSIL_GENERIC, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).durability(900)));
    public static final RegistryObject<Item> FOSSIL_AXE = ITEMS.register("fossil_axe",
            () -> new AxeItem(ModTiers.FOSSIL_GENERIC, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).durability(900)));

    public static final RegistryObject<Item> FOSSIS_PICKX = ITEMS.register("fossil_pickaxe", () -> new FossisPick());
    public static final RegistryObject<Item> FOSSIS_SHOV = ITEMS.register("fossil_shovel", () -> new FossisShov());
    public static final RegistryObject<Item> FOSSIS_HOE = ITEMS.register("fossil_hoe", () -> new FossisHoe());

    //guns

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
