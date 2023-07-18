package net.rexbr.prelude.init;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;
import net.rexbr.prelude.Prelude;

import static net.rexbr.prelude.Prelude.MOD_ID;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () ->
            new Item(new Item.Properties().tab(ModTabs.Prelude_TAB)));
    public static final RegistrySupplier<Item> TOKEN = ITEMS.register("token", () ->
            new Item(new Item.Properties().tab(ModTabs.Prelude_TAB)));
    public static final RegistrySupplier<Item> EMPTY_EGG = ITEMS.register("empty_egg", () ->
            new Item(new Item.Properties().tab(ModTabs.Prelude_TAB)));
    public static final RegistrySupplier<Item> TUBE = ITEMS.register("tube", () ->
            new Item(new Item.Properties().tab(ModTabs.Prelude_TAB)));
}
