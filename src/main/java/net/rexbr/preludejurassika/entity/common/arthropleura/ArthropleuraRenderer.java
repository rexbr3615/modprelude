package net.rexbr.preludejurassika.entity.common.arthropleura;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.common.araripesuchus.AraripesuchusEntity;
import net.rexbr.preludejurassika.entity.common.araripesuchus.AraripesuchusModel;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ArthropleuraRenderer extends GeoEntityRenderer<ArthropleuraEntity> {
    public ArthropleuraRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ArthropleuraModel());
        this.shadowRadius = 1.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(ArthropleuraEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/arthropleura.png");
    }

    @Override
    public RenderType getRenderType(ArthropleuraEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.1F, 1.1F, 1.1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}