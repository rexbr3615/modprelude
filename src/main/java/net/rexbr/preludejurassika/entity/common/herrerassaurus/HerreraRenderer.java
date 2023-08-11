package net.rexbr.preludejurassika.entity.common.herrerassaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.common.suchomimus.SuchoEntity;
import net.rexbr.preludejurassika.entity.common.suchomimus.SuchoModel;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class HerreraRenderer extends GeoEntityRenderer<HerreraEntity> {
    public HerreraRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new HerraraModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(HerreraEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/herrerassaurus.png");
    }

    @Override
    public RenderType getRenderType(HerreraEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.1F, 1.1F, 1.1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
