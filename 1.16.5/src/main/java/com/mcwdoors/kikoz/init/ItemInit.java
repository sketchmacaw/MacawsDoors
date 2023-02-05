package com.mcwdoors.kikoz.init;

import com.mcwdoors.kikoz.MacawsDoors;
import com.mcwdoors.kikoz.util.ToolTip;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MacawsDoors.MOD_ID);
	
	public static final RegistryObject<Item> PRINT_OAK = ITEMS.register("print_oak", () -> new ToolTip(new Item.Properties().tab(MacawsDoors.DoorItemGroup)));
	public static final RegistryObject<Item> PRINT_SPRUCE = ITEMS.register("print_spruce", () -> new ToolTip(new Item.Properties().tab(MacawsDoors.DoorItemGroup)));
	public static final RegistryObject<Item> PRINT_BIRCH = ITEMS.register("print_birch", () -> new ToolTip(new Item.Properties().tab(MacawsDoors.DoorItemGroup)));
	public static final RegistryObject<Item> PRINT_JUNGLE = ITEMS.register("print_jungle", () -> new ToolTip(new Item.Properties().tab(MacawsDoors.DoorItemGroup)));
	public static final RegistryObject<Item> PRINT_ACACIA = ITEMS.register("print_acacia", () -> new ToolTip(new Item.Properties().tab(MacawsDoors.DoorItemGroup)));
	public static final RegistryObject<Item> PRINT_DARK_OAK = ITEMS.register("print_dark_oak", () -> new ToolTip(new Item.Properties().tab(MacawsDoors.DoorItemGroup)));
	public static final RegistryObject<Item> PRINT_MYSTIC = ITEMS.register("print_mystic", () -> new ToolTip(new Item.Properties().tab(MacawsDoors.DoorItemGroup)));
	public static final RegistryObject<Item> PRINT_NETHER = ITEMS.register("print_nether", () -> new ToolTip(new Item.Properties().tab(MacawsDoors.DoorItemGroup)));
	public static final RegistryObject<Item> PRINT_SWAMP = ITEMS.register("print_swamp", () -> new ToolTip(new Item.Properties().tab(MacawsDoors.DoorItemGroup)));
	public static final RegistryObject<Item> PRINT_BAMBOO = ITEMS.register("print_bamboo", () -> new ToolTip(new Item.Properties().tab(MacawsDoors.DoorItemGroup)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}