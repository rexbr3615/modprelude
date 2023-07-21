package net.rexbr.preludejurassika.entity.common.prognathodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PrognathodonRenderer extends GeoEntityRenderer<PrognathodonEntity> {
    public PrognathodonRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PrognathodonModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(PrognathodonEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/prognathodon.png");
    }

    @Override
    public RenderType getRenderType(PrognathodonEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(3.0F, 3.0F, 3.0F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}