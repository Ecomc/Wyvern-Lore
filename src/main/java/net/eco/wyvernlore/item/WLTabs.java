package net.eco.wyvernlore.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WLTabs {

    public static final ItemGroup WL_ORES = new ItemGroup("wlOres") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(WLItems.TEST_ITEM.get());
        }
    };

    public static final ItemGroup WL_BLOCKS = new ItemGroup("wlOres") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(WLItems.TEST_ITEM.get());
        }
    };
}
