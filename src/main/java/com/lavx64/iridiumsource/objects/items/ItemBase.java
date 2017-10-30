package com.lavx64.iridiumsource.objects.items;

import com.lavx64.iridiumsource.Main;
import com.lavx64.iridiumsource.init.ItemInit;
import com.lavx64.iridiumsource.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		if(name != "ore_iridium")
		{
			setCreativeTab(Main.iridiumtab);
		}
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
