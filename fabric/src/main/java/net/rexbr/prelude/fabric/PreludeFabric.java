package net.rexbr.prelude.fabric;

import net.fabricmc.api.ModInitializer;
import net.rexbr.prelude.Prelude;

public class PreludeFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Prelude.init();
    }
}
