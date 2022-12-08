package net.rexbr.preludejurassika.entity.client.prolibytherium;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.client.irritator.IrritatorModel;
import net.rexbr.preludejurassika.entity.custom.IrritatorEntity;
import net.rexbr.preludejurassika.entity.custom.ProlibytheriumEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ProlibytheriumRenderer extends GeoEntityRenderer<ProlibytheriumEntity> {
    public ProlibytheriumRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ProlibytheriumModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(ProlibytheriumEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/prolibytherium.png");
    }

    @Override
    public RenderType getRenderType(ProlibytheriumEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.45F, 1.45F, 1.45F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
