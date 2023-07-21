package net.rexbr.preludejurassika.entity.reorganized.mimodactylus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;



public class MimodactylusRenderer extends GeoEntityRenderer<mimodactylusEntity> {

    public MimodactylusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MimodactylusModel());
        this.shadowRadius = 1f;
    }

    @Override
    public ResourceLocation getTextureLocation(mimodactylusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/mimodactylus.png");
    }

    @Override
    public RenderType getRenderType(mimodactylusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
