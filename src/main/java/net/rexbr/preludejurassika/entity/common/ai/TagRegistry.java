package net.rexbr.preludejurassika.entity.common.ai;


import net.minecraft.resources.ResourceLocation;

import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import net.minecraftforge.common.Tags;


import net.rexbr.preludejurassika.prelude;

public class TagRegistry {

    //public static final TagKey<Item> CARNIVORE_FOODSTUFF = registerItemTag("gorilla_foodstuffs");

    public static class Items {
        public static final TagKey<Item> CARNIVORE_FOODSTUFF = forgeTag("preludediets/carnivores");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(prelude.MODID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
