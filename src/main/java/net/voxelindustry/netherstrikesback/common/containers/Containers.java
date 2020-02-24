package net.voxelindustry.netherstrikesback.common.containers;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ObjectHolder;
import net.voxelindustry.netherstrikesback.NetherStrikesBack;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

@EventBusSubscriber(bus = MOD)
@ObjectHolder(NetherStrikesBack.MODID)
public class Containers
{
    public static void registerScreens()
    {
    }

    @SubscribeEvent
    public static void onContainerRegister(Register<ContainerType<?>> event)
    {
    }
}
