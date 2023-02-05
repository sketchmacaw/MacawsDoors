package net.kikoz.mcwdoors.objects;

import net.minecraft.block.*;
import net.minecraft.block.enums.DoorHinge;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;


public class JapaneseDoors extends DoorBlock implements Waterloggable {

private static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
public static final EnumProperty<DoorHinge> HINGE = Properties.DOOR_HINGE;
protected static final VoxelShape EAST = Block.createCuboidShape(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
protected static final VoxelShape NORTH = Block.createCuboidShape(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D);


@Override
public VoxelShape getOutlineShape(BlockState state, BlockView reader, BlockPos pos, ShapeContext context)
{
    switch (state.get(FACING))
    {

        case NORTH:
            return EAST;

        case SOUTH:
            return EAST;

        case EAST:
            return NORTH;

        default: case WEST:
        return NORTH;
    }
}

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView reader, BlockPos pos, ShapeContext context) {
        if (state.get(OPEN)) {
            return VoxelShapes.empty();
        } else {
            switch (state.get(FACING)) {
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


public JapaneseDoors(Block.Settings properties) {
		super(properties);
        this.setDefaultState((BlockState)this.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, Boolean.valueOf(false)).with(OPEN, Boolean.valueOf(false)).with(HINGE, DoorHinge.LEFT).with(POWERED, Boolean.valueOf(false)).with(HALF, DoubleBlockHalf.LOWER));
	}


@Override
protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
builder.add(HALF, FACING, OPEN, HINGE, POWERED, WATERLOGGED);
}

    @Override
    public FluidState getFluidState(BlockState state) {
        if (state.get(WATERLOGGED).booleanValue()) {
            return Fluids.WATER.getStill(false);
        }
        return super.getFluidState(state);
    }


@Override
public ActionResult onUse(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand handIn, BlockHitResult hit) {
    if (this.material == Material.METAL) {
    	return ActionResult.PASS;
    } else {
       state = state.cycle(OPEN);
        level.setBlockState(pos, state, 2);
       if (state.get(WATERLOGGED)) {
           level.createAndScheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(level));
          return ActionResult.SUCCESS;

       }
       return ActionResult.SUCCESS;
    }
 }

}