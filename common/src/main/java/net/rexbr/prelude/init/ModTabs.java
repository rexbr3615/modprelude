package net.rexbr.prelude.init;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.rexbr.prelude.Prelude;

import static net.rexbr.prelude.Prelude.MOD_ID;

public class ModTabs {
    public static final CreativeModeTab Prelude_TAB = CreativeTabRegistry.create(
            new ResourceLocation(Prelude.MOD_ID, "preludemodtab"), () -> new ItemStack(ModItems.TOKEN.get())
    );
}
