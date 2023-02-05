package com.mcwdoors.kikoz.objects;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class StableDoor extends JapaneseDoors implements SimpleWaterloggedBlock {

	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	public static final EnumProperty<DoorHingeSide> HINGE = BlockStateProperties.DOOR_HINGE;

	protected static final VoxelShape EAST = Block.box(0.02, -0.02, 0, 3.0, 15.98, 16);
	protected static final VoxelShape NORTH = Block.box(0, -0.02, 12.98, 16, 15.98, 15.98);
	protected static final VoxelShape WEST = Block.box(0, -0.02, -0.02, 16, 15.98, 2.98);
	protected static final VoxelShape SOUTH = Block.box(13.02, -0.02, 0, 16.02, 15.98, 16);

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos,
			CollisionContext context) {
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
	public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
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
		return open ? Shapes.empty() : shape;
	}

	public StableDoor(Block.Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH)
				.setValue(WATERLOGGED, Boolean.valueOf(false)).setValue(OPEN, Boolean.valueOf(false))
				.setValue(HINGE, DoorHingeSide.LEFT).setValue(POWERED, Boolean.valueOf(false))
				.setValue(HALF, DoubleBlockHalf.LOWER));

	}
}
