package net.rexbr.preludejurassika.prelude_tests.dinosaur.ai;

import net.minecraft.world.entity.ai.control.SmoothSwimmingLookControl;
import net.rexbr.preludejurassika.prelude_tests.dinosaur.DinossauroComplex;

public class SmartSwimmerLookControl extends SmoothSwimmingLookControl {
    private final DinossauroComplex mob;

    public SmartSwimmerLookControl(DinossauroComplex entity, int maxYRotFromCenter) {
        super(entity, maxYRotFromCenter);
        this.mob = entity;
    }

    public void tick() {
        if (/*!this.mob.isNotMoving() && */this.mob.canMove()) {
            super.tick();
        }
    }
}