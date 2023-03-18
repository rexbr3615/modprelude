package net.rexbr.preludejurassika.item;

import net.minecraft.world.item.*;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.block.ModBlocks;
import net.rexbr.preludejurassika.entity.ModEntityTypes;
import net.rexbr.preludejurassika.item.common.ItemModFishBucket;
import net.rexbr.preludejurassika.item.items.*;
import net.rexbr.preludejurassika.prelude;

import java.util.function.Supplier;

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

    public static final RegistryObject<Item> PLASTER = ITEMS.register("plaster",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> COMPUTER_SCREEN = ITEMS.register("computer_screen",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> COMPUTER_MODULES = ITEMS.register("computer_modules",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FENCE_WIRE = ITEMS.register("fence_wire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> PYRORAPTOR_FEATHER = ITEMS.register("pyroraptor_feather",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> SALINIZED_BONE = ITEMS.register("salinized_bone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> RAW_MARBLE = ITEMS.register("raw_marble",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    //misc
    public static final RegistryObject<Item> TOKEN = ITEMS.register("token",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> THAGOMIZER = ITEMS.register("thagomizer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> ANCIENT_SWORD = ITEMS.register("ancient_sword",
            AncientSword::new);
    public static final RegistryObject<Item> ANCIENT_HOE = ITEMS.register("ancient_hoe",
            AncientHoe::new);
    public static final RegistryObject<Item> ANCIENT_AXE = ITEMS.register("ancient_axe",
            AncientAxe::new);
    public static final RegistryObject<Item> ANCIENT_SHOVEL = ITEMS.register("ancient_shovel",
            AncientShovel::new);
    public static final RegistryObject<Item> ANCIENT_PICKAXE = ITEMS.register("ancient_pickaxe",
            AncientPick::new);

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

    public static final RegistryObject<Item> FOSSIL_PROLIBYTHERIUM = ITEMS.register("prolibytherium_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_PROLIBYTHERIUM_FOSSIL = ITEMS.register("cleaned_prolibytherium_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_INCISIVOSAURUS = ITEMS.register("incisivosaurus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_INCISIVOSAURUS_FOSSIL = ITEMS.register("cleaned_incisivosaurus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_EOTRICERATOPS = ITEMS.register("eotriceratops_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_EOTRICERATOPS_FOSSIL = ITEMS.register("cleaned_eotriceratops_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_SILESSAURUS = ITEMS.register("silessaurus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_SILESSAURUS_FOSSIL = ITEMS.register("cleaned_silessaurus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_ORNITHOMIMUS = ITEMS.register("ornithomimus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_ORNITHOMIMUS_FOSSIL = ITEMS.register("cleaned_ornithomimus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_DEINONYCHUS = ITEMS.register("deinonychus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_DEINONYCHUS_FOSSIL = ITEMS.register("cleaned_deinonychus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_STURGEON = ITEMS.register("sturgeon_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_STURGEON_FOSSIL = ITEMS.register("cleaned_sturgeon_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_CONODONTA= ITEMS.register("conodonta_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_CONODONTA_FOSSIL = ITEMS.register("cleaned_conodonta_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_PROGNATHODON = ITEMS.register("prognathodon_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_PROGNATHODON_FOSSIL = ITEMS.register("cleaned_prognathodon_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_GIGANOTHOSAURUS = ITEMS.register("giganothosaurus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_GIGANOTHOSAURUS_FOSSIL = ITEMS.register("cleaned_giganothosaurus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_DILOPHOSAURUS = ITEMS.register("dilophosaurus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_DILOPHOSAURUS_FOSSIL = ITEMS.register("cleaned_dilophosaurus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_PROTEROSUCHUS = ITEMS.register("proterosuchus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_PROTEROSUCHUS_FOSSIL = ITEMS.register("cleaned_proterosuchus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_TIKTAALIK = ITEMS.register("tiktaalik_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_TIKTAALIK_FOSSIL = ITEMS.register("cleaned_tiktaalik_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> FOSSIL_ACHILOBATOR = ITEMS.register("achilobator_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> CLEANED_ACHILOBATOR_FOSSIL = ITEMS.register("cleaned_achilobator_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // plants stuff

    public static final RegistryObject<Item> FOSSIL_COOKSONIA = ITEMS.register("cooksonia_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC)));
    public static final RegistryObject<Item> COOKSONIA_DISC = ITEMS.register("cooksonia_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));
    public static final RegistryObject<Item> COOKSONIA_CELLS = ITEMS.register("cooksonia_cells",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));
    public static final RegistryObject<Item> COOKSONIA_DNA = ITEMS.register("cooksonia_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));

    public static final RegistryObject<Item> FOSSIL_PROTOTAXITES = ITEMS.register("prototaxites_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC)));
    public static final RegistryObject<Item> PROTOTAXITES_DISC = ITEMS.register("prototaxites_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));
    public static final RegistryObject<Item> PROTOTAXITES_CELLS = ITEMS.register("prototaxites_cells",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));
    public static final RegistryObject<Item> PROTOTAXITES_DNA = ITEMS.register("prototaxites_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));

    public static final RegistryObject<Item> FOSSIL_SWARTPUNTIA = ITEMS.register("swartpuntia_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC)));
    public static final RegistryObject<Item> SWARTPUNTIA_DISC = ITEMS.register("swartpuntia_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));
    public static final RegistryObject<Item> SWARTPUNTIA_CELLS = ITEMS.register("swartpuntia_cells",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));
    public static final RegistryObject<Item> SWARTPUNTIA_DNA = ITEMS.register("swartpuntia_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));

    public static final RegistryObject<Item> FOSSIL_ENCRINUS = ITEMS.register("encrinus_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC)));
    public static final RegistryObject<Item> ENCRINUS_DISC = ITEMS.register("encrinus_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));
    public static final RegistryObject<Item> ENCRINUS_CELLS = ITEMS.register("encrinus_cells",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));
    public static final RegistryObject<Item> ENCRINUS_DNA = ITEMS.register("encrinus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));

    public static final RegistryObject<Item> FOSSIL_CALAMITES = ITEMS.register("calamites_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC)));
    public static final RegistryObject<Item> CALAMITES_DISC = ITEMS.register("calamites_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));
    public static final RegistryObject<Item> CALAMITES_CELLS = ITEMS.register("calamites_cells",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));
    public static final RegistryObject<Item> CALAMITES_DNA = ITEMS.register("calamites_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));

    public static final RegistryObject<Item> FOSSIL_GINKGO = ITEMS.register("ginkgo_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC)));
    public static final RegistryObject<Item> GINKGO_DISC = ITEMS.register("ginkgo_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));
    public static final RegistryObject<Item> GINKGO_CELLS = ITEMS.register("ginkgo_cells",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC).stacksTo(1)));
    public static final RegistryObject<Item> GINKGO_DNA = ITEMS.register("ginkgo_dna",
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
    public static final RegistryObject<Item> RAW_PROLIBYTHERIUM_MEAT = ITEMS.register("raw_prolibytherium_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_PROLIBYTHERIUM_MEAT)));
    public static final RegistryObject<Item> RAW_EOTRICERATOPS_MEAT = ITEMS.register("raw_eotriceratops_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_EOTRICERATOPS_MEAT)));
    public static final RegistryObject<Item> RAW_INCISIVOSAURUS_MEAT = ITEMS.register("raw_incisivosaurus_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_INCISIVOSAURUS_MEAT)));
    public static final RegistryObject<Item> RAW_ORNITHOMIMUS_MEAT = ITEMS.register("raw_ornithomimus_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_ORNITHOMIMUS_MEAT)));
    public static final RegistryObject<Item> RAW_SILESSAURUS_MEAT = ITEMS.register("raw_silessaurus_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_SILESSAURUS_MEAT)));
    public static final RegistryObject<Item> RAW_DEINONYCHUS_MEAT = ITEMS.register("raw_deinonychus_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_DEINONYCHUS_MEAT)));
    public static final RegistryObject<Item> RAW_GIGANOTHOSAURUS_MEAT = ITEMS.register("raw_giganothosaurus_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_GIGANOTHOSAURUS_MEAT)));
    public static final RegistryObject<Item> RAW_DILOPHOSAURUS_MEAT = ITEMS.register("raw_dilophosaurus_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_DILOPHOSAURUS_MEAT)));
    public static final RegistryObject<Item> RAW_PROTEROSUCHUS_MEAT = ITEMS.register("raw_proterosuchus_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_PROTEROSUCHUS_MEAT)));
    public static final RegistryObject<Item> RAW_TIKTAALIK_MEAT = ITEMS.register("raw_tiktaalik_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_TIKTAALIK_MEAT)));
    public static final RegistryObject<Item> RAW_ACHILOBATOR_MEAT = ITEMS.register("raw_achilobator_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_ACHILOBATOR_MEAT)));



    public static final RegistryObject<Item> STURGEON_MEAT = ITEMS.register("sturgeon_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.STURGEON_MEAT)));
    public static final RegistryObject<Item> CONODONTA_MEAT = ITEMS.register("conodonta_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.CONODONTA_MEAT)));

    public static final RegistryObject<Item> FISH_COOCKED_MEAT = ITEMS.register("fish_coocked_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.FISH_COOCKED_MEAT)));

    public static final RegistryObject<Item> RAW_PROGNATHODON_MEAT = ITEMS.register("raw_prognathodon_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.RAW_PROGNATHODON_MEAT)));


    public static final RegistryObject<Item> GINKGO_NUTS = ITEMS.register("ginkgo_nuts",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.GINKGO_NUTS)));
    public static final RegistryObject<Item> CAVIAR = ITEMS.register("caviar",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.CAVIAR)));
    public static final RegistryObject<Item> DINO_BEEF = ITEMS.register("dinosaur_beef",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).food(ModFoods.DINO_BEEF)));

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

    public static final RegistryObject<Item> PROLIBYTHERIUM_GESTATION_SYRINGUE = ITEMS.register("prolibytherium_gest_syringue",
            () -> new ForgeSpawnEggItem(ModEntityTypes.PROLIBYTHERIUM,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> EOTRICERATOPS_SPAWN_EGG = ITEMS.register("eotriceratops_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.EOTRICERATOPS,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> INCISIVOSAURUS_SPAWN_EGG = ITEMS.register("incisivosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.INCISIVOSAURUS,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> ORNITHOMIMUS_SPAWN_EGG = ITEMS.register("ornithomimus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ORNITHOMIMUS,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> SILESSAURUS_SPAWN_EGG = ITEMS.register("silessaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SILESSAURUS,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> DEINONYCHUS_SPAWN_EGG = ITEMS.register("deinonychus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DEINONYCHUS,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> STURGEON_SPAWN_EGG = ITEMS.register("sturgeon_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.STURGEON,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> CONODONTA_SPAWN_EGG = ITEMS.register("conodonta_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CONODONTA,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> PROGNATHODON_SPAWN_EGG = ITEMS.register("prognathodon_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.PROGNATHODON,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> GIGANOTHOSAURUS_SPAWN_EGG = ITEMS.register("giganothosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GIGANOTOSAURUS,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> DILOPHOSAURUS_SPAWN_EGG = ITEMS.register("dilophosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DILOPHOSAURUS,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> PROTEROSUCHUS_SPAWN_EGG = ITEMS.register("proterosuchus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.PROTEROSUCHUS,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> TIKTAALIK_SPAWN_EGG = ITEMS.register("tiktaalik_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.TIKTAALIK,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));

    public static final RegistryObject<Item> ACHILOBATOR_SPAWN_EGG = ITEMS.register("achilobator_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ACHILOBATOR,-1, -1,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));


    // buckets

    public static final RegistryObject<Item> STURGEON_BUCKET = ITEMS.register("sturgeon_bucket",
            () -> new ItemModFishBucket(ModEntityTypes.STURGEON, Fluids.WATER,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> CONODONTA_BUCKET = ITEMS.register("conodonta_bucket",
            () -> new ItemModFishBucket(ModEntityTypes.CONODONTA, Fluids.WATER,
                    new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));


    //dna

    public static final RegistryObject<Item> JURA_DNA = ITEMS.register("jura_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> JURA_DISC = ITEMS.register("jura_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> JURA_SYRINGUE = ITEMS.register("jura_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> ALBERTOSAURUS_DNA = ITEMS.register("albertosaurus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> ALBERTOSAURUS_DISC = ITEMS.register("albertosaurus_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> ALBERTOSAURUS_SYRINGUE = ITEMS.register("albertosaurus_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> AVA_DNA = ITEMS.register("avaceratops_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> AVA_DISC = ITEMS.register("avaceratops_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> AVA_SYRINGUE = ITEMS.register("avaceratops_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> PYRO_DNA = ITEMS.register("pyro_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> PYRO_DISC = ITEMS.register("pyro_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> PYRO_SYRINGUE = ITEMS.register("pyro_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> AMAZONSAURUS_DNA = ITEMS.register("amazonsaurus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> AMAZONSAURUS_DISC = ITEMS.register("amazonsaurus_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> AMAZONSAURUS_SYRINGUE = ITEMS.register("amazonsaurus_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> TORVO_DNA = ITEMS.register("torvo_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> TORVO_DISC = ITEMS.register("torvo_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> TORVO_SYRINGUE = ITEMS.register("torvo_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> PALEOLAMA_DNA = ITEMS.register("paleolama_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> PALEOLAMA_DISC = ITEMS.register("paleolama_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> PALEOLAMA_SYRINGUE = ITEMS.register("paleolama_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> DRYO_DNA = ITEMS.register("dryo_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> DRYO_DISC = ITEMS.register("dryo_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> DRYO_SYRINGUE = ITEMS.register("dryo_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> YPUPIARA_DNA = ITEMS.register("ypupiara_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> YPUPIARA_DISC = ITEMS.register("ypupiara_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> YPUPIARA_SYRINGUE = ITEMS.register("ypupiara_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> TENONTOSAURUS_DNA = ITEMS.register("tenontosaurus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> TENONTOSAURUS_DISC = ITEMS.register("tenontosaurus_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> TENONTOSAURUS_SYRINGUE = ITEMS.register("tenontosaurus_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> MIMODACTYLUS_DNA = ITEMS.register("mimodactylus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> MIMODACTYLUS_DISC = ITEMS.register("mimodactylus_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> MIMODACTYLUS_SYRINGUE = ITEMS.register("mimodactylus_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> IRRITATOR_DNA = ITEMS.register("irritator_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> IRRITATOR_DISC = ITEMS.register("irritator_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> IRRITATOR_SYRINGUE = ITEMS.register("irritator_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> PROLIBYTHERIUM_DNA = ITEMS.register("prolibytherium_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> PROLIBYTHERIUM_DISC = ITEMS.register("prolibytherium_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> PROLIBYTHERIUM_SYRINGUE = ITEMS.register("prolibytherium_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> EOTRICERATOPS_DNA = ITEMS.register("eotriceratops_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> EOTRICERATOPS_DISC = ITEMS.register("eotriceratops_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> EOTRICERATOPS_SYRINGUE = ITEMS.register("eotriceratops_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> INCISIVOSAURUS_DNA = ITEMS.register("incisivosaurus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> INCISIVOSAURUS_DISC = ITEMS.register("incisivosaurus_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> INCISIVOSAURUS_SYRINGUE = ITEMS.register("incisivosaurus_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> ORNITHOMIMUS_DNA = ITEMS.register("ornithomimus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> ORNITHOMIMUS_DISC = ITEMS.register("ornithomimus_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> ORNITHOMIMUS_SYRINGUE = ITEMS.register("ornithomimus_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> SILESSAURUS_DNA = ITEMS.register("silessaurus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> SILESSAURUS_DISC = ITEMS.register("silessaurus_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> SILESSAURUS_SYRINGUE = ITEMS.register("silessaurus_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> DEINONYCHUS_DNA = ITEMS.register("deinonychus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> DEINONYCHUS_DISC = ITEMS.register("deinonychus_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> DEINONYCHUS_SYRINGUE = ITEMS.register("deinonychus_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> STURGEON_DNA = ITEMS.register("sturgeon_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> STURGEON_DISC = ITEMS.register("sturgeon_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> STURGEON_SYRINGUE = ITEMS.register("sturgeon_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> CONODONTA_DNA = ITEMS.register("conodonta_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> CONODONTA_DISC = ITEMS.register("conodonta_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> CONODONTA_SYRINGUE = ITEMS.register("conodonta_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

        public static final RegistryObject<Item> PROGNATHODON_DNA = ITEMS.register("prognathodon_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> PROGNATHODON_DISC = ITEMS.register("prognathodon_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> PROGNATHODON_SYRINGUE = ITEMS.register("prognathodon_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> GIGANOTHOSAURUS_DNA = ITEMS.register("giganothosaurus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> GIGANOTHOSAURUS_DISC = ITEMS.register("giganothosaurus_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> GIGANOTHOSAURUS_SYRINGUE = ITEMS.register("giganothosaurus_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> DILOPHOSAURUS_DNA = ITEMS.register("dilophosaurus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> DILOPHOSAURUS_DISC = ITEMS.register("dilophosaurus_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> DILOPHOSAURUS_SYRINGUE = ITEMS.register("dilophosaurus_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> PROTEROSUCHUS_DNA = ITEMS.register("proterosuchus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> PROTEROSUCHUS_DISC = ITEMS.register("proterosuchus_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> PROTEROSUCHUS_SYRINGUE = ITEMS.register("proterosuchus_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> TIKTAALIK_DNA = ITEMS.register("tiktaalik_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> TIKTAALIK_DISC = ITEMS.register("tiktaalik_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> TIKTAALIK_SYRINGUE = ITEMS.register("tiktaalik_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));

    public static final RegistryObject<Item> ACHILOBATOR_DNA = ITEMS.register("achilobator_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> ACHILOBATOR_DISC = ITEMS.register("achilobator_disc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));
    public static final RegistryObject<Item> ACHILOBATOR_SYRINGUE = ITEMS.register("achilobator_syringue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1)));





    //seeds





    public static final RegistryObject<Item> COOKSONIA_SPORES = ITEMS.register("cooksonia_spores",
            () -> new ItemNameBlockItem(ModBlocks.COOKSONIA_PLANT.get(),
                    new Item.Properties().tab(ModCreativeModeTab.PALEO_BOTANIC)));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
