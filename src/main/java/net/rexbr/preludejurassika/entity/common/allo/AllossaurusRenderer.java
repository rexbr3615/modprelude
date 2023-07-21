package net.rexbr.preludejurassika.entity.common.allo;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.Utils.preludeUtils.AlosaurusVariants;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class AllossaurusRenderer extends GeoEntityRenderer<AlosaurusEntity> {

    public static final Map<AlosaurusVariants, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(AlosaurusVariants.class), (p_114874_) -> {
                p_114874_.put(AlosaurusVariants.EUROPEUS,
                        new ResourceLocation(prelude.MODID, "textures/dinossaur/allo_europeus.png"));
                p_114874_.put(AlosaurusVariants.MAXIMUS,
                        new ResourceLocation(prelude.MODID, "textures/dinossaur/allo_maximus.png"));
                p_114874_.put(AlosaurusVariants.FRAGILIS,
                        new ResourceLocation(prelude.MODID, "textures/dinossaur/allo_fragilis.png"));

            });
    public AllossaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AllossaurusModel());
        this.shadowRadius = 1.3f;
    }
    @Override
    public ResourceLocation getTextureLocation(AlosaurusEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }
    @Override
    public RenderType getRenderType(AlosaurusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.7F, 1.7F, 1.7F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}

