package com.mcwdoors.kikoz.init;

import com.mcwdoors.kikoz.MacawsDoors;
import com.mcwdoors.kikoz.objects.GarageDoor;
import com.mcwdoors.kikoz.objects.JapaneseDoors;
import com.mcwdoors.kikoz.objects.StableDoor;

import net.minecraft.block.Block;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class BlockInit {

	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsDoors.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS_METAL = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsDoors.MOD_ID);
	
	public static final RegistryObject<Block> OAK_JAPANESE_DOOR = BLOCKS.register("oak_japanese_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));
	public static final RegistryObject<Block> SPRUCE_JAPANESE_DOOR = BLOCKS.register("spruce_japanese_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));
	public static final RegistryObject<Block> BIRCH_JAPANESE_DOOR = BLOCKS.register("birch_japanese_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));
	public static final RegistryObject<Block> JUNGLE_JAPANESE_DOOR = BLOCKS.register("jungle_japanese_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));
	public static final RegistryObject<Block> ACACIA_JAPANESE_DOOR = BLOCKS.register("acacia_japanese_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));
	public static final RegistryObject<Block> DARK_OAK_JAPANESE_DOOR = BLOCKS.register("dark_oak_japanese_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));
	public static final RegistryObject<Block> CRIMSON_JAPANESE_DOOR = BLOCKS.register("crimson_japanese_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));
	public static final RegistryObject<Block> WARPED_JAPANESE_DOOR = BLOCKS.register("warped_japanese_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));
	public static final RegistryObject<Block> BAMBOO_JAPANESE_DOOR = BLOCKS.register("bamboo_japanese_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));


	public static final RegistryObject<Block> OAK_JAPANESE2_DOOR = BLOCKS.register("oak_japanese2_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));;
	public static final RegistryObject<Block> SPRUCE_JAPANESE2_DOOR = BLOCKS.register("spruce_japanese2_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));
	public static final RegistryObject<Block> BIRCH_JAPANESE2_DOOR = BLOCKS.register("birch_japanese2_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));
	public static final RegistryObject<Block> JUNGLE_JAPANESE2_DOOR = BLOCKS.register("jungle_japanese2_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));
	public static final RegistryObject<Block> ACACIA_JAPANESE2_DOOR = BLOCKS.register("acacia_japanese2_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));
	public static final RegistryObject<Block> DARK_OAK_JAPANESE2_DOOR = BLOCKS.register("dark_oak_japanese2_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));
	public static final RegistryObject<Block> CRIMSON_JAPANESE2_DOOR = BLOCKS.register("crimson_japanese2_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));
	public static final RegistryObject<Block> WARPED_JAPANESE2_DOOR = BLOCKS.register("warped_japanese2_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));
	public static final RegistryObject<Block> BAMBOO_JAPANESE2_DOOR = BLOCKS.register("bamboo_japanese2_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)));

	
	public static final RegistryObject<Block> OAK_BARN_DOOR = BLOCKS.register("oak_barn_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_BARN_DOOR = BLOCKS.register("spruce_barn_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_BARN_DOOR = BLOCKS.register("birch_barn_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_BARN_DOOR = BLOCKS.register("jungle_barn_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_BARN_DOOR = BLOCKS.register("acacia_barn_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_BARN_DOOR = BLOCKS.register("dark_oak_barn_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> CRIMSON_BARN_DOOR = BLOCKS.register("crimson_barn_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> WARPED_BARN_DOOR = BLOCKS.register("warped_barn_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BAMBOO_BARN_DOOR = BLOCKS.register("bamboo_barn_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));

	
public static final RegistryObject<Block> OAK_BARN_GLASS_DOOR = BLOCKS.register("oak_barn_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> SPRUCE_BARN_GLASS_DOOR = BLOCKS.register("spruce_barn_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_BARN_GLASS_DOOR = BLOCKS.register("birch_barn_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_BARN_GLASS_DOOR = BLOCKS.register("jungle_barn_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_BARN_GLASS_DOOR = BLOCKS.register("acacia_barn_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_BARN_GLASS_DOOR = BLOCKS.register("dark_oak_barn_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_BARN_GLASS_DOOR = BLOCKS.register("crimson_barn_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_BARN_GLASS_DOOR = BLOCKS.register("warped_barn_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_BARN_GLASS_DOOR = BLOCKS.register("bamboo_barn_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));

public static final RegistryObject<Block> OAK_MODERN_DOOR = BLOCKS.register("oak_modern_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> SPRUCE_MODERN_DOOR = BLOCKS.register("spruce_modern_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_MODERN_DOOR = BLOCKS.register("birch_modern_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_MODERN_DOOR = BLOCKS.register("jungle_modern_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_MODERN_DOOR = BLOCKS.register("acacia_modern_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_MODERN_DOOR = BLOCKS.register("dark_oak_modern_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_MODERN_DOOR = BLOCKS.register("crimson_modern_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_MODERN_DOOR = BLOCKS.register("warped_modern_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_MODERN_DOOR = BLOCKS.register("bamboo_modern_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));

public static final RegistryObject<Block> OAK_COTTAGE_DOOR = BLOCKS.register("oak_cottage_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_COTTAGE_DOOR = BLOCKS.register("birch_cottage_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_COTTAGE_DOOR = BLOCKS.register("jungle_cottage_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_COTTAGE_DOOR = BLOCKS.register("acacia_cottage_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_COTTAGE_DOOR = BLOCKS.register("dark_oak_cottage_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_COTTAGE_DOOR = BLOCKS.register("crimson_cottage_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_COTTAGE_DOOR = BLOCKS.register("warped_cottage_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_COTTAGE_DOOR = BLOCKS.register("bamboo_cottage_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));

public static final RegistryObject<Block> SPRUCE_CLASSIC_DOOR = BLOCKS.register("spruce_classic_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_CLASSIC_DOOR = BLOCKS.register("birch_classic_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_CLASSIC_DOOR = BLOCKS.register("jungle_classic_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_CLASSIC_DOOR = BLOCKS.register("acacia_classic_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_CLASSIC_DOOR = BLOCKS.register("dark_oak_classic_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_CLASSIC_DOOR = BLOCKS.register("crimson_classic_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_CLASSIC_DOOR = BLOCKS.register("warped_classic_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_CLASSIC_DOOR = BLOCKS.register("bamboo_classic_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));

public static final RegistryObject<Block> OAK_BEACH_DOOR = BLOCKS.register("oak_beach_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> SPRUCE_BEACH_DOOR = BLOCKS.register("spruce_beach_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_BEACH_DOOR = BLOCKS.register("birch_beach_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_BEACH_DOOR = BLOCKS.register("acacia_beach_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_BEACH_DOOR = BLOCKS.register("dark_oak_beach_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_BEACH_DOOR = BLOCKS.register("crimson_beach_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_BEACH_DOOR = BLOCKS.register("warped_beach_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_BEACH_DOOR = BLOCKS.register("bamboo_beach_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));

public static final RegistryObject<Block> OAK_PAPER_DOOR = BLOCKS.register("oak_paper_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> SPRUCE_PAPER_DOOR = BLOCKS.register("spruce_paper_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_PAPER_DOOR = BLOCKS.register("jungle_paper_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_PAPER_DOOR = BLOCKS.register("acacia_paper_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_PAPER_DOOR = BLOCKS.register("dark_oak_paper_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_PAPER_DOOR = BLOCKS.register("crimson_paper_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_PAPER_DOOR = BLOCKS.register("warped_paper_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_PAPER_DOOR = BLOCKS.register("bamboo_paper_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));

public static final RegistryObject<Block> OAK_FOUR_PANEL_DOOR = BLOCKS.register("oak_four_panel_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> SPRUCE_FOUR_PANEL_DOOR = BLOCKS.register("spruce_four_panel_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_FOUR_PANEL_DOOR = BLOCKS.register("birch_four_panel_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_FOUR_PANEL_DOOR = BLOCKS.register("jungle_four_panel_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_FOUR_PANEL_DOOR = BLOCKS.register("acacia_four_panel_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_FOUR_PANEL_DOOR = BLOCKS.register("crimson_four_panel_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_FOUR_PANEL_DOOR = BLOCKS.register("warped_four_panel_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_FOUR_PANEL_DOOR = BLOCKS.register("bamboo_four_panel_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));

public static final RegistryObject<Block> OAK_TROPICAL_DOOR = BLOCKS.register("oak_tropical_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> SPRUCE_TROPICAL_DOOR = BLOCKS.register("spruce_tropical_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_TROPICAL_DOOR = BLOCKS.register("birch_tropical_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_TROPICAL_DOOR = BLOCKS.register("jungle_tropical_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_TROPICAL_DOOR = BLOCKS.register("dark_oak_tropical_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_TROPICAL_DOOR = BLOCKS.register("crimson_tropical_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_TROPICAL_DOOR = BLOCKS.register("warped_tropical_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_TROPICAL_DOOR = BLOCKS.register("bamboo_tropical_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));

public static final RegistryObject<Block> METAL_DOOR = BLOCKS_METAL.register("metal_door", () -> new DoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).noOcclusion().requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.METAL)));
public static final RegistryObject<Block> METAL_WARNING_DOOR = BLOCKS_METAL.register("metal_warning_door", () -> new DoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().noOcclusion().strength(1.5F,6.0F).sound(SoundType.METAL)));
public static final RegistryObject<Block> METAL_HOSPITAL_DOOR = BLOCKS_METAL.register("metal_hospital_door", () -> new DoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().noOcclusion().strength(1.5F,6.0F).sound(SoundType.METAL)));
public static final RegistryObject<Block> METAL_REINFORCED_DOOR = BLOCKS_METAL.register("metal_reinforced_door", () -> new DoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().noOcclusion().strength(1.5F,6.0F).sound(SoundType.METAL)));
public static final RegistryObject<Block> METAL_WINDOWED_DOOR = BLOCKS_METAL.register("metal_windowed_door", () -> new DoorBlock(Block.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().noOcclusion().strength(1.5F,6.0F).sound(SoundType.METAL)));
public static final RegistryObject<Block> JAIL_DOOR = BLOCKS_METAL.register("jail_door", () -> new JapaneseDoors(Block.Properties.of(Material.METAL, MaterialColor.METAL).noOcclusion().strength(2.5F,3.0F).sound(SoundType.METAL)));;

	
	
public static final RegistryObject<Block> OAK_GLASS_DOOR = BLOCKS.register("oak_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> SPRUCE_GLASS_DOOR = BLOCKS.register("spruce_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_GLASS_DOOR = BLOCKS.register("birch_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_GLASS_DOOR = BLOCKS.register("jungle_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_GLASS_DOOR = BLOCKS.register("acacia_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_GLASS_DOOR = BLOCKS.register("dark_oak_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_GLASS_DOOR = BLOCKS.register("crimson_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_GLASS_DOOR = BLOCKS.register("warped_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_GLASS_DOOR = BLOCKS.register("bamboo_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));

public static final RegistryObject<Block> OAK_STABLE_DOOR = BLOCKS.register("oak_stable_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> SPRUCE_STABLE_DOOR = BLOCKS.register("spruce_stable_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_STABLE_DOOR = BLOCKS.register("birch_stable_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_STABLE_DOOR = BLOCKS.register("jungle_stable_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_STABLE_DOOR = BLOCKS.register("acacia_stable_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_STABLE_DOOR = BLOCKS.register("dark_oak_stable_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_STABLE_DOOR = BLOCKS.register("crimson_stable_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_STABLE_DOOR = BLOCKS.register("warped_stable_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_STABLE_DOOR = BLOCKS.register("bamboo_stable_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));

public static final RegistryObject<Block> OAK_STABLE_HEAD_DOOR = BLOCKS.register("oak_stable_head_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> SPRUCE_STABLE_HEAD_DOOR = BLOCKS.register("spruce_stable_head_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_STABLE_HEAD_DOOR = BLOCKS.register("birch_stable_head_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_STABLE_HEAD_DOOR = BLOCKS.register("jungle_stable_head_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_STABLE_HEAD_DOOR = BLOCKS.register("acacia_stable_head_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_STABLE_HEAD_DOOR = BLOCKS.register("dark_oak_stable_head_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_STABLE_HEAD_DOOR = BLOCKS.register("crimson_stable_head_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_STABLE_HEAD_DOOR = BLOCKS.register("warped_stable_head_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_STABLE_HEAD_DOOR = BLOCKS.register("bamboo_stable_head_door", () -> new StableDoor(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));

public static final RegistryObject<Block> OAK_WESTERN_DOOR = BLOCKS.register("oak_western_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> SPRUCE_WESTERN_DOOR = BLOCKS.register("spruce_western_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_WESTERN_DOOR = BLOCKS.register("birch_western_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_WESTERN_DOOR = BLOCKS.register("jungle_western_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_WESTERN_DOOR = BLOCKS.register("acacia_western_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_WESTERN_DOOR = BLOCKS.register("dark_oak_western_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_WESTERN_DOOR = BLOCKS.register("crimson_western_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_WESTERN_DOOR = BLOCKS.register("warped_western_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_WESTERN_DOOR = BLOCKS.register("bamboo_western_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)));

public static final RegistryObject<Block> OAK_MYSTIC_DOOR = BLOCKS.register("oak_mystic_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> SPRUCE_MYSTIC_DOOR = BLOCKS.register("spruce_mystic_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_MYSTIC_DOOR = BLOCKS.register("birch_mystic_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_MYSTIC_DOOR = BLOCKS.register("jungle_mystic_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_MYSTIC_DOOR = BLOCKS.register("acacia_mystic_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_MYSTIC_DOOR = BLOCKS.register("dark_oak_mystic_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_MYSTIC_DOOR = BLOCKS.register("crimson_mystic_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_MYSTIC_DOOR = BLOCKS.register("bamboo_mystic_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));

public static final RegistryObject<Block> OAK_NETHER_DOOR = BLOCKS.register("oak_nether_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> SPRUCE_NETHER_DOOR = BLOCKS.register("spruce_nether_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_NETHER_DOOR = BLOCKS.register("birch_nether_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_NETHER_DOOR = BLOCKS.register("jungle_nether_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_NETHER_DOOR = BLOCKS.register("acacia_nether_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_NETHER_DOOR = BLOCKS.register("dark_oak_nether_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_NETHER_DOOR = BLOCKS.register("warped_nether_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_NETHER_DOOR = BLOCKS.register("bamboo_nether_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));

public static final RegistryObject<Block> OAK_SWAMP_DOOR = BLOCKS.register("oak_swamp_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> SPRUCE_SWAMP_DOOR = BLOCKS.register("spruce_swamp_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_SWAMP_DOOR = BLOCKS.register("birch_swamp_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_SWAMP_DOOR = BLOCKS.register("jungle_swamp_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_SWAMP_DOOR = BLOCKS.register("acacia_swamp_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_SWAMP_DOOR = BLOCKS.register("dark_oak_swamp_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_SWAMP_DOOR = BLOCKS.register("crimson_swamp_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_SWAMP_DOOR = BLOCKS.register("warped_swamp_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_SWAMP_DOOR = BLOCKS.register("bamboo_swamp_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));

public static final RegistryObject<Block> OAK_BAMBOO_DOOR = BLOCKS.register("oak_bamboo_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> SPRUCE_BAMBOO_DOOR = BLOCKS.register("spruce_bamboo_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_BAMBOO_DOOR = BLOCKS.register("birch_bamboo_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_BAMBOO_DOOR = BLOCKS.register("jungle_bamboo_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_BAMBOO_DOOR = BLOCKS.register("acacia_bamboo_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_BAMBOO_DOOR = BLOCKS.register("dark_oak_bamboo_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_BAMBOO_DOOR = BLOCKS.register("crimson_bamboo_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_BAMBOO_DOOR = BLOCKS.register("warped_bamboo_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));

public static final RegistryObject<Block> OAK_BARK_GLASS_DOOR = BLOCKS.register("oak_bark_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> SPRUCE_BARK_GLASS_DOOR = BLOCKS.register("spruce_bark_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_BARK_GLASS_DOOR = BLOCKS.register("birch_bark_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_BARK_GLASS_DOOR = BLOCKS.register("jungle_bark_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_BARK_GLASS_DOOR = BLOCKS.register("acacia_bark_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_BARK_GLASS_DOOR = BLOCKS.register("dark_oak_bark_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_STEM_GLASS_DOOR = BLOCKS.register("crimson_stem_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_STEM_GLASS_DOOR = BLOCKS.register("warped_stem_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_BARK_GLASS_DOOR = BLOCKS.register("bamboo_bark_glass_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
 
public static final RegistryObject<Block> GARAGE_WHITE_DOOR = BLOCKS_METAL.register("garage_white_door", () -> new GarageDoor(Block.Properties.of(Material.METAL, MaterialColor.METAL).noOcclusion().strength(3.0F,5.0F).sound(SoundType.METAL)));
public static final RegistryObject<Block> GARAGE_SILVER_DOOR = BLOCKS_METAL.register("garage_silver_door", () -> new GarageDoor(Block.Properties.of(Material.METAL, MaterialColor.METAL).noOcclusion().strength(3.0F,5.0F).sound(SoundType.METAL)));
public static final RegistryObject<Block> GARAGE_GRAY_DOOR = BLOCKS_METAL.register("garage_gray_door", () -> new GarageDoor(Block.Properties.of(Material.METAL, MaterialColor.METAL).noOcclusion().strength(3.0F,5.0F).sound(SoundType.METAL)));
public static final RegistryObject<Block> GARAGE_BLACK_DOOR = BLOCKS_METAL.register("garage_black_door", () -> new GarageDoor(Block.Properties.of(Material.METAL, MaterialColor.METAL).noOcclusion().strength(3.0F,5.0F).sound(SoundType.METAL)));

public static final RegistryObject<Block> WOODEN_PORTCULLIS = BLOCKS.register("wooden_portcullis", () -> new GarageDoor(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> IRON_PORTCULLIS = BLOCKS_METAL.register("iron_portcullis", () -> new GarageDoor(Block.Properties.of(Material.METAL, MaterialColor.METAL).noOcclusion().strength(3.0F,5.0F).sound(SoundType.METAL)));
	
public static final RegistryObject<Block> STORE_DOOR = BLOCKS_METAL.register("store_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.METAL).noOcclusion().strength(2.0F,3.0F).sound(SoundType.METAL)));
public static final RegistryObject<Block> SLIDING_GLASS_DOOR = BLOCKS_METAL.register("sliding_glass_door", () -> new JapaneseDoors(Block.Properties.of(Material.WOOD, MaterialColor.METAL).noOcclusion().strength(2.0F,3.0F).sound(SoundType.METAL)));


public static final RegistryObject<Block> OAK_WAFFLE_DOOR = BLOCKS.register("oak_waffle_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> SPRUCE_WAFFLE_DOOR = BLOCKS.register("spruce_waffle_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BIRCH_WAFFLE_DOOR = BLOCKS.register("birch_waffle_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> JUNGLE_WAFFLE_DOOR = BLOCKS.register("jungle_waffle_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> ACACIA_WAFFLE_DOOR = BLOCKS.register("acacia_waffle_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> DARK_OAK_WAFFLE_DOOR = BLOCKS.register("dark_oak_waffle_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> CRIMSON_WAFFLE_DOOR = BLOCKS.register("crimson_waffle_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> WARPED_WAFFLE_DOOR = BLOCKS.register("warped_waffle_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
public static final RegistryObject<Block> BAMBOO_WAFFLE_DOOR = BLOCKS.register("bamboo_waffle_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)));
	


}