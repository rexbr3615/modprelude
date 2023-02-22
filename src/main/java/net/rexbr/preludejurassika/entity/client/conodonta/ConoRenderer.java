package net.rexbr.preludejurassika.entity.client.conodonta;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.client.deinonychus.DeinonychusModel;
import net.rexbr.preludejurassika.entity.custom.ConodontaEntity;
import net.rexbr.preludejurassika.entity.custom.DeinonychusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ConoRenderer extends GeoEntityRenderer<ConodontaEntity> {
    public ConoRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ConoModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(ConodontaEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/conodonta.png");
    }

    @Override
    public RenderType getRenderType(ConodontaEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.4F, 0.4F, 0.4F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}