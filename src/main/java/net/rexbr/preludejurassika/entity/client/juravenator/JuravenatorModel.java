package net.rexbr.preludejurassika.entity.client.juravenator;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.AchillobatorEntity;
import net.rexbr.preludejurassika.entity.custom.JuravenatorEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class JuravenatorModel extends AnimatedGeoModel<JuravenatorEntity> {
    @Override
    public ResourceLocation getModelLocation(JuravenatorEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/juravenator.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(JuravenatorEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/juravenator/juravenator_adult.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(JuravenatorEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/juravenator.animation.json");
    }
}
