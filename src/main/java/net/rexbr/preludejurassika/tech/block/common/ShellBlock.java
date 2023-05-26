package net.rexbr.preludejurassika.tech.block.common;

import net.minecraftforge.common.PlantType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.rexbr.preludejurassika.tech.block.TechBlocks;

import java.util.List;
import java.util.Collections;

public class ShellBlock extends FlowerBlock {
    public ShellBlock() {
        super(MobEffects.LUCK, 3, BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.STONE).strength(0.5f, 0.5f).noCollission());
    }

    @Override
    public int getEffectDuration() {
        return 3;
    }

    @Override
    public BlockBehaviour.OffsetType getOffsetType() {
        return BlockBehaviour.OffsetType.NONE;
    }

    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
        return new ItemStack(TechBlocks.SHELL.get());
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(TechBlocks.SHELL.get()));
    }

    @Override
    public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
        return groundState.is(Blocks.SAND) ||
               groundState.is(Blocks.RED_SAND) ||
               groundState.is(Blocks.GRASS_BLOCK) ||
               groundState.is(Blocks.DIRT);
    }

    @Override
    public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
        BlockPos blockpos = pos.below();
        BlockState groundState = worldIn.getBlockState(blockpos);
        return this.mayPlaceOn(groundState, worldIn, blockpos);
    }

    @Override
    public PlantType getPlantType(BlockGetter world, BlockPos pos) {
        return PlantType.BEACH;
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer(TechBlocks.SHELL.get(), renderType -> renderType == RenderType.cutout());
    }
}

