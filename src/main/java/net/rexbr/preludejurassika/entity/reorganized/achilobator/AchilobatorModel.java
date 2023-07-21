package net.rexbr.preludejurassika.entity.reorganized.achilobator;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.reorganized.achilobator.AchilobatorEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AchilobatorModel extends AnimatedGeoModel<AchilobatorEntity> {
    @Override
    public ResourceLocation getModelLocation(AchilobatorEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/achilobator.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AchilobatorEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/achillobator1.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AchilobatorEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/achilobator.animation.json");
    }



}
