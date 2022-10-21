package net.rexbr.preludejurassika.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.PyroraptorEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PyroraptorModel extends AnimatedGeoModel<PyroraptorEntity> {

    @Override
    public ResourceLocation getModelLocation(PyroraptorEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/pyroraptor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PyroraptorEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/pyroraptor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PyroraptorEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/pyroraptor.animation.json");
    }

}
