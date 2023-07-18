package net.rexbr.prelude;

import com.google.common.base.Suppliers;
import com.mojang.logging.LogUtils;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registries;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.rexbr.prelude.init.ModBlocks;
import net.rexbr.prelude.init.ModItems;
import net.rexbr.prelude.init.ModTabs;
import org.slf4j.Logger;

import java.util.function.Supplier;

public class Prelude {
    public static final String MOD_ID = "prelude";
    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    public static final Logger LOGGER = LogUtils.getLogger();




    public static void init() {
        ModItems.ITEMS.register();
        ModBlocks.BLOCKS.register();

        System.out.println(PreludeExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
