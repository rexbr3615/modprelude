package net.rexbr.preludejurassika.entity.client;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rexbr.preludejurassika.entity.custom.Velociraptor2Entity;
import net.rexbr.preludejurassika.entity.custom.base.Sex;
import net.rexbr.preludejurassika.prelude;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class VelociraptorG2Renderer extends GeoEntityRenderer<Velociraptor2Entity> {
    public static final Map<Sex, ResourceLocation> LOCATION_BY_SEX =
            Util.make(Maps.newEnumMap(Sex.class), (p_114874_) -> {
                p_114874_.put(Sex.MALE,
                        new ResourceLocation(prelude.MODID, "textures/dinossaur/velociraptor_0/gerone/velociraptor_male_adult.png"));
                p_114874_.put(Sex.FEMALE,
                        new ResourceLocation(prelude.MODID, "textures/dinossaur/velociraptor_0/gerone/velociraptor_female_adult.png"));
                p_114874_.put(Sex.BIS,
                        new ResourceLocation(prelude.MODID, "textures/dinossaur/velociraptor_0/gerone/velociraptor_female_adult_b.png"));
            });



    public VelociraptorG2Renderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new VelociraptorG2Model());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(Velociraptor2Entity instance) {
        return LOCATION_BY_SEX.get(instance.getSex());
    }


    @Override
    public RenderType getRenderType(Velociraptor2Entity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        if(animatable.isBaby()) {
            stack.scale(0.2F, 0.2F, 0.2F);
        } else {
            stack.scale(0.9F, 0.9f, 0.9f);
        }

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
