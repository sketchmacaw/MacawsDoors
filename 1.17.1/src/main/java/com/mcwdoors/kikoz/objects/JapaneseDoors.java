package com.mcwdoors.kikoz.objects;

import com.mcwdoors.kikoz.init.SoundsInit;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class JapaneseDoors extends DoorBlock implements SimpleWaterloggedBlock {

	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	public static final EnumProperty<DoorHingeSide> HINGE = BlockStateProperties.DOOR_HINGE;
	protected static final VoxelShape EAST = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
	protected static final VoxelShape NORTH = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D);

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos,
			CollisionContext context) {
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
	public VoxelShape getCollisionShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
		if (state.getValue(OPEN)) {
			return Shapes.empty();
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
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(HALF, FACING, OPEN, HINGE, POWERED, WATERLOGGED);
	}

	@Override
	@SuppressWarnings("deprecation")
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.defaultFluidState() : super.getFluidState(state);
	}

	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn,
			BlockHitResult hit) {
		if (this.material == Material.METAL) {
			return InteractionResult.PASS;
		} else {
			state = state.cycle(OPEN);
			level.setBlock(pos, state, 2);
			if (state.getValue(WATERLOGGED)) {
				level.getLiquidTicks().hasScheduledTick(pos, Fluids.WATER);
				return InteractionResult.SUCCESS;

			}
			level.playSound(null, pos, SoundsInit.SHOJI.get(), SoundSource.BLOCKS, 0.5F,
					level.random.nextFloat() * 0.1F + 0.8F);
			return InteractionResult.SUCCESS;
		}
	}
}
