package net.rexbr.preludejurassika.entity.common.juravenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.rexbr.preludejurassika.prelude;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class JuravenatorRenderer extends GeoEntityRenderer<JuravenatorEntity> {
    public JuravenatorRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new JuravenatorModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(JuravenatorEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/juravenator/juravenator_adult.png");
    }

    @Override
    public RenderType getRenderType(JuravenatorEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.35F, 0.35F, 0.35F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
