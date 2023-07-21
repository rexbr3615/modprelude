package net.rexbr.preludejurassika.entity.reorganized.torvosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TorvosaurusRenderer extends GeoEntityRenderer<TorvosaurusEntity> {
    public TorvosaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TorvosaurusModel());
        this.shadowRadius = 1.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(TorvosaurusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/torvosaurus.png");
    }

    @Override
    public RenderType getRenderType(TorvosaurusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(2.6F, 2.6F, 2.6F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
