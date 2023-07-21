package net.rexbr.preludejurassika.entity.common.amazonsaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AmazonsaurusModel extends AnimatedGeoModel<AmazonsaurusEntity> {
    @Override
    public ResourceLocation getModelLocation(AmazonsaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/amazonsaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AmazonsaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/amazonsaurus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AmazonsaurusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/amazonsaurus.animation.json");
    }
}
