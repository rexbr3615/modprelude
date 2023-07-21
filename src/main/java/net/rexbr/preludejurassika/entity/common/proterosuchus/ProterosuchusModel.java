package net.rexbr.preludejurassika.entity.common.proterosuchus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ProterosuchusModel extends AnimatedGeoModel<ProterosuchusEntity> {
    @Override
    public ResourceLocation getModelLocation(ProterosuchusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/proterosuchus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ProterosuchusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/proterosuchus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ProterosuchusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/proterosuchus.animation.json");
    }
}
