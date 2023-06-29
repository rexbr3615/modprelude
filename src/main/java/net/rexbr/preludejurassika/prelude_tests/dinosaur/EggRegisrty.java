package net.rexbr.preludejurassika.prelude_tests.dinosaur;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.rexbr.preludejurassika.item.ModCreativeModeTab;
import net.rexbr.preludejurassika.prelude;


public class EggRegisrty {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, prelude.MODID);
    public static final RegistryObject<Item> TEST_SPAWN_EGG = REGISTRY.register("testmodel_spawn_egg", () -> new ForgeSpawnEggItem(DinoRegister.TESTMM, -1, -1, new Item.Properties().tab(ModCreativeModeTab.FOSSIL_EGSS)));
}

