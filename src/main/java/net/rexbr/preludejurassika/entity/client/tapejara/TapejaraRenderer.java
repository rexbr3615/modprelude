package net.rexbr.preludejurassika.entity.client.tapejara;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.client.tiktaalik.TiktaalikModel;
import net.rexbr.preludejurassika.entity.custom.TapejaraEntity;
import net.rexbr.preludejurassika.entity.custom.TiktaalikEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TapejaraRenderer extends GeoEntityRenderer<TapejaraEntity> {
    public TapejaraRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TapejaraModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(TapejaraEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/tapejara.png");
    }

    @Override
    public RenderType getRenderType(TapejaraEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.80F, 0.80F, 0.80F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
