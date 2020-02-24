package net.voxelindustry.netherstrikesback.compat;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.voxelindustry.netherstrikesback.compat.top.ProbeCompat;

public class CompatManager
{
    public static void setup(final FMLCommonSetupEvent e)
    {
        // FIXME: Add check of top loading
        ProbeCompat.load();
    }
}
