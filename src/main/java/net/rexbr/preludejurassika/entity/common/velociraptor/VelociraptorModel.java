package net.rexbr.preludejurassika.entity.common.velociraptor;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.common.ypupiara.YpupiaraEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class VelociraptorModel extends AnimatedGeoModel<VelociraptorEntity> {
    @Override
    public ResourceLocation getModelLocation(VelociraptorEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/velociraptor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(VelociraptorEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/velociraptor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(VelociraptorEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/velociraptor.animation.json");
    }
}
