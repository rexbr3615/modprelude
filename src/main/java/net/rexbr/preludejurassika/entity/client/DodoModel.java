package net.rexbr.preludejurassika.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.DodoEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DodoModel extends AnimatedGeoModel<DodoEntity> {
    @Override
    public ResourceLocation getModelLocation(DodoEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/dodo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(DodoEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/dodo_male.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(DodoEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/dodo.animation.json");
    }
}
