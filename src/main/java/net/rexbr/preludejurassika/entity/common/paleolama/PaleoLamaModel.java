package net.rexbr.preludejurassika.entity.common.paleolama;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PaleoLamaModel extends AnimatedGeoModel<PaleolamaMajorEntity> {
    @Override
    public ResourceLocation getModelLocation(PaleolamaMajorEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/paleolamamajor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PaleolamaMajorEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/palolama.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PaleolamaMajorEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/paleolamamajor.animation.json");
    }
}
