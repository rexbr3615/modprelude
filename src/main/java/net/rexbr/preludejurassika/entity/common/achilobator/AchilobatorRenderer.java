package net.rexbr.preludejurassika.entity.common.achilobator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AchilobatorRenderer extends GeoEntityRenderer<AchilobatorEntity> {
    public AchilobatorRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AchilobatorModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(AchilobatorEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/achillobator1.png");
    }

    @Override
    public RenderType getRenderType(AchilobatorEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.1F, 1.1F, 1.1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}