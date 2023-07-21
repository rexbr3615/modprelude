package net.rexbr.preludejurassika.entity.reorganized.avaceratops;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AvaceratopsModel extends AnimatedGeoModel<AvaceratopsEntity> {
        @Override
        public ResourceLocation getModelLocation(AvaceratopsEntity object) {
            return new ResourceLocation(prelude.MODID, "geo/avaceratops.geo.json");
        }

        @Override
        public ResourceLocation getTextureLocation(AvaceratopsEntity object) {
            return new ResourceLocation(prelude.MODID, "textures/dinossaur/avaceratops.png");
        }

        @Override
        public ResourceLocation getAnimationFileLocation(AvaceratopsEntity animatable) {
            return new ResourceLocation(prelude.MODID, "animations/avaceratops.animation.json");
        }
}

