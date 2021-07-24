package fr.rggeoiii.crymod;

import fr.rggeoiii.crymod.proxy.Server;
import fr.rggeoiii.crymod.utils.Constant;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Constant.modid, name = Constant.name, version = Constant.version, acceptedMinecraftVersions = "[1.12.2]")
public class Crymod {

    @Mod.Instance
    public static Crymod instance;
    public static Logger loggerfr;

    @SidedProxy(clientSide = Constant.clientproxy, serverSide = Constant.serverproxy)
    public static Server proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        loggerfr = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
