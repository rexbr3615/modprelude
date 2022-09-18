package net.rexbr.preludejurassika.entity.client.trex;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.rexbr.preludejurassika.entity.client.AchillobatorModel;
import net.rexbr.preludejurassika.entity.custom.AchillobatorEntity;
import net.rexbr.preludejurassika.prelude;
import net.rexbr.preludejurassika.entity.custom.TRexEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TRexRenderer extends GeoEntityRenderer<TRexEntity>{
    public TRexRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TRexModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(TRexEntity instance) {
        return new ResourceLocation(prelude.MODID, "textures/dinossaur/tyrannosaurus_0/feathered/tyrannosaurus_male_feathered.png");
    }

    @Override
    public RenderType getRenderType(TRexEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(3F, 3F, 3F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
