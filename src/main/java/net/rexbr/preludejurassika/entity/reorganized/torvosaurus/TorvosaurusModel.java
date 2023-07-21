package net.rexbr.preludejurassika.entity.reorganized.torvosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TorvosaurusModel extends AnimatedGeoModel<TorvosaurusEntity> {
    @Override
    public ResourceLocation getModelLocation(TorvosaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/torvosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(TorvosaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/torvosaurus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(TorvosaurusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/torvosaurus.animation.json");
    }
}
