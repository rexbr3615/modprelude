package net.rexbr.preludejurassika.entity.client.trex;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.TRexEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class TRexModel extends AnimatedGeoModel<TRexEntity> {
    @Override
    public ResourceLocation getModelLocation(TRexEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/trex.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(TRexEntity object) {
        return TRexRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(TRexEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/trex.animation.json");
    }



}
