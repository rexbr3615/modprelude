package net.rexbr.preludejurassika.entity.client.incisivosaurus;

import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.EotriceratopsEntity;
import net.rexbr.preludejurassika.entity.custom.IncisivosaurusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class incisivosaurusModel extends AnimatedGeoModel<IncisivosaurusEntity> {
    @Override
    public ResourceLocation getModelLocation(IncisivosaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "geo/incisivosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(IncisivosaurusEntity object) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/incisivosaurus.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(IncisivosaurusEntity animatable) {
        return new ResourceLocation(prelude.MODID, "animations/incisivosaurus.animation.json");
    }
}

