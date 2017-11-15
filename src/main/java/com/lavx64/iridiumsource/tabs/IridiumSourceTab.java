package com.lavx64.iridiumsource.tabs;

import ic2.api.item.IC2Items;

import com.lavx64.iridiumsource.init.BlockInit;
import com.lavx64.iridiumsource.objects.blocks.BlockBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;

public class IridiumSourceTab extends CreativeTabs
{
	public IridiumSourceTab(String label)
	{
		super("iridiumtab");
	}
	public ItemStack getTabIconItem()
	{
		if (Loader.isModLoaded("ic2")) {
			return IC2Items.getItem("misc_resource", "iridium_ore");
		} else {
			return new ItemStack(Item.getItemFromBlock(BlockInit.BLOCKS.get(1)));
		}
	}
}
