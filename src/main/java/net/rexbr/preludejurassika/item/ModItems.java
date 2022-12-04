package net.rexbr.preludejurassika.item;

import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.block.ModBlocks;
import net.rexbr.preludejurassika.entity.ModEntityTypes;
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

    public static final RegistryObject<Item> PETRI_DISH_AGAR = ITEMS.register("petri_dish_agar",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> PETRI_DISH_PLANT_CELLS = ITEMS.register("petri_dish_plant_cells",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));
    public static final RegistryObject<Item> PLANT_CELLS = ITEMS.register("plant_cells",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));
    public static final RegistryObject<Item> BACTERIAS = ITEMS.register("bacterias",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> PAINT_BRUSH = ITEMS.register("brusher",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).durability(32)));

    public static final RegistryObject<Item> EMPTY_EGG = ITEMS.register("empty_eggy",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(16)));




    //misc
    public static final RegistryObject<Item> TOKEN = ITEMS.register("token",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> THAGOMIZER = ITEMS.register("thagomizer",
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

    public static final RegistryObject<Item> FOSSIL_PALEOLAMA = ITEMS.register("paleolama_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_PALEOLAMA_FOSSIL = ITEMS.register("cleaned_paleolama_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_DRYO = ITEMS.register("dryo_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_DRYO_FOSSIL = ITEMS.register("cleaned_dryo_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_YPUPIARA = ITEMS.register("ypupiara_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_YPUPIARA_FOSSIL = ITEMS.register("cleaned_ypupiara_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_TENONTOSAURUS = ITEMS.register("tenontosaurus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_TENONTOSAURUS_FOSSIL = ITEMS.register("cleaned_tenontosaurus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_MIMODACTYLUS = ITEMS.register("mimodactylus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_MIMODACTYLUS_FOSSIL = ITEMS.register("cleaned_mimodactylus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_IRRITATOR = ITEMS.register("irritator_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_IRRITATOR_FOSSIL = ITEMS.register("cleaned_irritator_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // plants stuff

    public static final RegistryObject<Item> FOSSIL_COOKSONIA = ITEMS.register("cooksonia_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC)));
    public static final RegistryObject<Item> COOKSONIA_DISC = ITEMS.register("cooksonia_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> COOKSONIA_CELLS = ITEMS.register("cooksonia_cells",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));
    public static final RegistryObject<Item> COOKSONIA_DNA = ITEMS.register("cooksonia_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));

    //foods
    public static final RegistryObject<Item> RAW_ALBERTOSAURUS_MEAT = ITEMS.register("raw_albertosaurus_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_ALBERTOSAURUS_MEAT)));
    public static final RegistryObject<Item> RAW_PYRORAPTOR_MEAT = ITEMS.register("raw_pyroraptor_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_PYRORAPTOR_MEAT)));
    public static final RegistryObject<Item> RAW_AMAZONSAURUS_MEAT = ITEMS.register("raw_amazonsaurus_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_AMAZONSAURUS_MEAT)));
    public static final RegistryObject<Item> RAW_AVACERATOPS_MEAT = ITEMS.register("raw_avaceratops_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_AVACERATOPS_MEAT)));
    public static final RegistryObject<Item> RAW_JURAVENATOR_MEAT = ITEMS.register("raw_juravenator_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_JURAVENATOR_MEAT)));
    public static final RegistryObject<Item> RAW_TORVOSAURUS_MEAT = ITEMS.register("raw_torvosaurus_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_TORVOSAURUS_MEAT)));
    public static final RegistryObject<Item> RAW_PALEOLAMA_MEAT = ITEMS.register("raw_paleolama_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_PALEOLAMA_MEAT)));
    public static final RegistryObject<Item> RAW_DRYOSAURUS_MEAT = ITEMS.register("raw_dryosaurus_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_DRYOSAURUS_MEAT)));
    public static final RegistryObject<Item> RAW_YPUPIARA_MEAT = ITEMS.register("raw_ypupiara_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_YPUPIARA_MEAT)));
    public static final RegistryObject<Item> RAW_TENONTOSAURUS_MEAT = ITEMS.register("raw_tenontosaurus_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_TENONTOSAURUS_MEAT)));
    public static final RegistryObject<Item> RAW_MIMODACTYLUS_MEAT = ITEMS.register("raw_mimodactylus_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_MIMODACTYLUS_MEAT)));
    public static final RegistryObject<Item> RAW_IRRITATOR_MEAT = ITEMS.register("raw_irritator_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_IRRITATOR_MEAT)));

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

    public static final RegistryObject<Item> DRYO_SPAWN_EGG = ITEMS.register("dryosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DRYOSAURUS,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> YPUPIARA_SPAWN_EGG = ITEMS.register("ypupiara_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.YPUPIARA,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> TENONTOSAURUS_SPAWN_EGG = ITEMS.register("tenontosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.TENONTOSAURUS,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> MIMODACTYLUS_SPAWN_EGG = ITEMS.register("mimodactylus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.MIMODACTYLUS,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> IRRITATOR_SPAWN_EGG = ITEMS.register("irritator_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.IRRITATOR,-1, -1,
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

    public static final RegistryObject<Item> PALEOLAMA_DNA = ITEMS.register("paleolama_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> PALEOLAMA_DISC = ITEMS.register("paleolama_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> PALEOLAMA_SYRINGUE = ITEMS.register("paleolama_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> DRYO_DNA = ITEMS.register("dryo_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> DRYO_DISC = ITEMS.register("dryo_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> DRYO_SYRINGUE = ITEMS.register("dryo_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> YPUPIARA_DNA = ITEMS.register("ypupiara_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> YPUPIARA_DISC = ITEMS.register("ypupiara_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> YPUPIARA_SYRINGUE = ITEMS.register("ypupiara_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> TENONTOSAURUS_DNA = ITEMS.register("tenontosaurus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> TENONTOSAURUS_DISC = ITEMS.register("tenontosaurus_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> TENONTOSAURUS_SYRINGUE = ITEMS.register("tenontosaurus_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> MIMODACTYLUS_DNA = ITEMS.register("mimodactylus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> MIMODACTYLUS_DISC = ITEMS.register("mimodactylus_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> MIMODACTYLUS_SYRINGUE = ITEMS.register("mimodactylus_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> IRRITATOR_DNA = ITEMS.register("irritator_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> IRRITATOR_DISC = ITEMS.register("irritator_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).durability(5)));
    public static final RegistryObject<Item> IRRITATOR_SYRINGUE = ITEMS.register("irritator_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    //seeds

    public static final RegistryObject<Item> COOKSONIA_SPORES = ITEMS.register("cooksonia_spores",
            () -> new ItemNameBlockItem(ModBlocks.COOKSONIA_PLANT.get(),
                    new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
