package net.rexbr.preludejurassika.entity.common.arthropleura;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.common.araripesuchus.AraripesuchusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ArthropleuraModel extends AnimatedGeoModel<ArthropleuraEntity> {
    @Override
    public ResourceLocation getModelLocation(ArthropleuraEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/arthropleura.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ArthropleuraEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/arthropleura.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ArthropleuraEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/arthropleura.animation.json");
    }


}
