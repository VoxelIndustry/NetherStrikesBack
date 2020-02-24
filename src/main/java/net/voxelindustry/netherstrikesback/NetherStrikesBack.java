package net.voxelindustry.netherstrikesback;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.voxelindustry.netherstrikesback.client.ClientProxy;
import net.voxelindustry.netherstrikesback.common.ServerProxy;
import net.voxelindustry.netherstrikesback.compat.CompatManager;
import net.voxelindustry.netherstrikesback.setup.IProxy;
import net.voxelindustry.steamlayer.common.container.CustomCreativeTab;
import net.voxelindustry.steamlayer.core.TickHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(NetherStrikesBack.MODID)
public class NetherStrikesBack
{
    public static final String MODID   = "netherstrikesback";
    public static final String NAME    = "Nether Strikes Back";
    public static final String VERSION = "0.1.0";

    public static final ItemGroup TAB_ALL = new CustomCreativeTab(MODID, () -> new ItemStack(Blocks.NETHER_BRICK_FENCE));

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static NetherStrikesBack instance;

    public static Logger logger = LogManager.getLogger();

    public NetherStrikesBack()
    {
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent e)
    {
        proxy.setup(e);

        CompatManager.setup(e);

        MinecraftForge.EVENT_BUS.register(new TickHandler());
    }
}
