package com.mcwdoors.kikoz.objects;

import com.mcwdoors.kikoz.init.SoundsInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoorHingeSide;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class JapaneseDoors extends DoorBlock implements IWaterLoggable {

	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	public static final EnumProperty<DoorHingeSide> HINGE = BlockStateProperties.DOOR_HINGE;
	protected static final VoxelShape EAST = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
	protected static final VoxelShape NORTH = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D);

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos,
			ISelectionContext context) {
		switch (state.getValue(FACING)) {

		case NORTH:
			return EAST;

		case SOUTH:
			return EAST;

		case EAST:
			return NORTH;

		default:
		case WEST:
			return NORTH;
		}
	}

	@Override
	public VoxelShape getCollisionShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
		if (state.getValue(OPEN)) {
			return VoxelShapes.empty();
		} else {
			switch (state.getValue(FACING)) {
			case NORTH:
			case SOUTH:
				return EAST;
			case EAST:
			case WEST:
				return NORTH;
			default:
				return null;
			}
		}
	}

	public JapaneseDoors(Block.Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH)
				.setValue(WATERLOGGED, Boolean.valueOf(false)).setValue(OPEN, Boolean.valueOf(false))
				.setValue(HINGE, DoorHingeSide.LEFT).setValue(POWERED, Boolean.valueOf(false))
				.setValue(HALF, DoubleBlockHalf.LOWER));
	}

	@Override
	protected void createBlockStateDefinition(final StateContainer.Builder<Block, BlockState> builder) {
		builder.add(HALF, FACING, OPEN, HINGE, POWERED, WATERLOGGED);
	}

	@Override
	@SuppressWarnings("deprecation")
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.defaultFluidState() : super.getFluidState(state);
	}

	@Override
	public ActionResultType use(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		if (this.material == Material.METAL) {
			return ActionResultType.PASS;
		} else {
			state = state.cycle(OPEN);
			level.setBlock(pos, state, 2);
			if (state.getValue(WATERLOGGED)) {
				level.getLiquidTicks().hasScheduledTick(pos, Fluids.WATER);
				return ActionResultType.SUCCESS;

			}
			level.playSound(null, pos, SoundsInit.SHOJI.get(), SoundCategory.BLOCKS, 0.5F,
					level.random.nextFloat() * 0.1F + 0.8F);
			return ActionResultType.SUCCESS;
		}
	}
}
