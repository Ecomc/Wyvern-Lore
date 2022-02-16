package net.eco.wyvernlore;

import net.eco.wyvernlore.block.WLBlocks;
import net.eco.wyvernlore.item.WLItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.eventbus.api.IEventBus;


@Mod(WyvernLore.MOD_ID)
public class WyvernLore
{

    public static final String MOD_ID = "wyvernlore";

    private static final Logger LOGGER = LogManager.getLogger();

    public WyvernLore() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        WLItems.register(eventBus);
        WLBlocks.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
