package net.rexbr.preludejurassika.entity.client.ornithomimus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.JuravenatorEntity;
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
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/ornithomimus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(OrnithomimusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/ornithomimus.animation.json");
    }
}
