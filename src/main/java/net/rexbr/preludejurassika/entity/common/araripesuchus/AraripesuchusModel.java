package net.rexbr.preludejurassika.entity.common.araripesuchus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.common.albertosaurus.AlbertosaurusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AraripesuchusModel extends AnimatedGeoModel<AraripesuchusEntity> {
    @Override
    public ResourceLocation getModelLocation(AraripesuchusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/araripesuchus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AraripesuchusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/araripesuchus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AraripesuchusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/araripesuchus.animation.json");
    }


}