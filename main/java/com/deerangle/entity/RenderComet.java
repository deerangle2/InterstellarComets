package com.deerangle.entity;

import com.deerangle.main.InterstellarComets;

import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderComet extends Render<EntityComet> {

	public RenderComet(RenderManager renderManager) {
		super(renderManager);
		System.out.println("Initializing RenderComet!");
	}

	@Override
	public void doRender(EntityComet entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
		System.out.println("Am i rendering?");
	}
	
	@Override
	public boolean shouldRender(EntityComet livingEntity, ICamera camera, double camX, double camY, double camZ) {
		return true;
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityComet entity) {
		return new ResourceLocation(InterstellarComets.MODID + ":textures/entity/comet/comet.png");
	}

}