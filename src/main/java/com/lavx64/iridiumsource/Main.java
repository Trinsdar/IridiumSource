package com.lavx64.iridiumsource;

import ic2.api.recipe.IRecipeInput;
import ic2.api.recipe.Recipes;
import com.lavx64.iridiumsource.proxy.CommonProxy;
import com.lavx64.iridiumsource.tabs.IridiumSourceTab;
import com.lavx64.iridiumsource.util.Reference;
import com.lavx64.iridiumsource.util.handlers.RegistryHandler;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import com.lavx64.iridiumsource.util.HelperIC2;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID,
	 name = Reference.NAME,
	 version = Reference.VERSION)

public class Main {
	@Instance
	public static Main instance;

	public static final CreativeTabs iridiumtab = new IridiumSourceTab("iridiumtab");
	
	@SidedProxy(clientSide = Reference.CLIENT,
				serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.otherRegistries();
		
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		HelperIC2.addRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
		
	}
	
}
