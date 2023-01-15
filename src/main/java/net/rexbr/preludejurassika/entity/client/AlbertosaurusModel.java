package net.rexbr.preludejurassika.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.rexbr.preludejurassika.entity.custom.AlbertosaurusEntity;
import net.rexbr.preludejurassika.entity.custom.JuravenatorEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import javax.annotation.Nullable;

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
