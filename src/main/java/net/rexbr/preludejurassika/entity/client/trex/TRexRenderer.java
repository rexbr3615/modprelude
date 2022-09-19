package net.rexbr.preludejurassika.entity.client.trex;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.rexbr.preludejurassika.entity.client.AchillobatorModel;
import net.rexbr.preludejurassika.entity.custom.AchillobatorEntity;
import net.rexbr.preludejurassika.entity.custom.base.Variants;
import net.rexbr.preludejurassika.prelude;
import net.rexbr.preludejurassika.entity.custom.TRexEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class TRexRenderer extends GeoEntityRenderer<TRexEntity>{

    public static final Map<Variants, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(Variants.class), (p_114874_) -> {
                p_114874_.put(Variants.MALE,
                        new ResourceLocation(prelude.MODID, "textures/dinossaur/tyrannosaurus_0/scaled/tyrannosaurus_male_scaled.png"));
                p_114874_.put(Variants.FEMALE,
                        new ResourceLocation(prelude.MODID, "textures/dinossaur/tyrannosaurus_0/scaled/tyrannosaurus_female_scaled.png"));
                p_114874_.put(Variants.F_MALE,
                        new ResourceLocation(prelude.MODID, "textures/dinossaur/tyrannosaurus_0/feathered/tyrannosaurus_male_feathered.png"));
                p_114874_.put(Variants.F_FEMALE,
                        new ResourceLocation(prelude.MODID, "textures/dinossaur/tyrannosaurus_0/feathered/tyrannosaurus_female_feathered.png"));
            });

    public TRexRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TRexModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(TRexEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }


    @Override
    public RenderType getRenderType(TRexEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        if(animatable.isBaby()) {
            stack.scale(0.7F, 0.7F, 0.7F);
        } else {
            stack.scale(3F, 3F, 3F);
        }

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
