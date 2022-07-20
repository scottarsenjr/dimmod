package com.scxrchy.dimensionmod.item;

import com.scxrchy.dimensionmod.DimensionMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DimensionMod.MOD_ID);



    public static final RegistryObject<Item> STAINED_DIAMOND =
            ITEMS.register("stained_diamond", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIMENSION_TAB)));

    public static final RegistryObject<Item> DIMENSIONAL_SHARD =
            ITEMS.register("dimensional_shard", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIMENSION_TAB)));

    public static final RegistryObject<Item> DIMENSIONAL_DUST =
            ITEMS.register("dimensional_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIMENSION_TAB)));

    public static final RegistryObject<Item> DIMENSIONAL_GEM =
            ITEMS.register("dimensional_gem", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIMENSION_TAB)));

    public static final RegistryObject<Item> FADING_STAR_DUST =
            ITEMS.register("fading_star_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIMENSION_TAB)));

    public static final RegistryObject<Item> STARGAZING_HEART =
            ITEMS.register("stargazing_heart", () ->
                    new Item(new Item.Properties().
                            stacksTo(1).
                            tab(ModCreativeModeTab.DIMENSION_TAB)));



    public static final RegistryObject<Item> EARTH_SPIRIT =
            ITEMS.register("earth_spirit", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.DIMENSION_TAB)));

    public static final RegistryObject<Item> FADING_STAR =
            ITEMS.register("fading_star", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIMENSION_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
