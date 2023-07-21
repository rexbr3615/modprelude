package net.rexbr.preludejurassika.entity.common.eocarcharia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class EocarchariaRenderer extends GeoEntityRenderer<EocarchariaEntity> {
    public EocarchariaRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new EocarchariaModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(EocarchariaEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/eocarcharia.png");
    }

    @Override
    public RenderType getRenderType(EocarchariaEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.3F, 1.3F, 1.3F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}