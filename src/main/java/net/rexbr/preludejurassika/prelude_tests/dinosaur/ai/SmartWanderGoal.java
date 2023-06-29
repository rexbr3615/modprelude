package net.rexbr.preludejurassika.prelude_tests.dinosaur.ai;

import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.util.DefaultRandomPos;
import net.minecraft.world.phys.Vec3;
import net.rexbr.preludejurassika.prelude_tests.dinosaur.DinoTerrestrial;
import java.util.EnumSet;

public class SmartWanderGoal extends Goal {
    public final DinoTerrestrial creature;
    protected double x;
    protected double y;
    protected double z;
    private final int runChance;
    private final boolean avoidWater;
    private final double speed;

    public SmartWanderGoal(DinoTerrestrial entityIn, double speedIn) {
        this(entityIn, speedIn, 120, 0,false);
    }

    public SmartWanderGoal(DinoTerrestrial entityIn, double speedIn, boolean avoidWater) {
        this(entityIn, speedIn, 120, 0, avoidWater);
    }

    public SmartWanderGoal(DinoTerrestrial entityIn, double speedIn, int runChance, boolean avoidWater) {
        this(entityIn, speedIn, 120, runChance, avoidWater);
    }

    public SmartWanderGoal(DinoTerrestrial entityIn, double speedIn, int chance, int runChance, boolean avoidWater) {
        this.creature = entityIn;
        this.speed = speedIn;
        this.runChance = runChance;
        this.avoidWater = avoidWater;
        this.setFlags(EnumSet.of(Goal.Flag.MOVE));
    }

    @Override
    public boolean canUse() {
        if (!this.creature.canMove() || !this.creature.getNavigation().isDone()) {
            return false;
        }

        Vec3 vec3d = this.getPosition();
        if (vec3d == null) {
            return false;
        } else {
            this.x = vec3d.x;
            this.y = vec3d.y;
            this.z = vec3d.z;
            return true;
        }
    }

    private Vec3 getPosition() {
        if (this.avoidWater) {
            Vec3 vec3d = DefaultRandomPos.getPos(this.creature, 15, 7);
            return vec3d == null ? DefaultRandomPos.getPos(this.creature, 10, 4) : vec3d;
        }
        else {
            return DefaultRandomPos.getPos(this.creature, 10, 4);
        }
    }

    @Override
    public boolean canContinueToUse() {
        return !this.creature.getNavigation().isDone();
    }

    @Override
    public void start() {
        this.creature.getNavigation().moveTo(this.x, this.y, this.z, this.speed * (this.creature.getRandom().nextInt(100) < this.runChance ? 2f : 1f));
    }
}