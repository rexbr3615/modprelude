package net.rexbr.preludejurassika.entity.client.cryo;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.AchillobatorEntity;
import net.rexbr.preludejurassika.entity.custom.CryoEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CryoModel extends AnimatedGeoModel<CryoEntity> {
    @Override
    public ResourceLocation getModelLocation(CryoEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/cryolophosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CryoEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/cryolophosaurus_female_adult.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CryoEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/cryolophosaurus.animation.json");
    }
}
