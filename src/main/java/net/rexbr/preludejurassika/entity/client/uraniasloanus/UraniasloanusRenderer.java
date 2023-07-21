package net.rexbr.preludejurassika.entity.client.uraniasloanus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.test.UraniasolanusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class UraniasloanusRenderer extends GeoEntityRenderer<UraniasolanusEntity> {
    public UraniasloanusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new UraniasloanusModel());
        this.shadowRadius = 1.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(UraniasolanusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/uraniasloanus.png");
    }

    @Override
    public RenderType getRenderType(UraniasolanusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.2F, 0.2F, 0.2F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
