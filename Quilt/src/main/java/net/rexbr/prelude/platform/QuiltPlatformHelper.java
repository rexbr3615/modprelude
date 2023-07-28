package com.example.examplemod.platform;

import net.rexbr.examplemod.platform.services.IPlatformHelper;
import org.quiltmc.loader.impl.QuiltLoaderImpl;

public class QuiltPlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Quilt";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return QuiltLoaderImpl.INSTANCE.isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return QuiltLoaderImpl.INSTANCE.isDevelopmentEnvironment();
    }
}
