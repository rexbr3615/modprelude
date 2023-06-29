package net.rexbr.preludejurassika.prelude_tests.dinosaur.dinos;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.AchilobatorEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class anoraptorModel extends AnimatedGeoModel<anoraptor> {
    @Override
    public ResourceLocation getModelLocation(anoraptor object) {
        return new ResourceLocation(prelude.MODID, "geo/testmodel.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(anoraptor object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/testmodel.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(anoraptor animatable) {
        return new ResourceLocation(prelude.MODID, "animations/testmodel.animation.json");
    }



}
