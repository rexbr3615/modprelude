package net.rexbr.preludejurassika.entity.common.velociraptor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class VelociraptorRenderer extends GeoEntityRenderer<VelociraptorEntity> {
    public VelociraptorRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new VelociraptorModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public ResourceLocation getTextureLocation(VelociraptorEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/velociraptor.png");
    }

    @Override
    public RenderType getRenderType(VelociraptorEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F, 1.0F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
