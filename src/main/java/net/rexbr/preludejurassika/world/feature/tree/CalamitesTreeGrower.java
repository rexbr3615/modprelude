package net.rexbr.preludejurassika.world.feature.tree;

import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.rexbr.preludejurassika.procedurals.CalamitesGenP;
import net.rexbr.preludejurassika.world.feature.ModConfiguredFeatures;


import javax.annotation.Nullable;
import java.util.Random;

public class CalamitesTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override

    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random p_204307_, boolean p_204308_) {
        return ModConfiguredFeatures.CALAMITES_TREE;
    }
}