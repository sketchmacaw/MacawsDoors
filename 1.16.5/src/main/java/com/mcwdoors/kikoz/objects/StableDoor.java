package com.mcwdoors.kikoz.objects;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoorHingeSide;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class StableDoor extends JapaneseDoors implements IWaterLoggable {

	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	public static final EnumProperty<DoorHingeSide> HINGE = BlockStateProperties.DOOR_HINGE;

	protected static final VoxelShape EAST = Block.box(0.02, -0.02, 0, 3.0, 15.98, 16);
	protected static final VoxelShape NORTH = Block.box(0, -0.02, 12.98, 16, 15.98, 15.98);
	protected static final VoxelShape WEST = Block.box(0, -0.02, -0.02, 16, 15.98, 2.98);
	protected static final VoxelShape SOUTH = Block.box(13.02, -0.02, 0, 16.02, 15.98, 16);

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos,
			ISelectionContext context) {
		switch (state.getValue(FACING)) {

		case NORTH:
			return NORTH;

		case SOUTH:
			return WEST;

		case EAST:
			return EAST;

		default:
		case WEST:
			return SOUTH;
		}
	}

	@Override
	public VoxelShape getCollisionShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
		boolean open = state.getValue(OPEN);
		VoxelShape shape;
		switch (state.getValue(FACING)) {
		case NORTH:
			shape = NORTH;
			break;
		case SOUTH:
			shape = WEST;
			break;
		case EAST:
			shape = EAST;
			break;
		default:
			shape = SOUTH;
		}
		return open ? VoxelShapes.empty() : shape;
	}

	public StableDoor(Block.Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH)
				.setValue(WATERLOGGED, Boolean.valueOf(false)).setValue(OPEN, Boolean.valueOf(false))
				.setValue(HINGE, DoorHingeSide.LEFT).setValue(POWERED, Boolean.valueOf(false))
				.setValue(HALF, DoubleBlockHalf.LOWER));

	}
}
