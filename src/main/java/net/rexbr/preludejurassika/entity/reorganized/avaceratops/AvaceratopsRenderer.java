package net.rexbr.preludejurassika.entity.reorganized.avaceratops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AvaceratopsRenderer extends GeoEntityRenderer<AvaceratopsEntity> {
    public AvaceratopsRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AvaceratopsModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(AvaceratopsEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/avaceratops.png");
    }

    @Override
    public RenderType getRenderType(AvaceratopsEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.2F, 1.2F, 1.2F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
