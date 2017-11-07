package com.lavx64.iridiumsource.tabs;

import ic2.api.item.IC2Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class IridiumSourceTab extends CreativeTabs
{
	public IridiumSourceTab(String label)
	{
		super("iridiumtab");
	}
	public ItemStack getTabIconItem()
	{
		return IC2Items.getItem("misc_resource", "iridium_ore");
	}
}
