package net.rexbr.preludejurassika.prelude_tests.dinosaur.ai;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.rexbr.preludejurassika.prelude_tests.dinosaur.DinossauroComplex;

import java.util.EnumSet;
import java.util.List;

public class SmartSwimGoal_Land extends Goal {

    private final DinossauroComplex entity;
    private final float speed;

    public SmartSwimGoal_Land(DinossauroComplex entityIn) {
        this(entityIn, 0.7f);
    }

    public SmartSwimGoal_Land(DinossauroComplex entityIn, float speedIn) {
        this.entity = entityIn;
        this.speed = speedIn;
        this.setFlags(EnumSet.of(Flag.JUMP));
        entityIn.getNavigation().setCanFloat(true);
    }

    @Override
    public boolean canUse() {
        if (this.entity.isInWater() && this.entity.getTarget() == null && this.entity.getNavigation().canFloat()) {
            double eyeHeight = (double) this.entity.getEyeHeight() - (this.entity.isBaby() ? -0.8 : 0.18F); // Tiny offset because otherwise the Mob drowns
            return this.entity.getFluidHeight(FluidTags.WATER) > eyeHeight || this.entity.isInLava();
        }
        return false;
    }

    @Override
    public void start() {
        if (!this.entity.canMove()) {
            this.entity.setSleeping(false);
            this.entity.setSitting(false);

        }
    }

    @Override
    public boolean canContinueToUse() {
        return !this.entity.isOnGround() && this.entity.isInWater() && this.entity.getTarget() == null;
    }

    @Override
    public void tick() {
        if (this.entity.getNavigation().isDone()) {
            this.entity.getMoveControl().strafe(this.speed, 0);
        }
        boolean colliding = this.entity.level.collidesWithSuffocatingBlock(this.entity, this.entity.getBoundingBox().expandTowards(this.entity.getLookAngle()));
        if (this.entity.isEyeInFluid(FluidTags.WATER) || colliding) {
            this.entity.getJumpControl().jump();
        }
    }

}
