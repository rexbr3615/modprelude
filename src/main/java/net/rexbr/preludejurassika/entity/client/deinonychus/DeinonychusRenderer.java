package net.rexbr.preludejurassika.entity.client.deinonychus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.DeinonychusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DeinonychusRenderer extends GeoEntityRenderer<DeinonychusEntity> {
    public DeinonychusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DeinonychusModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(DeinonychusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/deinonychus.png");
    }

    @Override
    public RenderType getRenderType(DeinonychusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.9F, 0.9F, 0.9F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
