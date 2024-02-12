package com.mcwdoors.kikoz;

import com.mcwdoors.kikoz.init.BlockInit;
import com.mcwdoors.kikoz.init.ItemInit;
import com.mcwdoors.kikoz.init.SoundsInit;
import com.mcwdoors.kikoz.init.TabInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("mcwdoors")
@Mod.EventBusSubscriber(modid = MacawsDoors.MOD_ID, bus = Bus.MOD)
public class MacawsDoors {
	public static final String MOD_ID = "mcwdoors";
	public static MacawsDoors instance;

	public MacawsDoors() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::doClientStuff);

		TabInit.CREATIVE_TABS.register(modEventBus);
		ItemInit.ITEMS.register(modEventBus);
		BlockInit.BLOCKS.register(modEventBus);
		SoundsInit.SOUNDS.register(modEventBus);
		

		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {

	}

	private void doClientStuff(final FMLClientSetupEvent event) {

	}

	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event) {

	}

}
