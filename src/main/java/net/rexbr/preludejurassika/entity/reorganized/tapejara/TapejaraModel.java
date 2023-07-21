package net.rexbr.preludejurassika.entity.reorganized.tapejara;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TapejaraModel extends AnimatedGeoModel<TapejaraEntity> {
    @Override
    public ResourceLocation getModelLocation(TapejaraEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/tapejara.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(TapejaraEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/tapejara.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(TapejaraEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/tapejara.animation.json");
    }


}
