package net.rexbr.preludejurassika.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.client.trex.TRexRenderer;
import net.rexbr.preludejurassika.entity.custom.TRexEntity;
import net.rexbr.preludejurassika.entity.custom.Velociraptor2Entity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class VelociraptorG2Model extends AnimatedGeoModel<Velociraptor2Entity> {
    @Override
    public ResourceLocation getModelLocation(Velociraptor2Entity object) {
        return new ResourceLocation(prelude.MODID, "geo/velociraptornew.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Velociraptor2Entity object) {
        return VelociraptorG2Renderer.LOCATION_BY_SEX.get(object.getSex());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Velociraptor2Entity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/velociraptornew.animation.json");
    }
}
