package net.rexbr.prelude.fabric;

import net.rexbr.prelude.PreludeExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class PreludeExpectPlatformImpl {
    /**
     * This is our actual method to {@link PreludeExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
