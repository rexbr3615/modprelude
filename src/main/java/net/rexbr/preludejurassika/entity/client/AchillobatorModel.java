package net.rexbr.preludejurassika.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.AchillobatorEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AchillobatorModel extends AnimatedGeoModel<AchillobatorEntity> {
    @Override
    public ResourceLocation getModelLocation(AchillobatorEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/achillobator.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AchillobatorEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/achillobator/achillobator_male.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AchillobatorEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/achillobator.animation.json");
    }
}