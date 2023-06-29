package net.rexbr.preludejurassika.prelude_tests.dinosaur.dinos;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.client.achilobator.AchilobatorModel;
import net.rexbr.preludejurassika.entity.custom.AchilobatorEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class anoraptorRenderer extends GeoEntityRenderer<anoraptor> {
    public anoraptorRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new anoraptorModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(anoraptor instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/testmodel.png");
    }

    @Override
    public RenderType getRenderType(anoraptor animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.1F, 1.1F, 1.1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
