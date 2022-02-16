package net.eco.wyvernlore.item;

import net.eco.wyvernlore.WyvernLore;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class WLItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WyvernLore.MOD_ID);

    //Example
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    //Ores
    public static final RegistryObject<Item> CORRUPTIAN = ITEMS.register("corruptian",
            () -> new Item(new Item.Properties().tab(WLTabs.WL_ORES)));
    public static final RegistryObject<Item> VERDUM = ITEMS.register("verdum",
            () -> new Item(new Item.Properties().tab(WLTabs.WL_ORES)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
