package net.rexbr.preludejurassika.entity.client.tiktaalik;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.TiktaalikEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TiktaalikModel extends AnimatedGeoModel<TiktaalikEntity> {
    @Override
    public ResourceLocation getModelLocation(TiktaalikEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/tiktaalik.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(TiktaalikEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/tiktaalik.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(TiktaalikEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/tiktaalik.animation.json");
    }
}
