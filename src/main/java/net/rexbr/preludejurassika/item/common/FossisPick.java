package net.rexbr.preludejurassika.item.common;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.rexbr.preludejurassika.item.ModCreativeModeTab;

public class FossisPick extends PickaxeItem {
    public FossisPick() {
        super(new Tier() {
            public int getUses() {
                return 800;
            }

            public float getSpeed() {
                return 8f;
            }

            public float getAttackDamageBonus() {
                return 2f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 15;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.BONE), new ItemStack(Blocks.POLISHED_DIORITE_STAIRS));
            }
        }, 1, -3f, new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS));
    }
}
