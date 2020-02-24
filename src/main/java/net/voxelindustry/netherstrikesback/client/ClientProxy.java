package net.voxelindustry.netherstrikesback.client;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.voxelindustry.brokkgui.style.StylesheetManager;
import net.voxelindustry.netherstrikesback.common.containers.Containers;
import net.voxelindustry.netherstrikesback.setup.IProxy;

import static net.voxelindustry.netherstrikesback.NetherStrikesBack.MODID;

public class ClientProxy implements IProxy
{
    @Override
    public void setup(FMLCommonSetupEvent e)
    {
        StylesheetManager.getInstance().addUserAgent(MODID, "/assets/" + MODID + "/css/theme.css");
        Containers.registerScreens();
    }
}
