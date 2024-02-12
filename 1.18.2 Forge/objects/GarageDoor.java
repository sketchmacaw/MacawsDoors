package com.mcwdoors.kikoz.objects;

import javax.annotation.Nullable;

import com.mcwdoors.kikoz.init.SoundsInit;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GarageDoor extends Block {
	public static final EnumProperty<GaragePart> PART = EnumProperty.create("part", GaragePart.class);
	public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
	private static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

	private static final VoxelShape EAST = Block.box(6, 0, 0, 10, 16, 16);
	private static final VoxelShape NORTH = Block.box(0, 0, 6, 16, 16, 10);

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos,
			CollisionContext context) {
		Direction facing = state.getValue(FACING);
		if (facing == Direction.WEST || facing == Direction.EAST) {
			return NORTH;
		} else {
			return EAST;
		}
	}

	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
		if (state.getValue(OPEN)) {
			return Shapes.empty();
		} else {
			return state.getValue(FACING) == Direction.WEST || state.getValue(FACING) == Direction.EAST ? NORTH : EAST;
		}
	}

	public GarageDoor(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH)
				.setValue(OPEN, Boolean.valueOf(false))
				.setValue(POWERED, Boolean.valueOf(false)).setValue(PART, GaragePart.BOTTOM));
	}

	
	

protected BlockState GarageState(BlockState state, LevelAccessor level, BlockPos pos) {
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
public void onPlace(BlockState state, Level level, BlockPos pos, BlockState statetwo, boolean bool) {
	if (!statetwo.is(state.getBlock())) {
		this.GarageState(state, level, pos);
	}
}

@Override
@Nullable
public BlockState getStateForPlacement(BlockPlaceContext context) {
	return this.GarageState(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos())
			.setValue(FACING, context.getHorizontalDirection().getClockWise());
}

public void placeAt(Level level, BlockPos pos, int num) {
	level.setBlock(pos, this.defaultBlockState(), num);
}

 @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState newState, LevelAccessor level, BlockPos pos, BlockPos newPos) {
        	 return this.GarageState(state, level, pos);

}
	

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(PART, FACING, POWERED, OPEN);
	}

	public boolean isOpen(BlockState state) {
		return state.getValue(OPEN);
	}

	public void openDoor(Level level, BlockState state, BlockPos pos, boolean open) {
		if (state.is(this) && state.getValue(OPEN) != open) {
			level.setBlockAndUpdate(pos, state.setValue(OPEN, Boolean.valueOf(open)));
		}
	}

	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn,
			BlockHitResult hit) {
		ItemStack itemstack = player.getItemInHand(handIn);
		Item item = itemstack.getItem();
		if (item == this.asItem()) {
			return InteractionResult.PASS;
		}

		this.garageDoor(level, pos, !state.getValue(OPEN), state.getValue(FACING));
		level.playSound(null, pos, SoundsInit.GARAGE.get(), SoundSource.BLOCKS, 0.5F,
				level.random.nextFloat() * 0.1F + 0.8F);
		state = state.cycle(OPEN);
		level.setBlock(pos, state, 10);
		return InteractionResult.SUCCESS;
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	@SuppressWarnings("deprecation")
	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, Level level,
			BlockPos currentPos, BlockPos facingPos) {
		return super.updateShape(stateIn, facing, facingState, level, currentPos, facingPos);
	}

	@Override
	public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
		Block block = level.getBlockState(pos).getBlock();
		Block upper = level.getBlockState(pos.above(1)).getBlock();
		Block lower = level.getBlockState(pos.below(1)).getBlock();

		if (upper == block && lower == block) {
			level.setBlockAndUpdate(pos.below(1), state.setValue(PART, GaragePart.TOP));
		} else if (lower == block) {
			level.setBlockAndUpdate(pos.below(1), state.setValue(PART, GaragePart.TOP));
		}
		level.playSound(null, pos, SoundEvents.METAL_BREAK, SoundSource.BLOCKS, 0.5F,
				level.random.nextFloat() * 0.1F + 0.8F);

		if (state.getValue(OPEN) == true && state.getValue(PART) == GaragePart.BOTTOM || state.getValue(PART) == GaragePart.MIDDLE) {
		} else {
			this.spawnDestroyParticles(level, player, pos, state);
		}
	}

	@SuppressWarnings("unused")
	private void garageDoor(Level level, BlockPos pos, boolean bool, Direction dir) {
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
	
	
	@Override
	public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos neighborPos, boolean isMoving) {
	    if (!level.isClientSide) {
	        boolean powered = level.hasNeighborSignal(pos) || level.hasNeighborSignal(pos.above());
	        if (state.getValue(POWERED) != powered) {
	            level.setBlock(pos, state.setValue(POWERED, powered), 2);
	            if (state.getValue(OPEN) != powered) {
	                garageDoor(level, pos, !state.getValue(OPEN), state.getValue(FACING)); // Invert the open state
	                level.playSound(null, pos, SoundsInit.GARAGE.get(), SoundSource.BLOCKS, 0.5F,
	        				level.random.nextFloat() * 0.1F + 0.8F);
	            }
	        }
	    }
	}

	public enum GaragePart implements StringRepresentable {
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
