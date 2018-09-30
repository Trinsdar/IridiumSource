package lavx64.iridiumsource.init;

import java.util.ArrayList;
import java.util.List;

import lavx64.iridiumsource.objects.items.ItemBase;

import net.minecraft.item.Item;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item PRILL_PLATINA = new ItemBase("prill_platina");
	public static final Item PLATINA_190 = new ItemBase("platina_190");
	public static final Item IRIDIUM_191 = new ItemBase("iridium_191");
	public static final Item IRIDIUM_193 = new ItemBase("iridium_193");
	public static final Item COMPLEX_COMPOUND_IRIDIUM = new ItemBase("complex_compound_iridium");
}
