package net.rexbr.preludejurassika.entity.client.dryo;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.AlbertosaurusEntity;
import net.rexbr.preludejurassika.entity.custom.DryosaurusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DryoModel extends AnimatedGeoModel<DryosaurusEntity> {
    @Override
    public ResourceLocation getModelLocation(DryosaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/dryosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(DryosaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/dryosaurus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(DryosaurusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/dryosaurus.animation.json");
    }
}
