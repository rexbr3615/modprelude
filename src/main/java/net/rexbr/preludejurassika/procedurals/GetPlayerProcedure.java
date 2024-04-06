package net.rexbr.preludejurassika.procedurals;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class GetPlayerProcedure {
    public static Entity execute(LevelAccessor world, double x, double y, double z) {
        Entity mobdisplay2 = null;
        {
            final Vec3 _center = new Vec3(x, y, z);
            List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
            for (Entity entityiterator : _entfound) {
                if (entityiterator instanceof Player) {
                    mobdisplay2 = entityiterator;
                }
            }
        }
        return mobdisplay2;
    }
}

