package net.rexbr.preludejurassika.item.items;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.rexbr.preludejurassika.item.ModCreativeModeTab;
import net.rexbr.preludejurassika.item.ModItems;

public class AncientSword extends SwordItem {
    public AncientSword() {
        super(new Tier() {
            public int getUses() {
                return 2560;
            }

            public float getSpeed() {
                return 14f;
            }

            public float getAttackDamageBonus() {
                return 5f;
            }

            public int getLevel() {
                return 5;
            }

            public int getEnchantmentValue() {
                return 18;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(ModItems.SALINIZED_BONE.get()));
            }
        }, 3, -2.4000000000000001f, new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS));
    }
}

