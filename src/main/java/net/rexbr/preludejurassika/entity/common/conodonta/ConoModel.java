package net.rexbr.preludejurassika.entity.common.conodonta;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ConoModel extends AnimatedGeoModel<ConodontaEntity> {
    @Override
    public ResourceLocation getModelLocation(ConodontaEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/conodonta.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ConodontaEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/conodonta.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ConodontaEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/conodonta.animation.json");
    }



}
