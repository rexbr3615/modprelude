package net.rexbr.preludejurassika.entity.common.prolibytherium;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ProlibytheriumModel extends AnimatedGeoModel<ProlibytheriumEntity> {
    @Override
    public ResourceLocation getModelLocation(ProlibytheriumEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/prolibytherium.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ProlibytheriumEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/prolibytherium.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ProlibytheriumEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/prolibytherium.animation.json");
    }
}
