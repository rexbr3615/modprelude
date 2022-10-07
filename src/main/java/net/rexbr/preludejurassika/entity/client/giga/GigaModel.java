package net.rexbr.preludejurassika.entity.client.giga;


import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.AchillobatorEntity;
import net.rexbr.preludejurassika.entity.custom.GiganothossaurusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GigaModel extends AnimatedGeoModel<GiganothossaurusEntity>  {
    @Override
    public ResourceLocation getModelLocation(GiganothossaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/giganotosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GiganothossaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/giganotosaurus_male.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(GiganothossaurusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/giganotosaurus.animation.json");
    }
}
