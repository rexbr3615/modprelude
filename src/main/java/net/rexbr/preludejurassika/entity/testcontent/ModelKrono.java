package net.rexbr.preludejurassika.entity.testcontent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import javax.annotation.Nullable;

public class ModelKrono extends AnimatedGeoModel<KronosaurusEntity>
{
    @Override
    public ResourceLocation getModelLocation(KronosaurusEntity object) {
        return new ResourceLocation(prelude.MODID,"geo/kronosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KronosaurusEntity object) {
        return new ResourceLocation(prelude.MODID,"textures/dinossaur/kronosaurus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KronosaurusEntity animatable) {
        return new ResourceLocation(prelude.MODID,"animations/kronosaurus.animation.json");
    }

    @Override
    public void setLivingAnimations(KronosaurusEntity entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        if (entity.isInWater() && !entity.level.getBlockState(entity.blockPosition().below()).canOcclude()) {
            float setPitchValue = entity.prevRotationPitch+(entity.rotationPitch-entity.prevRotationPitch)*customPredicate.getPartialTick();
            setPitchValue = Mth.clamp(setPitchValue, -0.785F,0.785F);
            (this.getAnimationProcessor().getBone("root")).setRotationX(setPitchValue);
        }
        float setYawValue = entity.prevSetYaw+(entity.setYaw-entity.prevSetYaw)*customPredicate.getPartialTick();
        (this.getAnimationProcessor().getBone("bone5")).setRotationY(-setYawValue*3.5F);
        (this.getAnimationProcessor().getBone("bone6")).setRotationY(setYawValue*3.5F);
        (this.getAnimationProcessor().getBone("bone7")).setRotationY(setYawValue*3.5F);

        (this.getAnimationProcessor().getBone("bone")).setRotationY(-setYawValue*3.5F);
        (this.getAnimationProcessor().getBone("bone2")).setRotationY(-setYawValue*3.5F);
        (this.getAnimationProcessor().getBone("bone3")).setRotationY(-setYawValue*3.5F);
    }

    @Override
    public IBone getBone(String boneName) {
        return super.getBone(boneName);
    }
}
