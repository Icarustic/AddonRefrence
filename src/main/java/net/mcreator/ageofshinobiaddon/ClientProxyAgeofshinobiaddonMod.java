//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.ageofshinobiaddon;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class ClientProxyAgeofshinobiaddonMod implements IProxyAgeofshinobiaddonMod {
    public ClientProxyAgeofshinobiaddonMod() {
    }

    public void init(FMLInitializationEvent event) {
    }
    //try to run with this file deleted.

    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain("ageofshinobiaddon");
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    public void serverLoad(FMLServerStartingEvent event) {
    }
}
