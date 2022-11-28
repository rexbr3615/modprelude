package net.rexbr.preludejurassika.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class PreludeClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> estilizedpyroraptor;

    static {
        BUILDER.push("Configs for Prelude Mod");

        estilizedpyroraptor = BUILDER.comment("estilized pyroraptor jwe")
                .define("estilized pyroraptor",false);

        // HERE DEFINE YOUR CONFIGS

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
