package net.rexbr.preludejurassika.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.client.juravenator.JuravenatorModel;
import net.rexbr.preludejurassika.entity.custom.AlbertosaurusEntity;
import net.rexbr.preludejurassika.entity.custom.JuravenatorEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AlbertosaurusRenderer extends GeoEntityRenderer<AlbertosaurusEntity> {
    public AlbertosaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AlbertosaurusModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(AlbertosaurusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/albertosaurus.png");
    }

    @Override
    public RenderType getRenderType(AlbertosaurusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(2F, 2F, 2F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
