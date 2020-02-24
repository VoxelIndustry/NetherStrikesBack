package net.voxelindustry.netherstrikesback.setup;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ObjectHolder;
import net.voxelindustry.netherstrikesback.NetherStrikesBack;

@ObjectHolder(NetherStrikesBack.MODID)
@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class NSBBlocks
{
    @SubscribeEvent
    public static void onBlockRegister(Register<Block> event)
    {

    }

    private static <T extends Block> void registerBlock(Register<Block> event, T block, String name)
    {
        block.setRegistryName(NetherStrikesBack.MODID, name);
        event.getRegistry().register(block);
        NSBItems.registerItemBlock(block);
    }
}
