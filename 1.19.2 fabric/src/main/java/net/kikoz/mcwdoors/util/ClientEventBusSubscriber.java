package net.kikoz.mcwdoors.util;


import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.kikoz.mcwdoors.init.BlockInit;
import net.minecraft.client.render.RenderLayer;

public class ClientEventBusSubscriber implements ClientModInitializer {
	@Override
	public void onInitializeClient() {


		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_JAPANESE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_JAPANESE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_JAPANESE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_JAPANESE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_JAPANESE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_JAPANESE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_JAPANESE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_JAPANESE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_JAPANESE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_JAPANESE_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_JAPANESE2_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_JAPANESE2_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_JAPANESE2_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_JAPANESE2_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_JAPANESE2_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_JAPANESE2_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_JAPANESE2_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_JAPANESE2_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_JAPANESE2_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_JAPANESE2_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_BARN_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_BARN_GLASS_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_MODERN_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_COTTAGE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_COTTAGE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_COTTAGE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_COTTAGE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_COTTAGE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_COTTAGE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_COTTAGE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_COTTAGE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_COTTAGE_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_CLASSIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_CLASSIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_CLASSIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_CLASSIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_CLASSIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_CLASSIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_CLASSIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_CLASSIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_CLASSIC_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_BEACH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_BEACH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_BEACH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_BEACH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_BEACH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_BEACH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_BEACH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_BEACH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_BEACH_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_PAPER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_PAPER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_PAPER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_PAPER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_PAPER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_PAPER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_PAPER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_PAPER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_PAPER_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_FOUR_PANEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_FOUR_PANEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_FOUR_PANEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_FOUR_PANEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_FOUR_PANEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_FOUR_PANEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_FOUR_PANEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_FOUR_PANEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_FOUR_PANEL_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_TROPICAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_TROPICAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_TROPICAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_TROPICAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_TROPICAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_TROPICAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_TROPICAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_TROPICAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_TROPICAL_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.METAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.METAL_WARNING_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.METAL_HOSPITAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.METAL_REINFORCED_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.METAL_WINDOWED_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JAIL_DOOR, RenderLayer.getCutout());

	
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_GLASS_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_STABLE_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_STABLE_HEAD_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_WESTERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_WESTERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_WESTERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_WESTERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_WESTERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_WESTERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_WESTERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_WESTERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_WESTERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_WESTERN_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_MYSTIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_MYSTIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_MYSTIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_MYSTIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_MYSTIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_MYSTIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_MYSTIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_MYSTIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_MYSTIC_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_NETHER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_NETHER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_NETHER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_NETHER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_NETHER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_NETHER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_NETHER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_NETHER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_NETHER_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_BARK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_BARK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_BARK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_BARK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_BARK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_BARK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_STEM_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_STEM_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_BARK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_BARK_GLASS_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_SWAMP_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_SWAMP_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_SWAMP_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_SWAMP_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_SWAMP_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_SWAMP_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_SWAMP_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_SWAMP_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_SWAMP_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_BAMBOO_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_BAMBOO_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_BAMBOO_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_BAMBOO_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_BAMBOO_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_BAMBOO_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_BAMBOO_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_BAMBOO_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_BAMBOO_DOOR, RenderLayer.getCutout());


		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.GARAGE_WHITE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.GARAGE_SILVER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.GARAGE_GRAY_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.GARAGE_BLACK_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.STORE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SLIDING_GLASS_DOOR, RenderLayer.getCutout());





	}
}