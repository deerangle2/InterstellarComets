package com.deerangle.main;

import com.deerangle.block.ModBlocks;
import com.deerangle.entity.ModEntities;
import com.deerangle.item.ModItems;
import com.deerangle.network.PacketRequestUpdatePedestal;
import com.deerangle.network.PacketUpdatePedestal;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

@Mod(name = InterstellarComets.NAME, modid = InterstellarComets.MODID, version = InterstellarComets.VERSION)
public class InterstellarComets {
	public static final String NAME = "Interstellar Comets";
	public static final String MODID = "interstellarcomets";
	public static final String VERSION = "1.12.2-1.0.1.18";

	@Instance
	public static InterstellarComets instance;
	
	@SidedProxy(clientSide = "com.deerangle.main.ClientProxy", serverSide = "com.deerangle.main.CommonProxy")
	public static CommonProxy proxy;
	
	public static SimpleNetworkWrapper wrapper;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		proxy.preinit(event);
		
		wrapper = NetworkRegistry.INSTANCE.newSimpleChannel(MODID);
		wrapper.registerMessage(new PacketUpdatePedestal.Handler(), PacketUpdatePedestal.class, 0, Side.CLIENT);
		wrapper.registerMessage(new PacketRequestUpdatePedestal.Handler(), PacketRequestUpdatePedestal.class, 1, Side.SERVER);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		
	}
}
