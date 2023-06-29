package net.rexbr.preludejurassika.prelude_tests.dinosaur.dinos;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.rexbr.preludejurassika.prelude_tests.dinosaur.DinossauroComplex;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class anoraptor extends DinossauroComplex implements IAnimatable {

    public anoraptor(EntityType<? extends DinossauroComplex> type, Level worldIn) {
        super(type, worldIn);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return LivingEntity.createLivingAttributes()
                .add(Attributes.ATTACK_DAMAGE, 5.0D)
                .add(Attributes.ATTACK_KNOCKBACK, 0D)
                .add(Attributes.MOVEMENT_SPEED, 0.4D)
                .add(Attributes.FOLLOW_RANGE, 16.0D)
                .add(Attributes.MAX_HEALTH, 18.0D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 0D)
                .add(Attributes.ARMOR, 0D);
    }





    protected void registerGoals() {}

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
        return null;
    }

    private AnimationFactory factory = new AnimationFactory(this);

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addRepeatingAnimation("animation.testmodel.walk", 999));
            return PlayState.CONTINUE;
        }


        event.getController().setAnimation(new AnimationBuilder().addRepeatingAnimation("animation.testmodel.idle", 999));
        return PlayState.CONTINUE;

    }

    private PlayState attackPredicate(AnimationEvent event) {
        if(this.swinging && event.getController().getAnimationState().equals(AnimationState.Stopped)) {
            event.getController().markNeedsReload();
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.testmodel.attack", false));
            this.swinging = false;
            this.getSharedFlag(4);
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
}
