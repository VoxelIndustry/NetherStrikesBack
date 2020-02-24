package net.voxelindustry.netherstrikesback.setup;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ObjectHolder;
import net.voxelindustry.netherstrikesback.NetherStrikesBack;

@ObjectHolder(NetherStrikesBack.MODID)
@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class NSBTiles
{
    @SubscribeEvent
    public static void onTileRegister(RegistryEvent.Register<TileEntityType<?>> event)
    {

    }
}
