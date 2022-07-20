package com.scxrchy.dimensionmod.event;

import com.scxrchy.dimensionmod.DimensionMod;
import com.scxrchy.dimensionmod.entity.ModEntityTypes;
import com.scxrchy.dimensionmod.entity.custom.EarthGolemEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.net.DatagramSocketImpl;

@Mod.EventBusSubscriber(modid = DimensionMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.EARTH_GOLEM.get(), EarthGolemEntity.setAttributes());
    }
}
