package com.scxrchy.dimensionmod.entity.client;

import com.scxrchy.dimensionmod.DimensionMod;
import com.scxrchy.dimensionmod.entity.custom.EarthGolemEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EarthGolemModel extends AnimatedGeoModel<EarthGolemEntity> {
    @Override
    public ResourceLocation getModelLocation(EarthGolemEntity object) {
        return new ResourceLocation(DimensionMod.MOD_ID, "geo/earth_golem.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EarthGolemEntity object) {
        return new ResourceLocation(DimensionMod.MOD_ID, "textures/entity/earth_golem/earth_golem.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EarthGolemEntity animatable) {
        return new ResourceLocation(DimensionMod.MOD_ID, "animations/earth_golem.animation.json");
    }
}
