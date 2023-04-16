package net.rexbr.preludejurassika.entity.client.diablo;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.client.deinonychus.DeinonychusModel;
import net.rexbr.preludejurassika.entity.custom.DeinonychusEntity;
import net.rexbr.preludejurassika.entity.custom.DiabloceratopsEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DiabloRenderer extends GeoEntityRenderer<DiabloceratopsEntity> {
    public DiabloRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DiabloModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(DiabloceratopsEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/diabloceratops.png");
    }

    @Override
    public RenderType getRenderType(DiabloceratopsEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.7F, 1.7F, 1.7F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
