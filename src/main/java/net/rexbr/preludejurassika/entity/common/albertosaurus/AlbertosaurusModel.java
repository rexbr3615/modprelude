package net.rexbr.preludejurassika.entity.common.albertosaurus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.rexbr.preludejurassika.prelude;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AlbertosaurusModel extends AnimatedGeoModel<AlbertosaurusEntity> {
    @Override
    public ResourceLocation getModelLocation(AlbertosaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/albertosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AlbertosaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/albertosaurus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AlbertosaurusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/albertosaurus.animation.json");
    }




    /*** @Override
    public void setLivingAnimations(AlbertosaurusEntity entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);

        float setYawValue = entity.prevSetYaw+(entity.setYaw-entity.prevSetYaw)*customPredicate.getPartialTick();

        (this.getAnimationProcessor().getBone("tail")).setRotationY(setYawValue*3.5F);
        (this.getAnimationProcessor().getBone("tail2")).setRotationY(setYawValue*3.5F);
        (this.getAnimationProcessor().getBone("tail3")).setRotationY(setYawValue*3.5F);
        (this.getAnimationProcessor().getBone("tail4")).setRotationY(setYawValue*3.5F);

        (this.getAnimationProcessor().getBone("neck")).setRotationY(-setYawValue*3.5F);
    }

    @Override
    public IBone getBone(String boneName) {
        return super.getBone(boneName);
    }**/


}
