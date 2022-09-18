package net.rexbr.preludejurassika.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.rexbr.preludejurassika.prelude;
import net.rexbr.preludejurassika.entity.custom.AchillobatorEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AchillobatorRenderer extends GeoEntityRenderer<AchillobatorEntity> {
    public AchillobatorRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AchillobatorModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(AchillobatorEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/achillobator/achillobator_male.png");
    }

    @Override
    public RenderType getRenderType(AchillobatorEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.9F, 0.9F, 0.9F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
