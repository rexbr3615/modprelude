package net.rexbr.preludejurassika.entity.reorganized.dryo;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DryoRenderer extends GeoEntityRenderer<DryosaurusEntity> {
    public DryoRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DryoModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(DryosaurusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/dryosaurus.png");
    }

    @Override
    public RenderType getRenderType(DryosaurusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.2F, 1.2F, 1.2F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
