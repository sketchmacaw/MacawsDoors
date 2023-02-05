package net.kikoz.mcwdoors.objects;

import net.minecraft.block.*;
import net.minecraft.block.enums.DoorHinge;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.sound.SoundEvent;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class StableDoor extends JapaneseDoors implements Waterloggable {

private static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
public static final EnumProperty<DoorHinge> HINGE = Properties.DOOR_HINGE;
    private final SoundEvent closeSound;
    private final SoundEvent openSound;

    protected static final VoxelShape EAST = Block.createCuboidShape(0.02, -0.02, 0, 3.0, 15.98, 16);
    protected static final VoxelShape NORTH = Block.createCuboidShape(0, -0.02, 12.98, 16, 15.98, 15.98);
    protected static final VoxelShape WEST = Block.createCuboidShape(0, -0.02, -0.02, 16, 15.98, 2.98);
    protected static final VoxelShape SOUTH = Block.createCuboidShape(13.02, -0.02, 0, 16.02, 15.98, 16);


@Override
public VoxelShape getOutlineShape(BlockState state, BlockView reader, BlockPos pos, ShapeContext context)
{
    switch (state.get(FACING))
    {

        case NORTH:
            return NORTH;

        case SOUTH:
            return WEST;

        case EAST:
            return EAST;

        default: case WEST:
        return SOUTH;
    }
}


    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView reader, BlockPos pos, ShapeContext context) {
        boolean open = state.get(OPEN);
        VoxelShape shape;
        switch (state.get(FACING)) {
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


public StableDoor(AbstractBlock.Settings properties, SoundEvent closeSound, SoundEvent openSound) {
		super(properties, closeSound,openSound);
         this.setDefaultState((BlockState)this.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, Boolean.valueOf(false)).with(OPEN, Boolean.valueOf(false)).with(HINGE, DoorHinge.LEFT).with(POWERED, Boolean.valueOf(false)).with(HALF, DoubleBlockHalf.LOWER));
    this.closeSound = closeSound;
    this.openSound = openSound;
}
}