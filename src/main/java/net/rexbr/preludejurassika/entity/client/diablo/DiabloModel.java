package net.rexbr.preludejurassika.entity.client.diablo;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.DiabloceratopsEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DiabloModel extends AnimatedGeoModel<DiabloceratopsEntity> {
@Override
public ResourceLocation getModelLocation(DiabloceratopsEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/diabloceratops.geo.json");
        }

@Override
public ResourceLocation getTextureLocation(DiabloceratopsEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/diabloceratops.png");
        }

@Override
public ResourceLocation getAnimationFileLocation(DiabloceratopsEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/diabloceratops.animation.json");
        }

}
