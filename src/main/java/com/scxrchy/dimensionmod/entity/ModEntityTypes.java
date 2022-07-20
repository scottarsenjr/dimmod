package com.scxrchy.dimensionmod.entity;

import com.scxrchy.dimensionmod.DimensionMod;
import com.scxrchy.dimensionmod.entity.custom.EarthGolemEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, DimensionMod.MOD_ID);

    public static final RegistryObject<EntityType<EarthGolemEntity>> EARTH_GOLEM =
            ENTITY_TYPES.register("earth_golem", () -> EntityType.Builder.of(EarthGolemEntity::new, MobCategory.MONSTER)
                    .sized(2.0f, 5.6f).build(new ResourceLocation(DimensionMod.MOD_ID, "earth_golem").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
