package net.rexbr.preludejurassika.entity.client.giganotosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.DeinonychusEntity;
import net.rexbr.preludejurassika.entity.custom.GiganotosaurusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GiganotosaurusModel extends AnimatedGeoModel<GiganotosaurusEntity> {
    @Override
    public ResourceLocation getModelLocation(GiganotosaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/giganotosaurus_carolinii.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GiganotosaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/giganotosaurus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(GiganotosaurusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/giganotosaurus_carolinii.animation.json");
    }
}
