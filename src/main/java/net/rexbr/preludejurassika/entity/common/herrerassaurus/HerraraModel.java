package net.rexbr.preludejurassika.entity.common.herrerassaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.common.suchomimus.SuchoEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HerraraModel extends AnimatedGeoModel<HerreraEntity> {
    @Override
    public ResourceLocation getModelLocation(HerreraEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/herrerassaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(HerreraEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/herrerassaurus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(HerreraEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/herrerassaurus.animation.json");
    }
}
