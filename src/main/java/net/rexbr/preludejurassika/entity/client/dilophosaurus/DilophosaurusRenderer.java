package net.rexbr.preludejurassika.entity.client.dilophosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.client.deinonychus.DeinonychusModel;
import net.rexbr.preludejurassika.entity.custom.DeinonychusEntity;
import net.rexbr.preludejurassika.entity.custom.DilophosaurusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DilophosaurusRenderer extends GeoEntityRenderer<DilophosaurusEntity> {
    public DilophosaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DilophosaurusModel());
        this.shadowRadius = 1.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(DilophosaurusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/dilophosaurus.png");
    }

    @Override
    public RenderType getRenderType(DilophosaurusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.6F, 1.6F, 1.6F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}