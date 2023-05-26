package net.rexbr.preludejurassika.tech.block.common;

import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.rexbr.preludejurassika.tech.block.TechBlocks;

public class PetroilsandBlock extends FallingBlock {
    public PetroilsandBlock() {
        super(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5f, 5f));
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
    }

    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
        return new ItemStack(TechBlocks.PETROILSAND.get());
    }
}

