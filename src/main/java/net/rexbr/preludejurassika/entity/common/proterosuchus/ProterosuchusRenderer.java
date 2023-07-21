package net.rexbr.preludejurassika.entity.common.proterosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ProterosuchusRenderer extends GeoEntityRenderer<ProterosuchusEntity> {
    public ProterosuchusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ProterosuchusModel());
        this.shadowRadius = 0.83f;
    }

    @Override
    public ResourceLocation getTextureLocation(ProterosuchusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/proterosuchus.png");
    }

    @Override
    public RenderType getRenderType(ProterosuchusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.85F, 0.85F, 0.85F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}