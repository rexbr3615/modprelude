package net.rexbr.preludejurassika.procedurals;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;
import net.rexbr.preludejurassika.block.ModBlocks;
import net.rexbr.preludejurassika.item.ModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EncaseFossil {
    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        if (event.getHand() != event.getPlayer().getUsedItemHand())
            return;
        execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null)
            return;
        boolean found = false;
        double sx = 0;
        double sy = 0;
        double sz = 0;
        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.FOSSIL_ORE.get()
                || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.DEEP_FOSSIL_ORE.get())
                && ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.PLASTER.get()
                || (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ModItems.PLASTER.get())) {
            world.setBlock(new BlockPos(x, y, z), ModBlocks.ENCHASED_FOSSIL.get().defaultBlockState(), 3);
            if (entity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.PLASTER.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
                        _player.inventoryMenu.getCraftSlots());
            }
        }
    }
}
