package net.rexbr.preludejurassika.entity.client;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.OrnithomimusEntity;
import net.rexbr.preludejurassika.entity.custom.base.Sex;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class OrnithomimusRenderer extends GeoEntityRenderer<OrnithomimusEntity> {
    public static final Map<Sex, ResourceLocation> LOCATION_BY_SEX =
            Util.make(Maps.newEnumMap(Sex.class), (p_114874_) -> {
                p_114874_.put(Sex.MALE,
                        new ResourceLocation(prelude.MODID, "textures/dinossaur/ornithomimus_female_adult.png"));
                p_114874_.put(Sex.FEMALE,
                        new ResourceLocation(prelude.MODID, "textures/dinossaur/ornithomimus_male_adult.png"));
                p_114874_.put(Sex.BIS,
                        new ResourceLocation(prelude.MODID, "textures/dinossaur/ornithomimus_female_infant.png"));
            });



    public OrnithomimusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new OrnithomimusModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(OrnithomimusEntity instance) {
        return LOCATION_BY_SEX.get(instance.getSex());
    }


    @Override
    public RenderType getRenderType(OrnithomimusEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        if(animatable.isBaby()) {
            stack.scale(0.2F, 0.2F, 0.2F);
        } else {
            stack.scale(1F, 1f, 1f);
        }

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
