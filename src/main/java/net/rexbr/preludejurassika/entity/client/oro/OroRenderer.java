package net.rexbr.preludejurassika.entity.client.oro;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.client.ornithomimus.OrnithomimusModel;
import net.rexbr.preludejurassika.entity.custom.OrnithomimusEntity;
import net.rexbr.preludejurassika.entity.custom.OrodromeusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class OroRenderer extends GeoEntityRenderer<OrodromeusEntity> {
    public OroRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new OroModel());
        this.shadowRadius = 0.2f;
    }

    @Override
    public ResourceLocation getTextureLocation(OrodromeusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/orodromeus.png");
    }

    @Override
    public RenderType getRenderType(OrodromeusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.4F, 0.4F, 0.4F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}

