package com.mcwdoors.kikoz;

import javax.annotation.Nonnull;

import com.mcwdoors.kikoz.init.BlockInit;
import com.mcwdoors.kikoz.init.ItemInit;
import com.mcwdoors.kikoz.init.SoundsInit;
import com.mcwdoors.kikoz.util.FuelItemBlock;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;


@Mod("mcwdoors")
@Mod.EventBusSubscriber(modid = MacawsDoors.MOD_ID, bus = Bus.MOD)
public class MacawsDoors {
	public static final String MOD_ID = "mcwdoors";
	public static MacawsDoors instance;

	public MacawsDoors() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::doClientStuff);

		ItemInit.ITEMS.register(modEventBus);
		BlockInit.BLOCKS.register(modEventBus);
		BlockInit.BLOCKS_METAL.register(modEventBus);
		SoundsInit.SOUNDS.register(modEventBus);

		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().tab(DoorItemGroup);
			final BlockItem blockItem = new FuelItemBlock(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});
		
		BlockInit.BLOCKS_METAL.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().tab(DoorItemGroup);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});
	}
	
	
	private void setup(final FMLCommonSetupEvent event) {

	}

	private void doClientStuff(final FMLClientSetupEvent event) {

	}

	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {

	}

    public static final ItemGroup DoorItemGroup = new ItemGroup("mcwdoors") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.OAK_MODERN_DOOR.get());
        }
    };
    
    
    

    
    
    

}
