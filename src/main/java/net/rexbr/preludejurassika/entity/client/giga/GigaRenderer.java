package net.rexbr.preludejurassika.entity.client.giga;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.client.AchillobatorModel;
import net.rexbr.preludejurassika.entity.custom.AchillobatorEntity;
import net.rexbr.preludejurassika.entity.custom.GiganothossaurusEntity;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GigaRenderer extends GeoEntityRenderer<GiganothossaurusEntity>  {
    public GigaRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GigaModel());
        this.shadowRadius = 5f;
    }

    @Override
    public ResourceLocation getTextureLocation(GiganothossaurusEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/giganotosaurus_male.png");
    }

    @Override
    public RenderType getRenderType(GiganothossaurusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        if(animatable.isBaby()) {
            stack.scale(0.7F, 0.7F, 0.7F);
        } else {
            stack.scale(3F, 3F, 3F);
        }
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
