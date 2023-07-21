package net.rexbr.preludejurassika.entity.common.ornithomimus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class OrnithomimusRenderer extends GeoEntityRenderer<OrnithomimusEntity> {
    public OrnithomimusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new OrnithomimusModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(OrnithomimusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/ornithomimus.png");
    }

    @Override
    public RenderType getRenderType(OrnithomimusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.25F, 1.25F, 1.25F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
