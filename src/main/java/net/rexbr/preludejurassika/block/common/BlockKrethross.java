package net.rexbr.preludejurassika.block.common;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;

import net.minecraft.world.level.block.GrowingPlantBodyBlock;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.rexbr.preludejurassika.block.ModBlocks;

public class BlockKrethross extends GrowingPlantBodyBlock implements LiquidBlockContainer {
    public BlockKrethross(BlockBehaviour.Properties p_i48782_1_) {
        super(p_i48782_1_, Direction.UP, Shapes.block(), true);
    }

    protected GrowingPlantHeadBlock getHeadBlock() {
        return ModBlocks.ENCRINUS.get();
    }

    public FluidState getFluidState(BlockState blockState) {
        return Fluids.WATER.getSource(false);
    }

    public boolean canPlaceLiquid(BlockGetter blockReader, BlockPos blockPos, BlockState blockState, Fluid fluid) {
        return false;
    }

    public boolean placeLiquid(LevelAccessor world, BlockPos blockPos, BlockState blockState, FluidState fluidState) {
        return false;
    }
}
