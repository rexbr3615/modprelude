package net.rexbr.preludejurassika.entity.common.kaprosuchus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.common.araripesuchus.AraripesuchusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KaprosuchusModel extends AnimatedGeoModel<KaprosuchusEntity> {
    @Override
    public ResourceLocation getModelLocation(KaprosuchusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/kaprosuchus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KaprosuchusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/kaprosuchus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KaprosuchusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/kaprosuchus.animation.json");
    }


}
