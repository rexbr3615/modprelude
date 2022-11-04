package net.rexbr.preludejurassika.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FOSSIL_MOD_ITEMS = new CreativeModeTab("fossil_mod_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TOKEN.get());
        }
    };
    public static final CreativeModeTab FOSSIL_EGSS = new CreativeModeTab("fossil_mod_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.EMPTY_EGG.get());
        }
    };
}
