package net.rexbr.preludejurassika.entity.custom.base;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;
import net.rexbr.preludejurassika.entity.custom.base.Sex;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class Dinossaur extends Animal implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);

    public Dinossaur(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    String AttackAnim = "animation.dinossaur.animname";
    String MoveAnim = "animation.dinossaur.animname";
    String IdleAnim = "animation.dinossaur.animname";

    protected Dinossaur dinossaur;
    protected Sex sex;

    public Dinossaur getDinosaur() {
        return this.dinossaur;
    }
    public Sex getSex() {
        return this.sex;
    }

    public int DNA = 000;
    private int HUNGER = 200;
    String name = "dinossaur";

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addRepeatingAnimation("animation.dinossaur.walk", 999));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addRepeatingAnimation("animation.dinossaur.idle", 999));
        return PlayState.CONTINUE;
    }

    private PlayState attackPredicate(AnimationEvent event) {
        if(this.swinging && event.getController().getAnimationState().equals(AnimationState.Stopped)) {
            event.getController().markNeedsReload();
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.dinossaur.attack", false));
            this.swinging = false;
        }

        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
        data.addAnimationController(new AnimationController(this, "attackController",
                0, this::attackPredicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
        return null;
    }
}
