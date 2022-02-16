package net.eco.wyvernlore.block;

import net.eco.wyvernlore.WyvernLore;
import net.eco.wyvernlore.item.WLItems;
import net.eco.wyvernlore.item.WLTabs;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class WLBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, WyvernLore.MOD_ID);

    public static final RegistryObject<Block> CORRUPTIUM_DEPOSIT = registerBlock("corruptian_deposit",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5f)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block)  {
        WLItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(WLTabs.WL_BLOCKS)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
