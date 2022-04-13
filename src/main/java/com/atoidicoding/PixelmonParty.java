package com.atoidicoding;

import com.atoidicoding.commands.discord;
import com.atoidicoding.commands.loja;
import com.atoidicoding.events.EventRightClick;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = PixelmonParty.MODID, name = PixelmonParty.NAME, version = PixelmonParty.VERSION, serverSideOnly = true, acceptableRemoteVersions = "*")
public class PixelmonParty
{
    public static final String MODID = "pixelmonparty";
    public static final String NAME = "Pixelmon Party";
    public static final String VERSION = "1.0";
    public static PixelmonParty instance;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        instance = this;
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        MinecraftForge.EVENT_BUS.register(new EventRightClick());
    }

    @EventHandler
    public void onServerStart(FMLServerStartingEvent event){
        event.registerServerCommand(new discord());
        event.registerServerCommand(new loja());
        MinecraftForge.EVENT_BUS.register(new EventRightClick());
    }
}
