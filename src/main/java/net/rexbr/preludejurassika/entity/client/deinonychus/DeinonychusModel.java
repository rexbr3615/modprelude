package net.rexbr.preludejurassika.entity.client.deinonychus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.DeinonychusEntity;
import net.rexbr.preludejurassika.entity.custom.DryosaurusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DeinonychusModel extends AnimatedGeoModel<DeinonychusEntity> {
    @Override
    public ResourceLocation getModelLocation(DeinonychusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/deinonychus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(DeinonychusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/deinonychus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(DeinonychusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/deinonychus.animation.json");
    }
}
