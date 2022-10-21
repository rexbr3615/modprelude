package net.rexbr.preludejurassika.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.OrnithomimusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OrnithomimusModel extends AnimatedGeoModel<OrnithomimusEntity> {
    @Override
    public ResourceLocation getModelLocation(OrnithomimusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/ornithomimus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(OrnithomimusEntity object) {
        return OrnithomimusRenderer.LOCATION_BY_SEX.get(object.getSex());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(OrnithomimusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/ornithomimus.animation.json");
    }
}
