package net.rexbr.preludejurassika.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class PreludeCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> dinosaurSpawning;
    public static final ForgeConfigSpec.ConfigValue<Integer> FOSSIL_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> FOSSIL_ORE_VEIN_SIZE;


    
    static {
        BUILDER.push("Configs for Prelude Mod");

        dinosaurSpawning = BUILDER.comment("dinosaurSpawning")
                        .define("dinosaurSpawning",false);
        FOSSIL_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many fossil Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 13);
        FOSSIL_ORE_VEIN_SIZE = BUILDER.comment("How many fossil Ore Blocks spawn in one Vein!")
                .defineInRange("Vein Size// original 9", 11, 4, 20);





        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
