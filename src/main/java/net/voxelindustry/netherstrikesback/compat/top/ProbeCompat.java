package net.voxelindustry.netherstrikesback.compat.top;

import mcjty.theoneprobe.TheOneProbe;
import net.voxelindustry.netherstrikesback.NetherStrikesBack;

public class ProbeCompat
{
    static int ELEMENT_FLUID;

    public static void load()
    {
        NetherStrikesBack.logger.info("Compat module for The One Probe is loaded.");

        ELEMENT_FLUID = TheOneProbe.theOneProbeImp.registerElementFactory(FluidElement::new);

        TheOneProbe.theOneProbeImp.registerProvider(new ProbeProvider());
    }
}