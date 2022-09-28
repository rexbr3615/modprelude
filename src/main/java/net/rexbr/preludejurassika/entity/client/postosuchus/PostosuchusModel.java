package net.rexbr.preludejurassika.entity.client.postosuchus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.AchillobatorEntity;
import net.rexbr.preludejurassika.entity.custom.PostosuchusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PostosuchusModel extends AnimatedGeoModel<PostosuchusEntity> {
    @Override
    public ResourceLocation getModelLocation(PostosuchusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/postosuchus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PostosuchusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/postosuchus_male_adult.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PostosuchusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/postosuchus.animation.json");
    }
}
