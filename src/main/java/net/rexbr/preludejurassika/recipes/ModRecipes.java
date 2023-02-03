package net.rexbr.preludejurassika.recipes;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.prelude;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, prelude.MODID);

    public static final RegistryObject<RecipeSerializer<AnalyzerRecipe>> ANALYZER_SERIALIZER =
            SERIALIZERS.register("analyze", () -> AnalyzerRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<CultureRecipe>> CULTURE_SERIALIZER =
            SERIALIZERS.register("culture", () -> CultureRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<CleanerRecipe>> CLEANER_SERIALIZER =
            SERIALIZERS.register("cleaner", () -> CleanerRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<RessonatorRecipe>> RESSONATOR_SERIALIZER =
            SERIALIZERS.register("ressonate", () -> RessonatorRecipe.Serializer.INSTANCE);



    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
