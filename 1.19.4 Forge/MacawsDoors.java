package com.mcwdoors.kikoz;

import com.mcwdoors.kikoz.init.BlockInit;
import com.mcwdoors.kikoz.init.ItemInit;
import com.mcwdoors.kikoz.init.SoundsInit;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
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

		ItemInit.register(modEventBus);
		BlockInit.register(modEventBus);
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

	public static CreativeModeTab DoorItemGroup;

	@SubscribeEvent
	public static void register(CreativeModeTabEvent.Register event) {
		DoorItemGroup = event.registerCreativeModeTab(new ResourceLocation("mcwdoors", MacawsDoors.MOD_ID),
				builder -> builder.icon(() -> new ItemStack(BlockInit.OAK_MODERN_DOOR.get()))
						.displayItems((parameters, output) -> ItemInit.ITEMS.getEntries()
								.forEach(o -> output.accept(o.get())))
						.title(Component.translatable("itemGroup.mcwdoors")));
	}

}
