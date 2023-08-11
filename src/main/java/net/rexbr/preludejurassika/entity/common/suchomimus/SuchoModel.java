package net.rexbr.preludejurassika.entity.common.suchomimus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.common.tapejara.TapejaraEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SuchoModel  extends AnimatedGeoModel<SuchoEntity>  {
    @Override
    public ResourceLocation getModelLocation(SuchoEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/suchomimus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SuchoEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/suchomimus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SuchoEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/suchomimus.animation.json");
    }
}
