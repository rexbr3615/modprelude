package net.rexbr.preludejurassika.entity.common.irritator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class IrritatorRenderer extends GeoEntityRenderer<IrritatorEntity> {
   public IrritatorRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new IrritatorModel());
        this.shadowRadius = 0.3f;
        }

   @Override
   public ResourceLocation getTextureLocation(IrritatorEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/irritator.png");
        }

   @Override
   public RenderType getRenderType(IrritatorEntity animatable, float partialTicks, PoseStack stack,
                                   MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                   ResourceLocation textureLocation) {
        stack.scale(1.45F, 1.45F, 1.45F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
        }
}
