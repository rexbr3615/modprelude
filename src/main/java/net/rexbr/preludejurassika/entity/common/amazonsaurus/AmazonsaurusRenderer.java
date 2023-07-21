package net.rexbr.preludejurassika.entity.common.amazonsaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AmazonsaurusRenderer extends GeoEntityRenderer<AmazonsaurusEntity> {
    public AmazonsaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AmazonsaurusModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(AmazonsaurusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/amazonsaurus.png");
    }

    @Override
    public RenderType getRenderType(AmazonsaurusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.88F, 1.88F, 1.88F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
