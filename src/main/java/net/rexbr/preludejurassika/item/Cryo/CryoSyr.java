package net.rexbr.preludejurassika.item.Cryo;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.rexbr.preludejurassika.item.ModCreativeModeTab;

import java.util.List;


public class CryoSyr extends Item {
    public CryoSyr() {
        super(new Item.Properties().tab(ModCreativeModeTab.FOSSIL_MOD_ITEMS).stacksTo(1).rarity(Rarity.COMMON));
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("cryo dna :)"));
    }

}
