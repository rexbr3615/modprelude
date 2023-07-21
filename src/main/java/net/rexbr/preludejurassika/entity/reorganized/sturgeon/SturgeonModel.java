package net.rexbr.preludejurassika.entity.reorganized.sturgeon;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SturgeonModel extends AnimatedGeoModel<SturgeonEntity> {
    @Override
    public ResourceLocation getModelLocation(SturgeonEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/sturgeon.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SturgeonEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/sturgeon.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SturgeonEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/sturgeon.animation.json");
    }
}