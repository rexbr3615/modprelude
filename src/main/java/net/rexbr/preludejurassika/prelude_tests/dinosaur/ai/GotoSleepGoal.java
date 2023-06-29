package net.rexbr.preludejurassika.prelude_tests.dinosaur.ai;

import com.mojang.math.Vector3f;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.level.pathfinder.Node;
import net.minecraft.world.level.pathfinder.Path;
import net.rexbr.preludejurassika.prelude_tests.dinosaur.ComplexMobAmphibious;
import net.rexbr.preludejurassika.prelude_tests.dinosaur.DinoTerrestrial;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.Random;

public class GotoSleepGoal extends Goal {

    private final DinoTerrestrial creature;
    protected Vector3f target;
    private final int executionChance;
    private final double speed;
    private final boolean usesHome;

    public GotoSleepGoal(DinoTerrestrial entityIn, double speedIn) {
        this(entityIn, speedIn, 200, true);
    }

    public GotoSleepGoal(DinoTerrestrial entityIn, double speedIn, int chance) {
        this(entityIn, speedIn, chance, true);
    }

    public GotoSleepGoal(DinoTerrestrial entityIn, double speedIn, int chance, boolean usesHome) {
        this.creature = entityIn;
        this.speed = speedIn;
        this.executionChance = chance;
        this.usesHome = usesHome;
        this.setFlags(EnumSet.of(Goal.Flag.MOVE, Flag.JUMP));
    }

    @Override
    public boolean canUse() {
        // Common checks
        if (this.creature.getRandom().nextInt(this.executionChance) != 0 || this.creature.forceSleep < 0 || this.creature.getTarget() != null) {
            return false;
        }
        // Wake up checks
        if (this.creature.isSleeping() && (this.creature.forceSleep <= 0 || (!(this.creature instanceof ComplexMobAmphibious) && this.creature.isInWater()))) {
            this.creature.setSleeping(false);
            return false;
        }

        return true;
    }

    private boolean canEasilyReach(BlockPos target) {
        //this.targetSearchDelay = 10 + this.creature.getRandom().nextInt(5);
        Path path = this.creature.getNavigation().createPath(target, 0);
        if (path == null) {
            return false;
        } else {
            Node pathpoint = path.getEndNode();
            if (pathpoint == null) {
                return false;
            } else {
                int i = pathpoint.x - Mth.floor(target.getX());
                int j = pathpoint.z - Mth.floor(target.getZ());
                return (double)(i * i + j * j) <= 2.25D;
            }
        }
    }

    @Override
    public void start() {
        this.creature.getNavigation().moveTo(this.target.x(), this.target.y(), this.target.z(), this.speed);
    }

    @Override
    public boolean canContinueToUse() {
        return !this.creature.getNavigation().isDone();
    }

    @Nullable
    public BlockPos checkForNewHome() {
        Random random = this.creature.getRandom();
        BlockPos blockpos = this.creature.blockPosition();

        for(int i = 0; i < 10; ++i) {
            BlockPos blockpos1 = blockpos.offset(random.nextInt(12) - 6, random.nextInt(4) - 2, random.nextInt(12) - 6);
            if (isValidShelter(blockpos1) && this.creature.getWalkTargetValue(blockpos1) < 0.0F) {
                return blockpos1;
            }
        }

        return null;
    }

    private boolean isValidShelter(BlockPos blockPos) {
        // We consider a valid shelter a dark location, with Sky Light Level less than 14 (mostly, to prevent mobs sleeping under broad daylight)
        return !this.creature.level.canSeeSky(blockPos);
        //return this.creature.level.getLightFor(LightType.SKY, blockPos) <= 14; // Was 12
    }
}
