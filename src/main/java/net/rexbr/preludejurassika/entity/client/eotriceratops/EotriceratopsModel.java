package net.rexbr.preludejurassika.entity.client.eotriceratops;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.DryosaurusEntity;
import net.rexbr.preludejurassika.entity.custom.EotriceratopsEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EotriceratopsModel extends AnimatedGeoModel<EotriceratopsEntity> {
    @Override
    public ResourceLocation getModelLocation(EotriceratopsEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/eotriceratops.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EotriceratopsEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/eotriceratops.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EotriceratopsEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/eotriceratops.animation.json");
    }
}
