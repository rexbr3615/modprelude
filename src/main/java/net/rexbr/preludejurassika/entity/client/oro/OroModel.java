package net.rexbr.preludejurassika.entity.client.oro;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.OrnithomimusEntity;
import net.rexbr.preludejurassika.entity.custom.OrodromeusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OroModel extends AnimatedGeoModel<OrodromeusEntity> {
    @Override
    public ResourceLocation getModelLocation(OrodromeusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/orodromeus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(OrodromeusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/orodromeus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(OrodromeusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/orodromeus.animation.json");
    }
}