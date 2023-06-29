package net.rexbr.preludejurassika.prelude_tests.dinosaur;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.pathfinder.AmphibiousNodeEvaluator;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.pathfinder.PathFinder;
import net.rexbr.preludejurassika.prelude_tests.dinosaur.ai.SmartSwimmerLookControl;
import net.rexbr.preludejurassika.prelude_tests.dinosaur.ai.SmartSwimmingMoveControl;
import org.jetbrains.annotations.Nullable;

public class ComplexMobAmphibious extends DinoTerrestrial {
    protected boolean isAmphibious;

    public ComplexMobAmphibious(EntityType<? extends DinoTerrestrial> type, Level worldIn) {
        super(type, worldIn);
        this.moveControl = new SmartSwimmingMoveControl(this, 40, 5, 0.25F, 0.3F, true);
        this.lookControl = new SmartSwimmerLookControl(this, 20);
        this.setPathfindingMalus(BlockPathTypes.WATER, 0.0F);
        this.maxUpStep = 1.0F;
    }

    protected PathNavigation createNavigation(Level worldIn) {
        return new ComplexMobAmphibious.AmphibiousPathNavigation(this, worldIn);
    }

    public boolean wantsToBeOnLand() { return true; }

    public boolean wantsToBeInWater() { return false; }

    public float getWaterSlowDown() {
        return this.isOnGround() ? 0.8F : 0.9F;
    }
    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    protected SoundEvent getSwimSound() {
        return SoundEvents.AXOLOTL_SWIM;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
        return null;
    }

    static class AmphibiousPathNavigation extends WaterBoundPathNavigation {
        private final ComplexMobAmphibious entityIn;

        AmphibiousPathNavigation(ComplexMobAmphibious entityIn, Level worldIn) {
            super(entityIn, worldIn);
            this.entityIn = entityIn;
        }

        protected boolean canUpdatePath() {
            return true;
        }

        protected PathFinder createPathFinder(int p_149222_) {
            this.nodeEvaluator = new AmphibiousNodeEvaluator(false);
            return new PathFinder(this.nodeEvaluator, p_149222_);
        }

        public boolean isStableDestination(BlockPos destinationIn) {
            if (this.entityIn.wantsToBeInWater()) {
                return !this.level.getBlockState(destinationIn).isSolidRender(this.level, destinationIn) && this.level.getFluidState(destinationIn) != null;
            }
            else if (this.entityIn.wantsToBeOnLand()) {
                BlockPos blockpos = destinationIn.below();
                return this.level.getBlockState(blockpos).isSolidRender(this.level, blockpos);
            }
            return !this.level.getBlockState(destinationIn.below()).isAir();
        }
    }
}

