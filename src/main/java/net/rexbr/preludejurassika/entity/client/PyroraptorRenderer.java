package net.rexbr.preludejurassika.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.AlbertosaurusEntity;
import net.rexbr.preludejurassika.entity.custom.PyroraptorEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PyroraptorRenderer extends GeoEntityRenderer<PyroraptorEntity> {

    public PyroraptorRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PyroraptorModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(PyroraptorEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/pyroraptor.png");
    }

    @Override
    public RenderType getRenderType(PyroraptorEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }

}
