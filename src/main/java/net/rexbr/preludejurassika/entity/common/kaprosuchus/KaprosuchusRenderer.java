package net.rexbr.preludejurassika.entity.common.kaprosuchus;

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

public class KaprosuchusRenderer extends GeoEntityRenderer<KaprosuchusEntity> {
    public KaprosuchusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new KaprosuchusModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(KaprosuchusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/kaprosuchus.png");
    }

    @Override
    public RenderType getRenderType(KaprosuchusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.9F, 0.9F, 0.9F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
