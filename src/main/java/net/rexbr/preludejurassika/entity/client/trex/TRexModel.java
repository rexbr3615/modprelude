package net.rexbr.preludejurassika.entity.client.trex;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.TRexEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TRexModel extends AnimatedGeoModel<TRexEntity> {
    @Override
    public ResourceLocation getModelLocation(TRexEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/trex.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(TRexEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/tyrannosaurus_0/feathered/tyrannosaurus_male_feathered.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(TRexEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/trex.animation.json");
    }
}
