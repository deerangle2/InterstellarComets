package com.deerangle.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.items.ItemStackHandler;

public class ItemBlockCometicBrick extends ItemBlock {

	public ItemBlockCometicBrick(Block block) {
		super(block);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		this.setRegistryName(block.getRegistryName());
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		this.block.getSubBlocks(tab, items);
	}
	
	@Override
	public int getMetadata(ItemStack stack) {
		return this.getMetadata(stack.getItemDamage());
	}
	
	@Override
	public int getMetadata(int damage) {
		return damage;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName(stack) + "_" + BlockCometicBrick.EnumType.fromId(stack.getItemDamage()).getName();
	}

}
