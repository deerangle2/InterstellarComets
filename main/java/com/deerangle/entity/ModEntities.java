package com.deerangle.entity;

import com.deerangle.item.ModItems;
import com.deerangle.main.InterstellarComets;
import com.deerangle.main.ModTabs;

import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.registries.IForgeRegistry;

public class ModEntities {

	public static EntityEntry ENTITY_COMET;

	private static final ModEntities instance = new ModEntities();
	
	public static void load(){
		ENTITY_COMET = EntityEntryBuilder.create().entity(EntityComet.class).id(InterstellarComets.MODID + ":" + "comet", 0).name("comet").tracker(64, 20, false).build();//new EntityEntry(EntityComet.class, InterstellarComets.MODID + ":" + "comet").setRegistryName(InterstellarComets.MODID + ":" + "comet");
		MinecraftForge.EVENT_BUS.register(instance);
	}
	
	@SubscribeEvent
	public void registerEntity(RegistryEvent.Register<EntityEntry> event){
		IForgeRegistry<EntityEntry> registry = event.getRegistry();
		
		registry.register(ENTITY_COMET);
	}
	
}
