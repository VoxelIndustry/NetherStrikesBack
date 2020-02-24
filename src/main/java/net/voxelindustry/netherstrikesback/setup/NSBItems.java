package net.voxelindustry.netherstrikesback.setup;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.voxelindustry.netherstrikesback.NetherStrikesBack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class NSBItems
{
    public static final Item.Properties ITEM_PROPS = new Item.Properties().group(NetherStrikesBack.TAB_ALL);
    public static final List<Item>      ITEMS      = new ArrayList<>();

    @SubscribeEvent
    public static void onItemRegister(Register<Item> event)
    {
        event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));
    }

    static void registerItem(Register<Item> event, Item item, String name)
    {
        item.setRegistryName(NetherStrikesBack.MODID, name);
        event.getRegistry().register(item);
    }

    public static void registerItemBlock(Block block)
    {
        ITEMS.add(new BlockItem(block, ITEM_PROPS).setRegistryName(Objects.requireNonNull(block.getRegistryName())));
    }
}
