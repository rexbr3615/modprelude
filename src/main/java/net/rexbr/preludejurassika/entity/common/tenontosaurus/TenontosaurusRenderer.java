package net.rexbr.preludejurassika.entity.common.tenontosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TenontosaurusRenderer extends GeoEntityRenderer<TenontosaurusEntity> {
    public TenontosaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TenontosaurusModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(TenontosaurusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/tenontosaurus.png");
    }

    @Override
    public RenderType getRenderType(TenontosaurusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.4F, 1.4F, 1.4F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
