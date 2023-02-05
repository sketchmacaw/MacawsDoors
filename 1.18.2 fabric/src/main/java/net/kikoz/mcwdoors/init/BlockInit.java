package net.kikoz.mcwdoors.init;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kikoz.mcwdoors.MacawsDoors;
import net.kikoz.mcwdoors.objects.DoorClassic;
import net.kikoz.mcwdoors.objects.GarageDoor;
import net.kikoz.mcwdoors.objects.JapaneseDoors;
import net.kikoz.mcwdoors.objects.StableDoor;
import net.kikoz.mcwdoors.util.DoorItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class BlockInit {
	
	public static final Block OAK_JAPANESE_DOOR = registerBlock("oak_japanese_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_JAPANESE_DOOR = registerBlock("spruce_japanese_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_JAPANESE_DOOR = registerBlock("birch_japanese_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_JAPANESE_DOOR = registerBlock("jungle_japanese_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_JAPANESE_DOOR = registerBlock("acacia_japanese_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_JAPANESE_DOOR = registerBlock("dark_oak_japanese_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_JAPANESE_DOOR = registerBlock("crimson_japanese_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_JAPANESE_DOOR = registerBlock("warped_japanese_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_JAPANESE_DOOR = registerBlock("bamboo_japanese_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);

	public static final Block OAK_JAPANESE2_DOOR = registerBlock("oak_japanese2_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_JAPANESE2_DOOR = registerBlock("spruce_japanese2_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_JAPANESE2_DOOR = registerBlock("birch_japanese2_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_JAPANESE2_DOOR = registerBlock("jungle_japanese2_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_JAPANESE2_DOOR = registerBlock("acacia_japanese2_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_JAPANESE2_DOOR = registerBlock("dark_oak_japanese2_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_JAPANESE2_DOOR = registerBlock("crimson_japanese2_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_JAPANESE2_DOOR = registerBlock("warped_japanese2_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_JAPANESE2_DOOR = registerBlock("bamboo_japanese2_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(1.5F,1.0F).sounds(BlockSoundGroup.SCAFFOLDING)), DoorItemGroup.DOORITEMGROUP);

	public static final Block OAK_BARN_DOOR = registerBlock("oak_barn_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_BARN_DOOR = registerBlock("spruce_barn_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_BARN_DOOR = registerBlock("birch_barn_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_BARN_DOOR = registerBlock("jungle_barn_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_BARN_DOOR = registerBlock("acacia_barn_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_BARN_DOOR = registerBlock("dark_oak_barn_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_BARN_DOOR = registerBlock("crimson_barn_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_BARN_DOOR = registerBlock("warped_barn_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_BARN_DOOR = registerBlock("bamboo_barn_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);

	public static final Block OAK_BARN_GLASS_DOOR = registerBlock("oak_barn_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_BARN_GLASS_DOOR = registerBlock("spruce_barn_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_BARN_GLASS_DOOR = registerBlock("birch_barn_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_BARN_GLASS_DOOR = registerBlock("jungle_barn_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_BARN_GLASS_DOOR = registerBlock("acacia_barn_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_BARN_GLASS_DOOR = registerBlock("dark_oak_barn_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_BARN_GLASS_DOOR = registerBlock("crimson_barn_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_BARN_GLASS_DOOR = registerBlock("warped_barn_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_BARN_GLASS_DOOR = registerBlock("bamboo_barn_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);

	public static final Block OAK_MODERN_DOOR = registerBlock("oak_modern_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_MODERN_DOOR = registerBlock("spruce_modern_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_MODERN_DOOR = registerBlock("birch_modern_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_MODERN_DOOR = registerBlock("jungle_modern_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_MODERN_DOOR = registerBlock("acacia_modern_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_MODERN_DOOR = registerBlock("dark_oak_modern_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_MODERN_DOOR = registerBlock("crimson_modern_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_MODERN_DOOR = registerBlock("warped_modern_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_MODERN_DOOR = registerBlock("bamboo_modern_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);

	public static final Block OAK_COTTAGE_DOOR = registerBlock("oak_cottage_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_COTTAGE_DOOR = registerBlock("birch_cottage_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_COTTAGE_DOOR = registerBlock("jungle_cottage_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_COTTAGE_DOOR = registerBlock("acacia_cottage_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_COTTAGE_DOOR = registerBlock("dark_oak_cottage_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_COTTAGE_DOOR = registerBlock("crimson_cottage_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_COTTAGE_DOOR = registerBlock("warped_cottage_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_COTTAGE_DOOR = registerBlock("bamboo_cottage_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);

	public static final Block SPRUCE_CLASSIC_DOOR = registerBlock("spruce_classic_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_CLASSIC_DOOR = registerBlock("birch_classic_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_CLASSIC_DOOR = registerBlock("jungle_classic_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_CLASSIC_DOOR = registerBlock("acacia_classic_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_CLASSIC_DOOR = registerBlock("dark_oak_classic_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_CLASSIC_DOOR = registerBlock("crimson_classic_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_CLASSIC_DOOR = registerBlock("warped_classic_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_CLASSIC_DOOR = registerBlock("bamboo_classic_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);

	public static final Block OAK_BEACH_DOOR = registerBlock("oak_beach_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_BEACH_DOOR = registerBlock("spruce_beach_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_BEACH_DOOR = registerBlock("birch_beach_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_BEACH_DOOR = registerBlock("acacia_beach_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_BEACH_DOOR = registerBlock("dark_oak_beach_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_BEACH_DOOR = registerBlock("crimson_beach_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_BEACH_DOOR = registerBlock("warped_beach_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_BEACH_DOOR = registerBlock("bamboo_beach_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);

	public static final Block OAK_PAPER_DOOR = registerBlock("oak_paper_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_PAPER_DOOR = registerBlock("spruce_paper_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_PAPER_DOOR = registerBlock("jungle_paper_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_PAPER_DOOR = registerBlock("acacia_paper_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_PAPER_DOOR = registerBlock("dark_oak_paper_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_PAPER_DOOR = registerBlock("crimson_paper_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_PAPER_DOOR = registerBlock("warped_paper_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_PAPER_DOOR = registerBlock("bamboo_paper_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);

	public static final Block OAK_FOUR_PANEL_DOOR = registerBlock("oak_four_panel_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_FOUR_PANEL_DOOR = registerBlock("spruce_four_panel_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_FOUR_PANEL_DOOR = registerBlock("birch_four_panel_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_FOUR_PANEL_DOOR = registerBlock("jungle_four_panel_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_FOUR_PANEL_DOOR = registerBlock("acacia_four_panel_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_FOUR_PANEL_DOOR = registerBlock("crimson_four_panel_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_FOUR_PANEL_DOOR = registerBlock("warped_four_panel_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_FOUR_PANEL_DOOR = registerBlock("bamboo_four_panel_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);

	public static final Block OAK_TROPICAL_DOOR = registerBlock("oak_tropical_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_TROPICAL_DOOR = registerBlock("spruce_tropical_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_TROPICAL_DOOR = registerBlock("birch_tropical_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_TROPICAL_DOOR = registerBlock("jungle_tropical_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_TROPICAL_DOOR = registerBlock("dark_oak_tropical_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_TROPICAL_DOOR = registerBlock("crimson_tropical_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_TROPICAL_DOOR = registerBlock("warped_tropical_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_TROPICAL_DOOR = registerBlock("bamboo_tropical_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);

	public static final Block METAL_DOOR = registerBlock("metal_door", new DoorClassic(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).nonOpaque().strength(1.5F,6.0F).sounds(BlockSoundGroup.METAL).requiresTool()), DoorItemGroup.DOORITEMGROUP);
	public static final Block METAL_WARNING_DOOR = registerBlock("metal_warning_door", new DoorClassic(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).nonOpaque().strength(1.5F,6.0F).sounds(BlockSoundGroup.METAL).requiresTool()), DoorItemGroup.DOORITEMGROUP);
	public static final Block METAL_HOSPITAL_DOOR = registerBlock("metal_hospital_door", new DoorClassic(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).nonOpaque().strength(1.5F,6.0F).sounds(BlockSoundGroup.METAL).requiresTool()), DoorItemGroup.DOORITEMGROUP);
	public static final Block METAL_REINFORCED_DOOR = registerBlock("metal_reinforced_door", new DoorClassic(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).nonOpaque().strength(1.5F,6.0F).sounds(BlockSoundGroup.METAL).requiresTool()), DoorItemGroup.DOORITEMGROUP);
	public static final Block METAL_WINDOWED_DOOR = registerBlock("metal_windowed_door", new DoorClassic(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).nonOpaque().strength(1.5F,6.0F).sounds(BlockSoundGroup.METAL).requiresTool()), DoorItemGroup.DOORITEMGROUP);
	public static final Block JAIL_DOOR = registerBlock("jail_door", new JapaneseDoors(FabricBlockSettings.of(Material.METAL, MapColor.GRAY).nonOpaque().strength(2.0F,3.5F).sounds(BlockSoundGroup.METAL).requiresTool()), DoorItemGroup.DOORITEMGROUP);

	public static final Block OAK_GLASS_DOOR = registerBlock("oak_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_GLASS_DOOR = registerBlock("spruce_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_GLASS_DOOR = registerBlock("birch_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_GLASS_DOOR = registerBlock("jungle_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_GLASS_DOOR = registerBlock("acacia_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_GLASS_DOOR = registerBlock("dark_oak_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_GLASS_DOOR = registerBlock("crimson_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_GLASS_DOOR = registerBlock("warped_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_GLASS_DOOR = registerBlock("bamboo_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);

	public static final Block OAK_STABLE_DOOR = registerBlock("oak_stable_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_STABLE_DOOR = registerBlock("spruce_stable_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_STABLE_DOOR = registerBlock("birch_stable_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_STABLE_DOOR = registerBlock("jungle_stable_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_STABLE_DOOR = registerBlock("acacia_stable_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_STABLE_DOOR = registerBlock("dark_oak_stable_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_STABLE_DOOR = registerBlock("crimson_stable_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_STABLE_DOOR = registerBlock("warped_stable_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_STABLE_DOOR = registerBlock("bamboo_stable_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);

	public static final Block OAK_STABLE_HEAD_DOOR = registerBlock("oak_stable_head_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_STABLE_HEAD_DOOR = registerBlock("spruce_stable_head_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_STABLE_HEAD_DOOR = registerBlock("birch_stable_head_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_STABLE_HEAD_DOOR = registerBlock("jungle_stable_head_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_STABLE_HEAD_DOOR = registerBlock("acacia_stable_head_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_STABLE_HEAD_DOOR = registerBlock("dark_oak_stable_head_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_STABLE_HEAD_DOOR = registerBlock("crimson_stable_head_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_STABLE_HEAD_DOOR = registerBlock("warped_stable_head_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_STABLE_HEAD_DOOR = registerBlock("bamboo_stable_head_door", new StableDoor(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);

	public static final Block OAK_WESTERN_DOOR = registerBlock("oak_western_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_WESTERN_DOOR = registerBlock("spruce_western_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_WESTERN_DOOR = registerBlock("birch_western_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_WESTERN_DOOR = registerBlock("jungle_western_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_WESTERN_DOOR = registerBlock("acacia_western_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_WESTERN_DOOR = registerBlock("dark_oak_western_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_WESTERN_DOOR = registerBlock("crimson_western_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_WESTERN_DOOR = registerBlock("warped_western_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_WESTERN_DOOR = registerBlock("bamboo_western_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(3.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);

	public static final Block OAK_MYSTIC_DOOR = registerBlock("oak_mystic_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_MYSTIC_DOOR = registerBlock("spruce_mystic_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_MYSTIC_DOOR = registerBlock("birch_mystic_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_MYSTIC_DOOR = registerBlock("jungle_mystic_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_MYSTIC_DOOR = registerBlock("acacia_mystic_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_MYSTIC_DOOR = registerBlock("dark_oak_mystic_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_MYSTIC_DOOR = registerBlock("crimson_mystic_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_MYSTIC_DOOR = registerBlock("bamboo_mystic_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);

	public static final Block OAK_NETHER_DOOR = registerBlock("oak_nether_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_NETHER_DOOR = registerBlock("spruce_nether_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_NETHER_DOOR = registerBlock("birch_nether_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_NETHER_DOOR = registerBlock("jungle_nether_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_NETHER_DOOR = registerBlock("acacia_nether_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_NETHER_DOOR = registerBlock("dark_oak_nether_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_NETHER_DOOR = registerBlock("warped_nether_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_NETHER_DOOR = registerBlock("bamboo_nether_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	
	public static final Block OAK_SWAMP_DOOR = registerBlock("oak_swamp_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_SWAMP_DOOR = registerBlock("spruce_swamp_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_SWAMP_DOOR = registerBlock("birch_swamp_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_SWAMP_DOOR = registerBlock("jungle_swamp_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_SWAMP_DOOR = registerBlock("acacia_swamp_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_SWAMP_DOOR = registerBlock("dark_oak_swamp_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_SWAMP_DOOR = registerBlock("warped_swamp_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_SWAMP_DOOR = registerBlock("crimson_swamp_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_SWAMP_DOOR = registerBlock("bamboo_swamp_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	
	public static final Block OAK_BAMBOO_DOOR = registerBlock("oak_bamboo_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_BAMBOO_DOOR = registerBlock("spruce_bamboo_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_BAMBOO_DOOR = registerBlock("birch_bamboo_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_BAMBOO_DOOR = registerBlock("jungle_bamboo_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_BAMBOO_DOOR = registerBlock("acacia_bamboo_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_BAMBOO_DOOR = registerBlock("dark_oak_bamboo_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_BAMBOO_DOOR = registerBlock("warped_bamboo_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_BAMBOO_DOOR = registerBlock("crimson_bamboo_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);

	public static final Block OAK_BARK_GLASS_DOOR = registerBlock("oak_bark_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SPRUCE_BARK_GLASS_DOOR = registerBlock("spruce_bark_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BIRCH_BARK_GLASS_DOOR = registerBlock("birch_bark_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block JUNGLE_BARK_GLASS_DOOR = registerBlock("jungle_bark_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block ACACIA_BARK_GLASS_DOOR = registerBlock("acacia_bark_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block DARK_OAK_BARK_GLASS_DOOR = registerBlock("dark_oak_bark_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block CRIMSON_STEM_GLASS_DOOR = registerBlock("crimson_stem_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block WARPED_STEM_GLASS_DOOR = registerBlock("warped_stem_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.LICHEN_GREEN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block BAMBOO_BARK_GLASS_DOOR = registerBlock("bamboo_bark_glass_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.DULL_RED).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);


	public static final Block GARAGE_WHITE_DOOR = registerBlock("garage_white_door", new GarageDoor(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).nonOpaque().strength(3.0F,5.0F).sounds(BlockSoundGroup.METAL).requiresTool()), DoorItemGroup.DOORITEMGROUP);
	public static final Block GARAGE_SILVER_DOOR = registerBlock("garage_silver_door", new GarageDoor(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).nonOpaque().strength(3.0F,5.0F).sounds(BlockSoundGroup.METAL).requiresTool()), DoorItemGroup.DOORITEMGROUP);
	public static final Block GARAGE_GRAY_DOOR = registerBlock("garage_gray_door", new GarageDoor(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).nonOpaque().strength(3.0F,5.0F).sounds(BlockSoundGroup.METAL).requiresTool()), DoorItemGroup.DOORITEMGROUP);
	public static final Block GARAGE_BLACK_DOOR = registerBlock("garage_black_door", new GarageDoor(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).nonOpaque().strength(3.0F,5.0F).sounds(BlockSoundGroup.METAL).requiresTool()), DoorItemGroup.DOORITEMGROUP);

	public static final Block WOODEN_PORTCULLIS = registerBlock("wooden_portcullis", new GarageDoor(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.WOOD)), DoorItemGroup.DOORITEMGROUP);
	public static final Block IRON_PORTCULLIS = registerBlock("iron_portcullis", new GarageDoor(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).nonOpaque().strength(2.0F,5.0F).sounds(BlockSoundGroup.METAL)), DoorItemGroup.DOORITEMGROUP);

	public static final Block STORE_DOOR = registerBlock("store_door", new DoorClassic(FabricBlockSettings.of(Material.WOOD, MapColor.IRON_GRAY).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.METAL)), DoorItemGroup.DOORITEMGROUP);
	public static final Block SLIDING_GLASS_DOOR = registerBlock("sliding_glass_door", new JapaneseDoors(FabricBlockSettings.of(Material.WOOD, MapColor.GRAY).nonOpaque().strength(2.0F,3.0F).sounds(BlockSoundGroup.METAL)), DoorItemGroup.DOORITEMGROUP);

    //credit by Kaupenjoe - from tutorial series


	private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
		registerBlockItem(name, block, group, tooltipKey);
		return Registry.register(Registry.BLOCK, new Identifier(MacawsDoors.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
		return Registry.register(Registry.ITEM, new Identifier(MacawsDoors.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings().group(group)) {
					@Override
					public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
						tooltip.add(new TranslatableText(tooltipKey).formatted(Formatting.GRAY));
					}
				});
	}


	private static Block registerBlock(String name, Block block, ItemGroup group) {
		registerBlockItem(name, block, group);
		return Registry.register(Registry.BLOCK, new Identifier(MacawsDoors.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block, ItemGroup group) {
		return Registry.register(Registry.ITEM, new Identifier(MacawsDoors.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings().group(group)));
	}

	public static void registerModBlocks() {
	}
}