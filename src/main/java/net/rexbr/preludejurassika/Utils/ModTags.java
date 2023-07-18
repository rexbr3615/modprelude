package net.rexbr.preludejurassika.Utils;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.rexbr.preludejurassika.prelude;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> P_H = forgeTag("food/prelude_herd");
        public static final TagKey<Item> P_C = forgeTag("food/prelude_carn");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(prelude.MODID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }


}
