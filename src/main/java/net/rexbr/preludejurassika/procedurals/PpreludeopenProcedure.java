package net.rexbr.preludejurassika.procedurals;


import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import io.netty.buffer.Unpooled;
import net.rexbr.preludejurassika.screen.slots.PreludeMenu;

public class PpreludeopenProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null)
            return;
        {
            if (entity instanceof ServerPlayer _ent) {
                BlockPos _bpos = new BlockPos(x, y, z);
                NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
                    @Override
                    public Component getDisplayName() {
                        return new TextComponent("Prelude");
                    }

                    @Override
                    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
                        return new PreludeMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
                    }
                }, _bpos);
            }
        }
    }
}

