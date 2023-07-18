package net.rexbr.preludejurassika.entity.client.uraniasloanus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.TorvosaurusEntity;
import net.rexbr.preludejurassika.entity.custom.test.UraniasolanusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class UraniasloanusModel extends AnimatedGeoModel<UraniasolanusEntity> {
    @Override
    public ResourceLocation getModelLocation(UraniasolanusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/uraniasloanus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(UraniasolanusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/uraniasloanus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(UraniasolanusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/uraniasloanus.animation.json");
    }
}