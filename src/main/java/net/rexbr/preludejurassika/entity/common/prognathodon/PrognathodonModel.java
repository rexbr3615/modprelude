package net.rexbr.preludejurassika.entity.common.prognathodon;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PrognathodonModel extends AnimatedGeoModel<PrognathodonEntity> {
    @Override
    public ResourceLocation getModelLocation(PrognathodonEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/prognathodon.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PrognathodonEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/prognathodon.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PrognathodonEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/prognathodon.animation.json");
    }



}