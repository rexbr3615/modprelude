package net.rexbr.prelude.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.rexbr.prelude.Prelude;

@Mod(Prelude.MOD_ID)
public class PreludeForge {
    public PreludeForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Prelude.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Prelude.init();
    }
}
