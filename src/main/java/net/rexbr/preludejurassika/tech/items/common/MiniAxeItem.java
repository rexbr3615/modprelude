package net.rexbr.preludejurassika.tech.items.common;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.rexbr.preludejurassika.item.ModCreativeModeTab;
import net.rexbr.preludejurassika.item.ModItems;

public class MiniAxeItem extends Item {
    public MiniAxeItem() {
        super(new Item.Properties().tab(ModCreativeModeTab.TECH_ITEMS).durability(64).rarity(Rarity.COMMON));
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        ItemStack retval = new ItemStack(this);
        retval.setDamageValue(itemstack.getDamageValue() + 1);
        if (retval.getDamageValue() >= retval.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retval;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.of(new ItemStack(Items.IRON_INGOT));
    }
    @Override
    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }
}

