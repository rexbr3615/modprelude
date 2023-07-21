package net.rexbr.preludejurassika.entity.common.eocarcharia;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EocarchariaModel extends AnimatedGeoModel<EocarchariaEntity> {
    @Override
    public ResourceLocation getModelLocation(EocarchariaEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/eocarcharia.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EocarchariaEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/eocarcharia.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EocarchariaEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/eocarcharia.animation.json");
    }
}
