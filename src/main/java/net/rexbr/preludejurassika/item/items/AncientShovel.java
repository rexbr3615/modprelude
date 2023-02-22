package net.rexbr.preludejurassika.item.items;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.rexbr.preludejurassika.item.ModCreativeModeTab;
import net.rexbr.preludejurassika.item.ModItems;

public class AncientShovel extends ShovelItem {
    public AncientShovel() {
        super(new Tier() {
            public int getUses() {
                return 2560;
            }

            public float getSpeed() {
                return 14f;
            }

            public float getAttackDamageBonus() {
                return 5.5f;
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
        }, 1, -3f, new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS));
    }
}

