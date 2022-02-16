package net.eco.wyvernlore.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemsTab {

    public static final ItemGroup WL_ORES = new ItemGroup("wlOres")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.TEST_ITEM.get());
        }
    };

}
