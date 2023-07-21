package net.rexbr.preludejurassika.entity.common.silessaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SilessaurusModel extends AnimatedGeoModel<SilessaurusEntity> {
    @Override
    public ResourceLocation getModelLocation(SilessaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/silessaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SilessaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/silessaurus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SilessaurusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/silessaurus.animation.json");
    }
}
