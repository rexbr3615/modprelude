package net.rexbr.preludejurassika.entity.common.bajadasaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BajadaModel extends AnimatedGeoModel<BajadasaurusEntity> {
    @Override
    public ResourceLocation getModelLocation(BajadasaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/bajadassaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BajadasaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/bajadassaurus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BajadasaurusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/bajadassaurus.animation.json");
    }



}
