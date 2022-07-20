package com.scxrchy.dimensionmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.scxrchy.dimensionmod.DimensionMod;
import com.scxrchy.dimensionmod.entity.custom.EarthGolemEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class EarthGolemRenderer extends GeoEntityRenderer<EarthGolemEntity> {
    public EarthGolemRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new EarthGolemModel());
        this.shadowRadius = 2.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(EarthGolemEntity instance) {
        return new ResourceLocation(DimensionMod.MOD_ID, "textures/entity/earth_golem/earth_golem.png");
    }

    @Override
    public RenderType getRenderType(EarthGolemEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
