package net.rexbr.preludejurassika.entity.reorganized.mimodactylus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.reorganized.mimodactylus.mimodactylusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MimodactylusModel extends AnimatedGeoModel<mimodactylusEntity> {
    @Override
    public ResourceLocation getModelLocation(mimodactylusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/mimodactylus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(mimodactylusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/mimodactylus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(mimodactylusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/mimodactylus.animation.json");
    }
}
