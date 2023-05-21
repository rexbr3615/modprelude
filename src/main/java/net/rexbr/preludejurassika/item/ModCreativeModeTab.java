package net.rexbr.preludejurassika.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.rexbr.preludejurassika.tech.items.TechItems;

public class ModCreativeModeTab {
    public static final CreativeModeTab FOSSIL_MOD_ITEMS = new CreativeModeTab("fossil_mod_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TOKEN.get());
        }
    };
    public static final CreativeModeTab FOSSIL_EGSS = new CreativeModeTab("fossil_eggs") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.EMPTY_EGG.get());
        }
    };
    public static final CreativeModeTab TECH_ITEMS = new CreativeModeTab("tech_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TechItems.SAWDUST.get());
        }
    };

}
