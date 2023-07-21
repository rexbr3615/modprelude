package net.rexbr.preludejurassika.entity.common.eotriceratops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class EotriceratopsRenderer extends GeoEntityRenderer<EotriceratopsEntity> {
    public EotriceratopsRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new EotriceratopsModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(EotriceratopsEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/eotriceratops.png");
    }

    @Override
    public RenderType getRenderType(EotriceratopsEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(2.3F, 2.3F, 2.3F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
