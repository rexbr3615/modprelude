package net.rexbr.preludejurassika.entity.common.allo;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AllossaurusModel extends AnimatedGeoModel<AlosaurusEntity> {
    @Override
    public ResourceLocation getModelLocation(AlosaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/allosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AlosaurusEntity object) {
        return AllossaurusRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AlosaurusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/allosaurus.animation.json");
    }



}
