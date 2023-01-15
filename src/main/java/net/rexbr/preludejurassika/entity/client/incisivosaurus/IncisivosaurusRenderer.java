package net.rexbr.preludejurassika.entity.client.incisivosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.client.eotriceratops.EotriceratopsModel;
import net.rexbr.preludejurassika.entity.custom.EotriceratopsEntity;
import net.rexbr.preludejurassika.entity.custom.IncisivosaurusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class IncisivosaurusRenderer extends GeoEntityRenderer<IncisivosaurusEntity> {
    public IncisivosaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new incisivosaurusModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(IncisivosaurusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/incisivosaurus.png");
    }

    @Override
    public RenderType getRenderType(IncisivosaurusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.6F, 0.6F, 0.6F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
