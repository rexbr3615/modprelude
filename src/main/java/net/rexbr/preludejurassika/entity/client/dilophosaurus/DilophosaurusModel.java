package net.rexbr.preludejurassika.entity.client.dilophosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.DeinonychusEntity;
import net.rexbr.preludejurassika.entity.custom.DilophosaurusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DilophosaurusModel extends AnimatedGeoModel<DilophosaurusEntity> {
    @Override
    public ResourceLocation getModelLocation(DilophosaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/dilophosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(DilophosaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/dilophosaurus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(DilophosaurusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/dilophosaurs.animation.json");
    }
}