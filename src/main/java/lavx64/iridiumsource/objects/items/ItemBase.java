package lavx64.iridiumsource.objects.items;

import lavx64.iridiumsource.util.interfaces.IHasModel;
import lavx64.iridiumsource.Main;
import lavx64.iridiumsource.init.ItemInit;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.iridiumtab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
