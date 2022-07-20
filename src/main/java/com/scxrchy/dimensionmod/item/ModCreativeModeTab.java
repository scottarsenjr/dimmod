package com.scxrchy.dimensionmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DIMENSION_TAB = new CreativeModeTab("dimensiontab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DIMENSIONAL_GEM.get());
        }
    };
}
