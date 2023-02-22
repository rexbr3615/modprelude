package net.rexbr.preludejurassika.item.common;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.rexbr.preludejurassika.prelude;

import java.util.function.Supplier;

public class ItemModFishBucket extends MobBucketItem {

    public ItemModFishBucket(Supplier<? extends EntityType<?>> fishTypeIn, Fluid fluid, Item.Properties builder) {
        super(fishTypeIn, () -> fluid, () -> SoundEvents.BUCKET_EMPTY_FISH, builder.stacksTo(1));
    }

}
