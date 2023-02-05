package com.mcwdoors.kikoz.objects;

import javax.annotation.Nullable;

import com.mcwdoors.kikoz.init.SoundsInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;


public class GarageDoor extends Block implements IWaterLoggable {
	public static final EnumProperty<GaragePart> PART = EnumProperty.create("part", GaragePart.class);
	public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	private static final DirectionProperty FACING = HorizontalBlock.FACING;
	public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

	private static final VoxelShape EAST = Block.box(6, 0, 0, 10, 16, 16);
	private static final VoxelShape NORTH = Block.box(0, 0, 6, 16, 16, 10);

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos,
			ISelectionContext context) {
		Direction facing = state.getValue(FACING);
		if (facing == Direction.WEST || facing == Direction.EAST) {
			return NORTH;
		} else {
			return EAST;
		}
	}

	@Override
	public VoxelShape getCollisionShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
		if (state.getValue(OPEN)) {
			return VoxelShapes.empty();
		} else {
			return state.getValue(FACING) == Direction.WEST || state.getValue(FACING) == Direction.EAST ? NORTH : EAST;
		}
	}

	public GarageDoor(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH)
				.setValue(WATERLOGGED, false).setValue(OPEN, Boolean.valueOf(false))
				.setValue(POWERED, Boolean.valueOf(false)).setValue(PART, GaragePart.BOTTOM));
	}

	
	

protected BlockState GarageState(BlockState state, IWorld level, BlockPos pos) {
	boolean above = level.getBlockState(pos.above()).getBlock() == this;
	boolean below = level.getBlockState(pos.below()).getBlock() == this;

	if (above == true && below == true) {
		return state.setValue(PART, GaragePart.MIDDLE);
	} else if (above != true && below == true) {
		return state.setValue(PART, GaragePart.TOP);
	} else if (above == true && below != true) {
		return state.setValue(PART, GaragePart.BOTTOM);
	} else {
		return state.setValue(PART, GaragePart.TOP);
	}
}

@Override
public void onPlace(BlockState state, World level, BlockPos pos, BlockState statetwo, boolean bool) {
	if (!statetwo.is(state.getBlock())) {
		this.GarageState(state, level, pos);
	}
}

@Override
@Nullable
public BlockState getStateForPlacement(BlockItemUseContext context) {
	return this.GarageState(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos())
			.setValue(FACING, context.getHorizontalDirection().getClockWise());
}

public void placeAt(World level, BlockPos pos, int num) {
	level.setBlock(pos, this.defaultBlockState(), num);
}

 @Override
    public BlockState updateShape(BlockState state, Direction dir, BlockState newState, IWorld level, BlockPos pos, BlockPos newPos) {
        	 return this.GarageState(state, level, pos);

}

	@Override
	protected void createBlockStateDefinition(final StateContainer.Builder<Block, BlockState> builder) {
		builder.add(PART, FACING, POWERED, WATERLOGGED, OPEN);
	}

	public boolean isOpen(BlockState state) {
		return state.getValue(OPEN);
	}

	public void openDoor(World level, BlockState state, BlockPos pos, boolean open) {
		if (state.is(this) && state.getValue(OPEN) != open) {
			level.setBlockAndUpdate(pos, state.setValue(OPEN, Boolean.valueOf(open)));
		}
	}

	@Override
	public ActionResultType use(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand handIn,
			BlockRayTraceResult hit) {
		ItemStack itemstack = player.getItemInHand(handIn);
		Item item = itemstack.getItem();
		if (item == this.asItem()) {
			return ActionResultType.PASS;
		}

		this.garageDoor(level, pos, !state.getValue(OPEN), state.getValue(FACING));
		level.playSound(null, pos, SoundsInit.GARAGE.get(), SoundCategory.BLOCKS, 0.5F,
				level.random.nextFloat() * 0.1F + 0.8F);
		state = state.cycle(OPEN);
		level.setBlock(pos, state, 10);
		return ActionResultType.SUCCESS;
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	@SuppressWarnings("deprecation")
	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, World level,
			BlockPos currentPos, BlockPos facingPos) {
		if (stateIn.getValue(WATERLOGGED)) {
			level.getLiquidTicks().hasScheduledTick(currentPos, Fluids.WATER);
		}

		return super.updateShape(stateIn, facing, facingState, level, currentPos, facingPos);
	}

	@SuppressWarnings("deprecation")
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.defaultFluidState() : super.getFluidState(state);
	}

	@Override
	public void playerWillDestroy(World level, BlockPos pos, BlockState state, PlayerEntity player) {
		FluidState topFluidState = level.getFluidState(pos.above(1));
		Block block = level.getBlockState(pos).getBlock();
		Block upper = level.getBlockState(pos.above(1)).getBlock();
		Block lower = level.getBlockState(pos.below(1)).getBlock();

		if (upper == block && lower == block) {
			level.setBlockAndUpdate(pos.below(1), state.setValue(PART, GaragePart.TOP).setValue(WATERLOGGED,
					topFluidState.getType() == Fluids.WATER));
		} else if (lower == block) {
			level.setBlockAndUpdate(pos.below(1), state.setValue(PART, GaragePart.TOP).setValue(WATERLOGGED,
					topFluidState.getType() == Fluids.WATER));
		}
		level.playSound(null, pos, SoundEvents.METAL_BREAK, SoundCategory.BLOCKS, 0.5F,
				level.random.nextFloat() * 0.1F + 0.8F);

		if (state.getValue(OPEN) == true && state.getValue(PART) == GaragePart.BOTTOM || state.getValue(PART) == GaragePart.MIDDLE) {
		} else {
			this.addDestroyEffects(state, level, pos, null);
		}
	}

	private void garageDoor(World level, BlockPos pos, boolean bool, Direction dir) {
		BlockState state = level.getBlockState(pos);
		if (state.getBlock() == this && state.getValue(OPEN) != bool
				&& state.getValue(FACING).equals(dir)) {
			level.setBlockAndUpdate(pos, state.setValue(OPEN, bool));
			for (int x = -1; x <= 1; x++) {
				for (int y = -1; y <= 1; y++) {
					for (int z = -1; z <= 1; z++) {
						BlockPos newPos = pos.offset(x, y, z);
						garageDoor(level, newPos, bool, dir);
					}
				}
			}
		}
	}

	public enum GaragePart implements IStringSerializable {
		TOP("top"), MIDDLE("middle"), BOTTOM("bottom");

		private final String name;

		GaragePart(final String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public String getSerializedName() {
			return this.name;
		}

	}

}
