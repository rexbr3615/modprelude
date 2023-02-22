package net.rexbr.preludejurassika.entity.client.conodonta;

import net.minecraft.client.model.SquidModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.rexbr.preludejurassika.entity.custom.ConodontaEntity;
import net.rexbr.preludejurassika.entity.custom.DeinonychusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import javax.annotation.Nullable;

import static java.lang.Math.PI;

public class ConoModel extends AnimatedGeoModel<ConodontaEntity> {
    @Override
    public ResourceLocation getModelLocation(ConodontaEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/conodonta.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ConodontaEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/conodonta.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ConodontaEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/conodonta.animation.json");
    }



}
