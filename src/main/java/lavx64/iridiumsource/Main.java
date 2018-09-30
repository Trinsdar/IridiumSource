package lavx64.iridiumsource;

import lavx64.iridiumsource.proxy.CommonProxy;
import lavx64.iridiumsource.recipes.RecipesIC2;
import lavx64.iridiumsource.util.Reference;
import lavx64.iridiumsource.util.handlers.RegistryHandler;
import lavx64.iridiumsource.tabs.IridiumSourceTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;
import org.apache.logging.log4j.Logger;

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

	public static Configuration config;
	public static Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		logger = event.getModLog();
		RegistryHandler.otherRegistries();
		File directory = event.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "iridium_source.cfg"));
		Config.readConfig();
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
        if (Loader.isModLoaded("ic2")) {
            RecipesIC2.addRecipes();
        }
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		if (config.hasChanged()) {
			config.save();
		}
		
	}
	
}
