package net.rexbr.preludejurassika.procedurals;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class CurseforgeProcedure {
    public static void execute(Entity entity) {
        if (entity == null)
            return;
        if (entity instanceof Player _player && !_player.level.isClientSide())
            _player.displayClientMessage(new TextComponent("link"), (false));
    }
}

