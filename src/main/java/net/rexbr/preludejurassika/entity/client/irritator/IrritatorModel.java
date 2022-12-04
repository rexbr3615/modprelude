package net.rexbr.preludejurassika.entity.client.irritator;


import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.AlbertosaurusEntity;
import net.rexbr.preludejurassika.entity.custom.IrritatorEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IrritatorModel extends AnimatedGeoModel<IrritatorEntity> {
    @Override
    public ResourceLocation getModelLocation(IrritatorEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/irritator.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(IrritatorEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/irritator.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(IrritatorEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/irritator.animation.json");
    }
}
