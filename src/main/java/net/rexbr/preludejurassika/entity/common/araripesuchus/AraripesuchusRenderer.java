package net.rexbr.preludejurassika.entity.common.araripesuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.common.albertosaurus.AlbertosaurusEntity;
import net.rexbr.preludejurassika.entity.common.albertosaurus.AlbertosaurusModel;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AraripesuchusRenderer extends GeoEntityRenderer<AraripesuchusEntity> {
    public AraripesuchusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AraripesuchusModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(AraripesuchusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/araripesuchus.png");
    }

    @Override
    public RenderType getRenderType(AraripesuchusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.45F, 0.45F, 0.45F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
