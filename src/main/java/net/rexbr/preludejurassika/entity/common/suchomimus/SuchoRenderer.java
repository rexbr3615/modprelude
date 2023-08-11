package net.rexbr.preludejurassika.entity.common.suchomimus;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.common.tapejara.TapejaraEntity;
import net.rexbr.preludejurassika.entity.common.tapejara.TapejaraModel;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SuchoRenderer extends GeoEntityRenderer<SuchoEntity> {
    public SuchoRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SuchoModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(SuchoEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/suchomimus.png");
    }

    @Override
    public RenderType getRenderType(SuchoEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.79F, 1.79F, 1.79F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
