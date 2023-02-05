package com.mcwdoors.kikoz.init;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import javax.annotation.Nullable;

import com.mcwdoors.kikoz.MacawsDoors;
import com.mcwdoors.kikoz.objects.GarageDoor;
import com.mcwdoors.kikoz.objects.JapaneseDoors;
import com.mcwdoors.kikoz.objects.StableDoor;
import com.mcwdoors.kikoz.util.FuelItemBlock;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class BlockInit {

	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsDoors.MOD_ID);
	
	public static final RegistryObject<Block> OAK_JAPANESE_DOOR = registerBlock("oak_japanese_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> SPRUCE_JAPANESE_DOOR = registerBlock("spruce_japanese_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> BIRCH_JAPANESE_DOOR = registerBlock("birch_japanese_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> JUNGLE_JAPANESE_DOOR = registerBlock("jungle_japanese_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> ACACIA_JAPANESE_DOOR = registerBlock("acacia_japanese_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> DARK_OAK_JAPANESE_DOOR = registerBlock("dark_oak_japanese_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> CRIMSON_JAPANESE_DOOR = registerBlock("crimson_japanese_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> WARPED_JAPANESE_DOOR = registerBlock("warped_japanese_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> BAMBOO_JAPANESE_DOOR = registerBlock("bamboo_japanese_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);


	public static final RegistryObject<Block> OAK_JAPANESE2_DOOR = registerBlock("oak_japanese2_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);;
	public static final RegistryObject<Block> SPRUCE_JAPANESE2_DOOR = registerBlock("spruce_japanese2_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> BIRCH_JAPANESE2_DOOR = registerBlock("birch_japanese2_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> JUNGLE_JAPANESE2_DOOR = registerBlock("jungle_japanese2_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> ACACIA_JAPANESE2_DOOR = registerBlock("acacia_japanese2_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> DARK_OAK_JAPANESE2_DOOR = registerBlock("dark_oak_japanese2_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> CRIMSON_JAPANESE2_DOOR = registerBlock("crimson_japanese2_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> WARPED_JAPANESE2_DOOR = registerBlock("warped_japanese2_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> BAMBOO_JAPANESE2_DOOR = registerBlock("bamboo_japanese2_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(1.5F,1.0F).sound(SoundType.SCAFFOLDING)), MacawsDoors.DoorItemGroup);

	
	public static final RegistryObject<Block> OAK_BARN_DOOR = registerBlock("oak_barn_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> SPRUCE_BARN_DOOR = registerBlock("spruce_barn_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> BIRCH_BARN_DOOR = registerBlock("birch_barn_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> JUNGLE_BARN_DOOR = registerBlock("jungle_barn_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> ACACIA_BARN_DOOR = registerBlock("acacia_barn_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> DARK_OAK_BARN_DOOR = registerBlock("dark_oak_barn_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> CRIMSON_BARN_DOOR = registerBlock("crimson_barn_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> WARPED_BARN_DOOR = registerBlock("warped_barn_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
	public static final RegistryObject<Block> BAMBOO_BARN_DOOR = registerBlock("bamboo_barn_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

	
public static final RegistryObject<Block> OAK_BARN_GLASS_DOOR = registerBlock("oak_barn_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> SPRUCE_BARN_GLASS_DOOR = registerBlock("spruce_barn_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BIRCH_BARN_GLASS_DOOR = registerBlock("birch_barn_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JUNGLE_BARN_GLASS_DOOR = registerBlock("jungle_barn_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> ACACIA_BARN_GLASS_DOOR = registerBlock("acacia_barn_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> DARK_OAK_BARN_GLASS_DOOR = registerBlock("dark_oak_barn_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> CRIMSON_BARN_GLASS_DOOR = registerBlock("crimson_barn_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> WARPED_BARN_GLASS_DOOR = registerBlock("warped_barn_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BAMBOO_BARN_GLASS_DOOR = registerBlock("bamboo_barn_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> OAK_MODERN_DOOR = registerBlock("oak_modern_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> SPRUCE_MODERN_DOOR = registerBlock("spruce_modern_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BIRCH_MODERN_DOOR = registerBlock("birch_modern_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JUNGLE_MODERN_DOOR = registerBlock("jungle_modern_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> ACACIA_MODERN_DOOR = registerBlock("acacia_modern_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> DARK_OAK_MODERN_DOOR = registerBlock("dark_oak_modern_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> CRIMSON_MODERN_DOOR = registerBlock("crimson_modern_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> WARPED_MODERN_DOOR = registerBlock("warped_modern_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BAMBOO_MODERN_DOOR = registerBlock("bamboo_modern_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> OAK_COTTAGE_DOOR = registerBlock("oak_cottage_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BIRCH_COTTAGE_DOOR = registerBlock("birch_cottage_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JUNGLE_COTTAGE_DOOR = registerBlock("jungle_cottage_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> ACACIA_COTTAGE_DOOR = registerBlock("acacia_cottage_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> DARK_OAK_COTTAGE_DOOR = registerBlock("dark_oak_cottage_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> CRIMSON_COTTAGE_DOOR = registerBlock("crimson_cottage_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> WARPED_COTTAGE_DOOR = registerBlock("warped_cottage_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BAMBOO_COTTAGE_DOOR = registerBlock("bamboo_cottage_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> SPRUCE_CLASSIC_DOOR = registerBlock("spruce_classic_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BIRCH_CLASSIC_DOOR = registerBlock("birch_classic_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JUNGLE_CLASSIC_DOOR = registerBlock("jungle_classic_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> ACACIA_CLASSIC_DOOR = registerBlock("acacia_classic_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> DARK_OAK_CLASSIC_DOOR = registerBlock("dark_oak_classic_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> CRIMSON_CLASSIC_DOOR = registerBlock("crimson_classic_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> WARPED_CLASSIC_DOOR = registerBlock("warped_classic_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BAMBOO_CLASSIC_DOOR = registerBlock("bamboo_classic_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> OAK_BEACH_DOOR = registerBlock("oak_beach_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> SPRUCE_BEACH_DOOR = registerBlock("spruce_beach_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BIRCH_BEACH_DOOR = registerBlock("birch_beach_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> ACACIA_BEACH_DOOR = registerBlock("acacia_beach_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> DARK_OAK_BEACH_DOOR = registerBlock("dark_oak_beach_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> CRIMSON_BEACH_DOOR = registerBlock("crimson_beach_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> WARPED_BEACH_DOOR = registerBlock("warped_beach_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BAMBOO_BEACH_DOOR = registerBlock("bamboo_beach_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> OAK_PAPER_DOOR = registerBlock("oak_paper_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> SPRUCE_PAPER_DOOR = registerBlock("spruce_paper_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JUNGLE_PAPER_DOOR = registerBlock("jungle_paper_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> ACACIA_PAPER_DOOR = registerBlock("acacia_paper_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> DARK_OAK_PAPER_DOOR = registerBlock("dark_oak_paper_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> CRIMSON_PAPER_DOOR = registerBlock("crimson_paper_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> WARPED_PAPER_DOOR = registerBlock("warped_paper_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BAMBOO_PAPER_DOOR = registerBlock("bamboo_paper_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> OAK_FOUR_PANEL_DOOR = registerBlock("oak_four_panel_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> SPRUCE_FOUR_PANEL_DOOR = registerBlock("spruce_four_panel_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BIRCH_FOUR_PANEL_DOOR = registerBlock("birch_four_panel_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JUNGLE_FOUR_PANEL_DOOR = registerBlock("jungle_four_panel_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> ACACIA_FOUR_PANEL_DOOR = registerBlock("acacia_four_panel_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> CRIMSON_FOUR_PANEL_DOOR = registerBlock("crimson_four_panel_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> WARPED_FOUR_PANEL_DOOR = registerBlock("warped_four_panel_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BAMBOO_FOUR_PANEL_DOOR = registerBlock("bamboo_four_panel_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> OAK_TROPICAL_DOOR = registerBlock("oak_tropical_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> SPRUCE_TROPICAL_DOOR = registerBlock("spruce_tropical_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BIRCH_TROPICAL_DOOR = registerBlock("birch_tropical_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JUNGLE_TROPICAL_DOOR = registerBlock("jungle_tropical_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> DARK_OAK_TROPICAL_DOOR = registerBlock("dark_oak_tropical_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> CRIMSON_TROPICAL_DOOR = registerBlock("crimson_tropical_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> WARPED_TROPICAL_DOOR = registerBlock("warped_tropical_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BAMBOO_TROPICAL_DOOR = registerBlock("bamboo_tropical_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> METAL_DOOR = registerBlock("metal_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).noOcclusion().requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.METAL)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> METAL_WARNING_DOOR = registerBlock("metal_warning_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().noOcclusion().strength(1.5F,6.0F).sound(SoundType.METAL)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> METAL_HOSPITAL_DOOR = registerBlock("metal_hospital_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().noOcclusion().strength(1.5F,6.0F).sound(SoundType.METAL)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> METAL_REINFORCED_DOOR = registerBlock("metal_reinforced_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().noOcclusion().strength(1.5F,6.0F).sound(SoundType.METAL)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> METAL_WINDOWED_DOOR = registerBlock("metal_windowed_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().noOcclusion().strength(1.5F,6.0F).sound(SoundType.METAL)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JAIL_DOOR = registerBlock("jail_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).noOcclusion().strength(2.5F,3.0F).sound(SoundType.METAL)), MacawsDoors.DoorItemGroup);;

	
	
public static final RegistryObject<Block> OAK_GLASS_DOOR = registerBlock("oak_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> SPRUCE_GLASS_DOOR = registerBlock("spruce_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BIRCH_GLASS_DOOR = registerBlock("birch_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JUNGLE_GLASS_DOOR = registerBlock("jungle_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> ACACIA_GLASS_DOOR = registerBlock("acacia_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> DARK_OAK_GLASS_DOOR = registerBlock("dark_oak_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> CRIMSON_GLASS_DOOR = registerBlock("crimson_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> WARPED_GLASS_DOOR = registerBlock("warped_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BAMBOO_GLASS_DOOR = registerBlock("bamboo_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> OAK_STABLE_DOOR = registerBlock("oak_stable_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> SPRUCE_STABLE_DOOR = registerBlock("spruce_stable_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BIRCH_STABLE_DOOR = registerBlock("birch_stable_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JUNGLE_STABLE_DOOR = registerBlock("jungle_stable_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> ACACIA_STABLE_DOOR = registerBlock("acacia_stable_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> DARK_OAK_STABLE_DOOR = registerBlock("dark_oak_stable_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> CRIMSON_STABLE_DOOR = registerBlock("crimson_stable_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> WARPED_STABLE_DOOR = registerBlock("warped_stable_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BAMBOO_STABLE_DOOR = registerBlock("bamboo_stable_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> OAK_STABLE_HEAD_DOOR = registerBlock("oak_stable_head_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> SPRUCE_STABLE_HEAD_DOOR = registerBlock("spruce_stable_head_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BIRCH_STABLE_HEAD_DOOR = registerBlock("birch_stable_head_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JUNGLE_STABLE_HEAD_DOOR = registerBlock("jungle_stable_head_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> ACACIA_STABLE_HEAD_DOOR = registerBlock("acacia_stable_head_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> DARK_OAK_STABLE_HEAD_DOOR = registerBlock("dark_oak_stable_head_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> CRIMSON_STABLE_HEAD_DOOR = registerBlock("crimson_stable_head_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> WARPED_STABLE_HEAD_DOOR = registerBlock("warped_stable_head_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BAMBOO_STABLE_HEAD_DOOR = registerBlock("bamboo_stable_head_door", () -> new StableDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> OAK_WESTERN_DOOR = registerBlock("oak_western_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> SPRUCE_WESTERN_DOOR = registerBlock("spruce_western_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BIRCH_WESTERN_DOOR = registerBlock("birch_western_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JUNGLE_WESTERN_DOOR = registerBlock("jungle_western_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> ACACIA_WESTERN_DOOR = registerBlock("acacia_western_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> DARK_OAK_WESTERN_DOOR = registerBlock("dark_oak_western_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> CRIMSON_WESTERN_DOOR = registerBlock("crimson_western_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> WARPED_WESTERN_DOOR = registerBlock("warped_western_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BAMBOO_WESTERN_DOOR = registerBlock("bamboo_western_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(3.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> OAK_MYSTIC_DOOR = registerBlock("oak_mystic_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> SPRUCE_MYSTIC_DOOR = registerBlock("spruce_mystic_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BIRCH_MYSTIC_DOOR = registerBlock("birch_mystic_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JUNGLE_MYSTIC_DOOR = registerBlock("jungle_mystic_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> ACACIA_MYSTIC_DOOR = registerBlock("acacia_mystic_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> DARK_OAK_MYSTIC_DOOR = registerBlock("dark_oak_mystic_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> CRIMSON_MYSTIC_DOOR = registerBlock("crimson_mystic_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BAMBOO_MYSTIC_DOOR = registerBlock("bamboo_mystic_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> OAK_NETHER_DOOR = registerBlock("oak_nether_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> SPRUCE_NETHER_DOOR = registerBlock("spruce_nether_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BIRCH_NETHER_DOOR = registerBlock("birch_nether_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JUNGLE_NETHER_DOOR = registerBlock("jungle_nether_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> ACACIA_NETHER_DOOR = registerBlock("acacia_nether_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> DARK_OAK_NETHER_DOOR = registerBlock("dark_oak_nether_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> WARPED_NETHER_DOOR = registerBlock("warped_nether_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BAMBOO_NETHER_DOOR = registerBlock("bamboo_nether_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> OAK_SWAMP_DOOR = registerBlock("oak_swamp_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> SPRUCE_SWAMP_DOOR = registerBlock("spruce_swamp_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BIRCH_SWAMP_DOOR = registerBlock("birch_swamp_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JUNGLE_SWAMP_DOOR = registerBlock("jungle_swamp_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> ACACIA_SWAMP_DOOR = registerBlock("acacia_swamp_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> DARK_OAK_SWAMP_DOOR = registerBlock("dark_oak_swamp_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> CRIMSON_SWAMP_DOOR = registerBlock("crimson_swamp_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> WARPED_SWAMP_DOOR = registerBlock("warped_swamp_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BAMBOO_SWAMP_DOOR = registerBlock("bamboo_swamp_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> OAK_BAMBOO_DOOR = registerBlock("oak_bamboo_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> SPRUCE_BAMBOO_DOOR = registerBlock("spruce_bamboo_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BIRCH_BAMBOO_DOOR = registerBlock("birch_bamboo_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JUNGLE_BAMBOO_DOOR = registerBlock("jungle_bamboo_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> ACACIA_BAMBOO_DOOR = registerBlock("acacia_bamboo_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> DARK_OAK_BAMBOO_DOOR = registerBlock("dark_oak_bamboo_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> CRIMSON_BAMBOO_DOOR = registerBlock("crimson_bamboo_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> WARPED_BAMBOO_DOOR = registerBlock("warped_bamboo_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> OAK_BARK_GLASS_DOOR = registerBlock("oak_bark_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> SPRUCE_BARK_GLASS_DOOR = registerBlock("spruce_bark_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BIRCH_BARK_GLASS_DOOR = registerBlock("birch_bark_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> JUNGLE_BARK_GLASS_DOOR = registerBlock("jungle_bark_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> ACACIA_BARK_GLASS_DOOR = registerBlock("acacia_bark_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> DARK_OAK_BARK_GLASS_DOOR = registerBlock("dark_oak_bark_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> CRIMSON_STEM_GLASS_DOOR = registerBlock("crimson_stem_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> WARPED_STEM_GLASS_DOOR = registerBlock("warped_stem_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> BAMBOO_BARK_GLASS_DOOR = registerBlock("bamboo_bark_glass_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
 
public static final RegistryObject<Block> GARAGE_WHITE_DOOR = registerBlock("garage_white_door", () -> new GarageDoor(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).noOcclusion().strength(3.0F,5.0F).sound(SoundType.METAL)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> GARAGE_SILVER_DOOR = registerBlock("garage_silver_door", () -> new GarageDoor(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).noOcclusion().strength(3.0F,5.0F).sound(SoundType.METAL)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> GARAGE_GRAY_DOOR = registerBlock("garage_gray_door", () -> new GarageDoor(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).noOcclusion().strength(3.0F,5.0F).sound(SoundType.METAL)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> GARAGE_BLACK_DOOR = registerBlock("garage_black_door", () -> new GarageDoor(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).noOcclusion().strength(3.0F,5.0F).sound(SoundType.METAL)), MacawsDoors.DoorItemGroup);

public static final RegistryObject<Block> WOODEN_PORTCULLIS = registerBlock("wooden_portcullis", () -> new GarageDoor(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).noOcclusion().strength(2.0F,3.0F).sound(SoundType.WOOD)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> IRON_PORTCULLIS = registerBlock("iron_portcullis", () -> new GarageDoor(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).noOcclusion().strength(3.0F,5.0F).sound(SoundType.METAL)), MacawsDoors.DoorItemGroup);
	
public static final RegistryObject<Block> STORE_DOOR = registerBlock("store_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.METAL).noOcclusion().strength(2.0F,3.0F).sound(SoundType.METAL)), MacawsDoors.DoorItemGroup);
public static final RegistryObject<Block> SLIDING_GLASS_DOOR = registerBlock("sliding_glass_door", () -> new JapaneseDoors(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.METAL).noOcclusion().strength(2.0F,3.0F).sound(SoundType.METAL)), MacawsDoors.DoorItemGroup);

//credit Kaupenjoe - From tutorial series
	
@SuppressWarnings("unused")
private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
    return BLOCKS.register(name, block);
}

@SuppressWarnings("unused")
private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, String tooltipKey) {
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn, tab, tooltipKey);
    return toReturn;
}

private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String tooltipKey) {
    return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
            new Item.Properties().tab(tab)) {
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
            pTooltip.add(new TranslatableComponent(tooltipKey));
        }
    });
}


private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn, tab);
    return toReturn;
}

	private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
	    
	    	Set<String> treeNames = new HashSet<>(Arrays.asList("oak", "spruce", "birch", "jungle", "acacia", "warped", "crimson", "wooden", "bamboo"));

	    	if (treeNames.contains(name)) {
	    	    return ItemInit.ITEMS.register(name, () -> new FuelItemBlock(block.get(), new Item.Properties().tab(tab)));
	    	} else {
	    	    return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	    	}
	    	
	    }
	  
	    public static void register(IEventBus eventBus) {
	        BLOCKS.register(eventBus);
	    }
	}