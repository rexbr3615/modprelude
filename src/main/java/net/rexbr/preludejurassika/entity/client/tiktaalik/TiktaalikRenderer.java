package net.rexbr.preludejurassika.entity.client.tiktaalik;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.client.teno.TenontosaurusModel;
import net.rexbr.preludejurassika.entity.custom.TenontosaurusEntity;
import net.rexbr.preludejurassika.entity.custom.TiktaalikEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TiktaalikRenderer extends GeoEntityRenderer<TiktaalikEntity> {
    public TiktaalikRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TiktaalikModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(TiktaalikEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/tiktaalik.png");
    }

    @Override
    public RenderType getRenderType(TiktaalikEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.85F, 0.85F, 0.85F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
