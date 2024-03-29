package net.rexbr.preludejurassika.entity.common.albertosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AlbertosaurusModel extends AnimatedGeoModel<AlbertosaurusEntity> {
    @Override
    public ResourceLocation getModelLocation(AlbertosaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/albertosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AlbertosaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/albertosaurus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AlbertosaurusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/albertosaurus.animation.json");
    }


}
