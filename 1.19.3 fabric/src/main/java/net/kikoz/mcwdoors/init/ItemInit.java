package net.kikoz.mcwdoors.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kikoz.mcwdoors.MacawsDoors;
import net.kikoz.mcwdoors.util.ToolTip;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {

	public static final Item PRINT_OAK = registerItem("print_oak", new ToolTip(new FabricItemSettings()));
	public static final Item PRINT_SPRUCE = registerItem("print_spruce", new ToolTip(new FabricItemSettings()));
	public static final Item PRINT_BIRCH = registerItem("print_birch", new ToolTip(new FabricItemSettings()));
	public static final Item PRINT_JUNGLE = registerItem("print_jungle", new ToolTip(new FabricItemSettings()));
	public static final Item PRINT_ACACIA = registerItem("print_acacia", new ToolTip(new FabricItemSettings()));
	public static final Item PRINT_DARK_OAK = registerItem("print_dark_oak", new ToolTip(new FabricItemSettings()));
	public static final Item PRINT_MYSTIC = registerItem("print_mystic", new ToolTip(new FabricItemSettings()));
	public static final Item PRINT_NETHER = registerItem("print_nether", new ToolTip(new FabricItemSettings()));
	public static final Item PRINT_SWAMP = registerItem("print_swamp", new ToolTip(new FabricItemSettings()));
	public static final Item PRINT_BAMBOO = registerItem("print_bamboo", new ToolTip(new FabricItemSettings()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(MacawsDoors.MOD_ID, name), item);
	}

	public static void registerModItems() {

	}
}