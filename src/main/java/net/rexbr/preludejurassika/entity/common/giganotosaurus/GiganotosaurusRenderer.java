package net.rexbr.preludejurassika.entity.common.giganotosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GiganotosaurusRenderer extends GeoEntityRenderer<GiganotosaurusEntity> {
    public GiganotosaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GiganotosaurusModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(GiganotosaurusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/giganotosaurus.png");
    }

    @Override
    public RenderType getRenderType(GiganotosaurusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(3.45F, 3.45F, 3.45F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
