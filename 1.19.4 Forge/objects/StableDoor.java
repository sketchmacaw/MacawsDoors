package com.mcwdoors.kikoz.objects;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class StableDoor extends JapaneseDoors {

	public static final EnumProperty<DoorHingeSide> HINGE = BlockStateProperties.DOOR_HINGE;

	protected static final VoxelShape EAST = Block.box(0.02, -0.02, 0, 3.0, 15.98, 16);
	protected static final VoxelShape NORTH = Block.box(0, -0.02, 12.98, 16, 15.98, 15.98);
	protected static final VoxelShape WEST = Block.box(0, -0.02, -0.02, 16, 15.98, 2.98);
	protected static final VoxelShape SOUTH = Block.box(13.02, -0.02, 0, 16.02, 15.98, 16);


	@Override
	public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos,
			CollisionContext selectionContext) {
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
	public VoxelShape getCollisionShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
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

	public StableDoor(Block.Properties properties, BlockSetType type) {
		super(properties, type);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH)
				.setValue(OPEN, Boolean.valueOf(false))
				.setValue(HINGE, DoorHingeSide.LEFT).setValue(POWERED, Boolean.valueOf(false))
				.setValue(HALF, DoubleBlockHalf.LOWER));

	}
}
