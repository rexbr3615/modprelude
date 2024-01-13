package net.rexbr.preludejurassika.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.prelude;

public class ModBones {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, prelude.MODID);

    // juravenator
    public static final RegistryObject<Item> JURA_BONE_SKULL = ITEMS.register("jura_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> JURA_BONE_GRASTRALIUM = ITEMS.register("jura_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> JURA_BONE_RIBS = ITEMS.register("jura_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> JURA_BONE_TAIL = ITEMS.register("jura_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> JURA_BONE_VERTEBRATE = ITEMS.register("jura_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // alberto

    public static final RegistryObject<Item> ALBERTO_BONE_SKULL = ITEMS.register("alberto_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ALBERTO_BONE_GRASTRALIUM = ITEMS.register("alberto_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ALBERTO_BONE_RIBS = ITEMS.register("alberto_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ALBERTO_BONE_TAIL = ITEMS.register("alberto_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ALBERTO_BONE_VERTEBRATE = ITEMS.register("alberto_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // avaceratops

    public static final RegistryObject<Item> AVACERATOPS_BONE_SKULL = ITEMS.register("avaceratops_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> AVACERATOPS_BONE_GRASTRALIUM = ITEMS.register("avaceratops_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> AVACERATOPS_BONE_RIBS = ITEMS.register("avaceratops_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> AVACERATOPS_BONE_TAIL = ITEMS.register("avaceratops_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> AVACERATOPS_BONE_VERTEBRATE = ITEMS.register("avaceratops_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // pyroraptor

    public static final RegistryObject<Item> PYRO_BONE_SKULL = ITEMS.register("pyro_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PYRO_BONE_GRASTRALIUM = ITEMS.register("pyro_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PYRO_BONE_RIBS = ITEMS.register("pyro_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PYRO_BONE_TAIL = ITEMS.register("pyro_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PYRO_BONE_VERTEBRATE = ITEMS.register("pyro_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // amazon

    public static final RegistryObject<Item> AMAZON_BONE_SKULL = ITEMS.register("amazon_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> AMAZON_BONE_GRASTRALIUM = ITEMS.register("amazon_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> AMAZON_BONE_RIBS = ITEMS.register("amazon_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> AMAZON_BONE_TAIL = ITEMS.register("amazon_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> AMAZON_BONE_VERTEBRATE = ITEMS.register("amazon_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // torvo TORVO

    public static final RegistryObject<Item> TORVO_BONE_SKULL = ITEMS.register("torvo_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> TORVO_BONE_GRASTRALIUM = ITEMS.register("torvo_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> TORVO_BONE_RIBS = ITEMS.register("torvo_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> TORVO_BONE_TAIL = ITEMS.register("torvo_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> TORVO_BONE_VERTEBRATE = ITEMS.register("torvo_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

// paleolama PALEOLAMA

    public static final RegistryObject<Item> PALEOLAMA_BONE_SKULL = ITEMS.register("paleolama_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PALEOLAMA_BONE_RIBS = ITEMS.register("paleolama_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PALEOLAMA_BONE_TAIL = ITEMS.register("paleolama_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PALEOLAMA_BONE_VERTEBRATE = ITEMS.register("paleolama_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // dryo DRYO

    public static final RegistryObject<Item> DRYO_BONE_SKULL = ITEMS.register("dryo_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DRYO_BONE_GRASTRALIUM = ITEMS.register("dryo_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DRYO_BONE_RIBS = ITEMS.register("dryo_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DRYO_BONE_TAIL = ITEMS.register("dryo_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DRYO_BONE_VERTEBRATE = ITEMS.register("dryo_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // ypupiara YPUPIARA

    public static final RegistryObject<Item> YPUPIARA_BONE_SKULL = ITEMS.register("ypupiara_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> YPUPIARA_BONE_GRASTRALIUM = ITEMS.register("ypupiara_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> YPUPIARA_BONE_RIBS = ITEMS.register("ypupiara_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> YPUPIARA_BONE_TAIL = ITEMS.register("ypupiara_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> YPUPIARA_BONE_VERTEBRATE = ITEMS.register("ypupiara_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    //
    //
    //
    //
    //
    //
    // alter 1
    //
    //
    //
    //
    //
    //

    // tenonto TENONTO

    public static final RegistryObject<Item> TENONTO_BONE_SKULL = ITEMS.register("tenonto_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> TENONTO_BONE_GRASTRALIUM = ITEMS.register("tenonto_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> TENONTO_BONE_RIBS = ITEMS.register("tenonto_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> TENONTO_BONE_TAIL = ITEMS.register("tenonto_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> TENONTO_BONE_VERTEBRATE = ITEMS.register("tenonto_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // mimo MIMO

    public static final RegistryObject<Item> MIMO_BONE_SKULL = ITEMS.register("mimo_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> MIMO_BONE_GRASTRALIUM = ITEMS.register("mimo_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> MIMO_BONE_RIBS = ITEMS.register("mimo_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> MIMO_BONE_TAIL = ITEMS.register("mimo_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> MIMO_BONE_VERTEBRATE = ITEMS.register("mimo_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // irritator IRRITATOR

    public static final RegistryObject<Item> IRRITATOR_BONE_SKULL = ITEMS.register("irritator_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> IRRITATOR_BONE_GRASTRALIUM = ITEMS.register("irritator_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> IRRITATOR_BONE_RIBS = ITEMS.register("irritator_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> IRRITATOR_BONE_TAIL = ITEMS.register("irritator_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> IRRITATOR_BONE_VERTEBRATE = ITEMS.register("irritator_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // proliby

    public static final RegistryObject<Item> PROLIBY_BONE_SKULL = ITEMS.register("proliby_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PROLIBY_BONE_RIBS = ITEMS.register("proliby_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PROLIBY_BONE_TAIL = ITEMS.register("proliby_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PROLIBY_BONE_VERTEBRATE = ITEMS.register("proliby_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // eotriceratops

    public static final RegistryObject<Item> EOTRICERATOPS_BONE_SKULL = ITEMS.register("eotriceratops_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> EOTRICERATOPS_BONE_GRASTRALIUM = ITEMS.register("eotriceratops_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> EOTRICERATOPS_BONE_RIBS = ITEMS.register("eotriceratops_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> EOTRICERATOPS_BONE_TAIL = ITEMS.register("eotriceratops_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> EOTRICERATOPS_BONE_VERTEBRATE = ITEMS.register("eotriceratops_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // incisivo INCISIVO

    public static final RegistryObject<Item> INCISIVO_BONE_SKULL = ITEMS.register("incisivo_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> INCISIVO_BONE_GRASTRALIUM = ITEMS.register("incisivo_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> INCISIVO_BONE_RIBS = ITEMS.register("incisivo_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> INCISIVO_BONE_TAIL = ITEMS.register("incisivo_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> INCISIVO_BONE_VERTEBRATE = ITEMS.register("incisivo_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // ornithomimus ORNITHO

    public static final RegistryObject<Item> ORNITHO_BONE_SKULL = ITEMS.register("ornithomimus_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ORNITHO_BONE_GRASTRALIUM = ITEMS.register("ornithomimus_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ORNITHO_BONE_RIBS = ITEMS.register("ornithomimus_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ORNITHO_BONE_TAIL = ITEMS.register("ornithomimus_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ORNITHO_BONE_VERTEBRATE = ITEMS.register("ornithomimus_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // silessaurus SILESSAURUS

    public static final RegistryObject<Item> SILESSAURUS_BONE_SKULL = ITEMS.register("silessaurus_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> SILESSAURUS_BONE_GRASTRALIUM = ITEMS.register("silessaurus_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> SILESSAURUS_BONE_RIBS = ITEMS.register("silessaurus_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> SILESSAURUS_BONE_TAIL = ITEMS.register("silessaurus_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> SILESSAURUS_BONE_VERTEBRATE = ITEMS.register("silessaurus_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    //
    //
    //
    //
    //
    //
    // alter 1
    //
    //
    //
    //
    //
    //

    // deinony DEINONY

    public static final RegistryObject<Item> DEINONY_BONE_SKULL = ITEMS.register("deinony_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DEINONY_BONE_GRASTRALIUM = ITEMS.register("deinony_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DEINONY_BONE_RIBS = ITEMS.register("deinony_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DEINONY_BONE_TAIL = ITEMS.register("deinony_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DEINONY_BONE_VERTEBRATE = ITEMS.register("deinony_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // prognathodon PROGNATHODON

    public static final RegistryObject<Item> PROGNATHODON_BONE_SKULL = ITEMS.register("prognathodon_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PROGNATHODON_BONE_GRASTRALIUM = ITEMS.register("prognathodon_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PROGNATHODON_BONE_RIBS = ITEMS.register("prognathodon_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PROGNATHODON_BONE_TAIL = ITEMS.register("prognathodon_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PROGNATHODON_BONE_VERTEBRATE = ITEMS.register("prognathodon_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

// dilophosaurus DILOPHOSAURUS

    public static final RegistryObject<Item> DILOPHOSAURUS_BONE_SKULL = ITEMS.register("dilophosaurus_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DILOPHOSAURUS_BONE_GRASTRALIUM = ITEMS.register("dilophosaurus_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DILOPHOSAURUS_BONE_RIBS = ITEMS.register("dilophosaurus_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DILOPHOSAURUS_BONE_TAIL = ITEMS.register("dilophosaurus_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DILOPHOSAURUS_BONE_VERTEBRATE = ITEMS.register("dilophosaurus_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

// giga GIGA

    public static final RegistryObject<Item> GIGA_BONE_SKULL = ITEMS.register("giga_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> GIGA_BONE_GRASTRALIUM = ITEMS.register("giga_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> GIGA_BONE_RIBS = ITEMS.register("giga_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> GIGA_BONE_TAIL = ITEMS.register("giga_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> GIGA_BONE_VERTEBRATE = ITEMS.register("giga_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // proterosuchuPROTEROSUCHU

    public static final RegistryObject<Item> PROTEROSUCHUS_BONE_SKULL = ITEMS.register("proterosuchus_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PROTEROSUCHUS_BONE_GRASTRALIUM = ITEMS.register("proterosuchus_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PROTEROSUCHUS_BONE_RIBS = ITEMS.register("proterosuchus_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PROTEROSUCHUS_BONE_TAIL = ITEMS.register("proterosuchus_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> PROTEROSUCHUS_BONE_VERTEBRATE = ITEMS.register("proterosuchus_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // bajada BAJADA

    public static final RegistryObject<Item> BAJADA_BONE_SKULL = ITEMS.register("bajada_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> BAJADA_BONE_GRASTRALIUM = ITEMS.register("bajada_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> BAJADA_BONE_RIBS = ITEMS.register("bajada_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> BAJADA_BONE_TAIL = ITEMS.register("bajada_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> BAJADA_BONE_VERTEBRATE = ITEMS.register("bajada_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

// achillobatorACHILLOBATOR

    public static final RegistryObject<Item> ACHILLOBATOR_BONE_SKULL = ITEMS.register("achillobator_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ACHILLOBATOR_BONE_GRASTRALIUM = ITEMS.register("achillobator_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ACHILLOBATOR_BONE_RIBS = ITEMS.register("achillobator_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ACHILLOBATOR_BONE_TAIL = ITEMS.register("achillobator_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ACHILLOBATOR_BONE_VERTEBRATE = ITEMS.register("achillobator_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

// tapejara // TAPEJARA

    public static final RegistryObject<Item> TAPEJARA_BONE_SKULL = ITEMS.register("tapejara_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> TAPEJARA_BONE_GRASTRALIUM = ITEMS.register("tapejara_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> TAPEJARA_BONE_RIBS = ITEMS.register("tapejara_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> TAPEJARA_BONE_TAIL = ITEMS.register("tapejara_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> TAPEJARA_BONE_VERTEBRATE = ITEMS.register("tapejara_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // allosaurus // ALLOSAURUS

    public static final RegistryObject<Item> ALLOSAURUS_BONE_SKULL = ITEMS.register("allosaurus_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ALLOSAURUS_BONE_GRASTRALIUM = ITEMS.register("allosaurus_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ALLOSAURUS_BONE_RIBS = ITEMS.register("allosaurus_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ALLOSAURUS_BONE_TAIL = ITEMS.register("allosaurus_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ALLOSAURUS_BONE_VERTEBRATE = ITEMS.register("allosaurus_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    // diabloceratops // DIABLOCERATOPS

    public static final RegistryObject<Item> DIABLOCERATOPS_BONE_SKULL = ITEMS.register("diabloceratops_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DIABLOCERATOPS_BONE_GRASTRALIUM = ITEMS.register("diabloceratops_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DIABLOCERATOPS_BONE_RIBS = ITEMS.register("diabloceratops_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DIABLOCERATOPS_BONE_TAIL = ITEMS.register("diabloceratops_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> DIABLOCERATOPS_BONE_VERTEBRATE = ITEMS.register("diabloceratops_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

// oro // ORO

    public static final RegistryObject<Item> ORO_BONE_SKULL = ITEMS.register("oro_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ORO_BONE_GRASTRALIUM = ITEMS.register("oro_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ORO_BONE_RIBS = ITEMS.register("oro_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ORO_BONE_TAIL = ITEMS.register("oro_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ORO_BONE_VERTEBRATE = ITEMS.register("oro_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    public static final RegistryObject<Item> EOCARCHARIA_BONE_SKULL = ITEMS.register("eocarcharia_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> EOCARCHARIA_BONE_GRASTRALIUM = ITEMS.register("eocarcharia_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> EOCARCHARIA_BONE_RIBS = ITEMS.register("eocarcharia_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> EOCARCHARIA_BONE_TAIL = ITEMS.register("eocarcharia_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> EOCARCHARIA_BONE_VERTEBRATE = ITEMS.register("eocarcharia_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

    //
    //
    //
    //
    //
    //
    // alter 1
    //
    //
    //
    //
    //
    //

    // araripesuchus ARARIPE

    public static final RegistryObject<Item> ARARIPE_BONE_SKULL = ITEMS.register("araripesuchus_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ARARIPE_BONE_GRASTRALIUM = ITEMS.register("araripesuchus_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ARARIPE_BONE_RIBS = ITEMS.register("araripesuchus_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ARARIPE_BONE_TAIL = ITEMS.register("araripesuchus_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> ARARIPE_BONE_VERTEBRATE = ITEMS.register("araripesuchus_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

// kaprosuchus KAPRO

    public static final RegistryObject<Item> KAPRO_BONE_SKULL = ITEMS.register("kaprosuchus_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> KAPRO_BONE_GRASTRALIUM = ITEMS.register("kaprosuchus_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> KAPRO_BONE_RIBS = ITEMS.register("kaprosuchus_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> KAPRO_BONE_TAIL = ITEMS.register("kaprosuchus_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> KAPRO_BONE_VERTEBRATE = ITEMS.register("kaprosuchus_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

// suchomimus SUCHO

    public static final RegistryObject<Item> SUCHO_BONE_SKULL = ITEMS.register("suchomimus_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> SUCHO_BONE_GRASTRALIUM = ITEMS.register("suchomimus_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> SUCHO_BONE_RIBS = ITEMS.register("suchomimus_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> SUCHO_BONE_TAIL = ITEMS.register("suchomimus_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> SUCHO_BONE_VERTEBRATE = ITEMS.register("suchomimus_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));

// herrerassaurus HERRERA

    public static final RegistryObject<Item> HERRERA_BONE_SKULL = ITEMS.register("herrerassaurus_bone_skull",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> HERRERA_BONE_GRASTRALIUM = ITEMS.register("herrerassaurus_bone_gastralium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> HERRERA_BONE_RIBS = ITEMS.register("herrerassaurus_bone_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> HERRERA_BONE_TAIL = ITEMS.register("herrerassaurus_bone_tail",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));
    public static final RegistryObject<Item> HERRERA_BONE_VERTEBRATE = ITEMS.register("herrerassaurus_bone_vertebrate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
