package net.kikoz.mcwdoors.objects;


import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;


public class GarageDoor extends Block implements Waterloggable
{
    public static final EnumProperty<GaragePart> PART = EnumProperty.of("part", GaragePart.class);
    public static final BooleanProperty OPEN = Properties.OPEN;
    private static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    private static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final BooleanProperty POWERED = Properties.POWERED;

    private static final VoxelShape EAST = Block.createCuboidShape(6, 0, 0, 10, 16, 16);
    private static final VoxelShape NORTH = Block.createCuboidShape(0, 0, 6, 16, 16, 10);

    public GarageDoor(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)this.getDefaultState()
                .with(FACING, Direction.NORTH)
                .with(WATERLOGGED, false)
                .with(OPEN, Boolean.valueOf(false))
                .with(PART, GaragePart.BOTTOM)
                .with(POWERED, false));
    }


    public enum GaragePart implements StringIdentifiable
    {
        TOP("top"),
        MIDDLE("middle"),
        BOTTOM("bottom");


        private final String name;

        private GaragePart(String name) {
            this.name = name;
        }

        @Override
        public String asString() {
            return this.name;
        }
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView reader, BlockPos pos, ShapeContext context) {
        if (state.get(OPEN)) {
            return VoxelShapes.empty();
        } else {
            return state.get(FACING) == Direction.WEST || state.get(FACING) == Direction.EAST ? NORTH : EAST;
        }
    }

    
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView reader, BlockPos pos, ShapeContext context) {
        Direction facing = state.get(FACING);
        if (facing == Direction.WEST || facing == Direction.EAST) {
            return NORTH;
        } else {
            return EAST;
        }
    }



    protected BlockState GarageState(BlockState state, WorldAccess level, BlockPos pos) {
        boolean above = level.getBlockState(pos.up()).getBlock() == this;
        boolean below = level.getBlockState(pos.down()).getBlock() == this;

        if (above == true && below == true) {
            return state.with(PART, GaragePart.MIDDLE);
        } else if (above != true && below == true) {
            return state.with(PART, GaragePart.TOP);
        } else if (above == true && below != true) {
            return state.with(PART, GaragePart.BOTTOM);
        } else {
            return state.with(PART, GaragePart.TOP);
        }
    }

    @Override
    public void onStateReplaced(BlockState state, World level, BlockPos pos, BlockState newState, boolean bool) {
        if (!newState.isOf(state.getBlock())) {
            this.GarageState(state, level, pos);
        }
    }


    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        return this.GarageState(super.getPlacementState(context), context.getWorld(), context.getBlockPos())
                .with(FACING, context.getPlayerFacing().rotateYClockwise());
    }

    public void placeAt(WorldAccess level, BlockState state, BlockPos pos, int flags) {
        level.setBlockState(pos, this.getDefaultState(), flags);
    }

    @Override
    @Deprecated
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess level, BlockPos pos, BlockPos neighborPos) {
        return this.GarageState(state, level, pos);
    }


    
    
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(PART, FACING, WATERLOGGED, POWERED, OPEN);
    }

    public boolean isOpen(BlockState state) {
        return state.get(OPEN);
     }

     public void openDoor(World level, BlockState state, BlockPos pos, boolean open) {
        if (state.isOf(this) && state.get(OPEN) != open) {
            level.setBlockState(pos, state.with(OPEN, Boolean.valueOf(open)));
        }
     }

    @Override
    public ActionResult onUse(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand handIn, BlockHitResult hit) {
        ItemStack itemstack = player.getStackInHand(handIn);
        Item item = itemstack.getItem();
        if (item == this.asItem()) {
            return ActionResult.PASS;
        }

        this.garageDoor(level, pos, !state.get(OPEN), state.get(FACING));
        state = state.cycle(OPEN);
        level.setBlockState(pos, state, 10);
        return ActionResult.SUCCESS;
    }


    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate(state.get(FACING)));
    }
    
    
    @SuppressWarnings("deprecation")
	public BlockState getStateForNeighborUpdate(BlockState stateIn, Direction facing, BlockState facingState, World level, BlockPos currentPos, BlockPos facingPos) {
    	   if (stateIn.get(WATERLOGGED)) {
               level.scheduleFluidTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(level));
    	   }

    	   return super.getStateForNeighborUpdate(stateIn, facing, facingState, level, currentPos, facingPos);
    	}

    @Override
    public FluidState getFluidState(BlockState state) {
        if (state.get(WATERLOGGED).booleanValue()) {
            return Fluids.WATER.getStill(false);
        }
        return super.getFluidState(state);
    }

    
    
    @Override
    public void onBreak(World level, BlockPos pos, BlockState state, PlayerEntity player) {

        FluidState topFluidState = level.getFluidState(pos.up(1));
        Block block = level.getBlockState(pos).getBlock();
        Block upper = level.getBlockState(pos.up(1)).getBlock();
        Block lower = level.getBlockState(pos.down(1)).getBlock();

        if (upper == block && lower == block) {
            level.setBlockState(pos.down(1), state.with(PART, GaragePart.TOP).with(WATERLOGGED,
                    topFluidState.getFluid() == Fluids.WATER));
        } else if (lower == block) {
            level.setBlockState(pos.down(1), state.with(PART, GaragePart.TOP).with(WATERLOGGED,
                    topFluidState.getFluid() == Fluids.WATER));
        }
        level.playSound(null, pos, SoundEvents.BLOCK_METAL_BREAK, SoundCategory.BLOCKS, 0.5F,
                level.random.nextFloat() * 0.1F + 0.8F);

        if (state.get(OPEN) == true && state.get(PART) == GaragePart.MIDDLE || state.get(PART) == GaragePart.BOTTOM ) {

        } else {
            this.spawnBreakParticles(level, player, pos, state);
        }
    }



    private void garageDoor(World level, BlockPos pos, boolean bool, Direction dir)
    {
        BlockState state = level.getBlockState(pos);
        if (state.getBlock() == this && state.get(OPEN) != bool
                && state.get(FACING).equals(dir)) {
            level.setBlockState(pos, state.with(OPEN, bool));
            for (int x = -1; x <= 1; x++) {
                for (int y = -1; y <= 1; y++) {
                    for (int z = -1; z <= 1; z++) {
                        BlockPos newPos = pos.add(x, y, z);
                        garageDoor(level, newPos, bool, dir);
                    }
                }
            }
        }
    }

}