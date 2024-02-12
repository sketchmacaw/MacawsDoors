package com.mcwdoors.kikoz.util;

import com.mcwdoors.kikoz.MacawsDoors;
import com.mcwdoors.kikoz.init.BlockInit;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MacawsDoors.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	
	
	
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {

		RenderTypeLookup.setRenderLayer(BlockInit.OAK_JAPANESE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_JAPANESE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_JAPANESE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_JAPANESE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_JAPANESE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_JAPANESE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_JAPANESE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_JAPANESE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_JAPANESE_DOOR.get(), RenderType.cutout());
	
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_JAPANESE2_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_JAPANESE2_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_JAPANESE2_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_JAPANESE2_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_JAPANESE2_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_JAPANESE2_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_JAPANESE2_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_JAPANESE2_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_JAPANESE2_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.OAK_BARN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_BARN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_BARN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_BARN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_BARN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_BARN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_BARN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_BARN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_BARN_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.OAK_BARN_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_BARN_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_BARN_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_BARN_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_BARN_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_BARN_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_BARN_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_BARN_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_BARN_GLASS_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.OAK_MODERN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_MODERN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_MODERN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_MODERN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_MODERN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_MODERN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_MODERN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_MODERN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_MODERN_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.OAK_COTTAGE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_COTTAGE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_COTTAGE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_COTTAGE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_COTTAGE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_COTTAGE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_COTTAGE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_COTTAGE_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_CLASSIC_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_CLASSIC_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_CLASSIC_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_CLASSIC_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_CLASSIC_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_CLASSIC_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_CLASSIC_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_CLASSIC_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.OAK_BEACH_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_BEACH_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_BEACH_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_BEACH_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_BEACH_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_BEACH_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_BEACH_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_BEACH_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.OAK_PAPER_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_PAPER_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_PAPER_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_PAPER_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_PAPER_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_PAPER_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_PAPER_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_PAPER_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.OAK_FOUR_PANEL_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_FOUR_PANEL_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_FOUR_PANEL_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_FOUR_PANEL_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_FOUR_PANEL_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_FOUR_PANEL_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_FOUR_PANEL_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_FOUR_PANEL_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.OAK_TROPICAL_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_TROPICAL_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_TROPICAL_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_TROPICAL_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_TROPICAL_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_TROPICAL_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_TROPICAL_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_TROPICAL_DOOR.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.METAL_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.METAL_WARNING_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.METAL_HOSPITAL_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.METAL_REINFORCED_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.METAL_WINDOWED_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JAIL_DOOR.get(), RenderType.cutout());

	
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_GLASS_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.OAK_STABLE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_STABLE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_STABLE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_STABLE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_STABLE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_STABLE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_STABLE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_STABLE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_STABLE_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.OAK_STABLE_HEAD_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_STABLE_HEAD_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_STABLE_HEAD_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_STABLE_HEAD_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_STABLE_HEAD_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_STABLE_HEAD_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_STABLE_HEAD_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_STABLE_HEAD_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_STABLE_HEAD_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.OAK_WESTERN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_WESTERN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_WESTERN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_WESTERN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_WESTERN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_WESTERN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_WESTERN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_WESTERN_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_WESTERN_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.OAK_MYSTIC_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_MYSTIC_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_MYSTIC_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_MYSTIC_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_MYSTIC_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_MYSTIC_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_MYSTIC_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_MYSTIC_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.OAK_NETHER_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_NETHER_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_NETHER_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_NETHER_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_NETHER_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_NETHER_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_NETHER_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_NETHER_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.OAK_BARK_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_BARK_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_BARK_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_BARK_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_BARK_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_BARK_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_STEM_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_STEM_GLASS_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_BARK_GLASS_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_SWAMP_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_SWAMP_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_SWAMP_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_SWAMP_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_SWAMP_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_SWAMP_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_SWAMP_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_SWAMP_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_SWAMP_DOOR.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_BAMBOO_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_BAMBOO_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_BAMBOO_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_BAMBOO_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_BAMBOO_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_BAMBOO_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_BAMBOO_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_BAMBOO_DOOR.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.STORE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SLIDING_GLASS_DOOR.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.GARAGE_WHITE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.GARAGE_SILVER_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.GARAGE_GRAY_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.GARAGE_BLACK_DOOR.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_WAFFLE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_WAFFLE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_WAFFLE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_WAFFLE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_WAFFLE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_WAFFLE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_WAFFLE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_WAFFLE_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_WAFFLE_DOOR.get(), RenderType.cutout());
		
	}
}