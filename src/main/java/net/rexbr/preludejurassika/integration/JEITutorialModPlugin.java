package net.rexbr.preludejurassika.integration;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.rexbr.preludejurassika.prelude;
import net.rexbr.preludejurassika.recipes.AnalyzerRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.rexbr.preludejurassika.recipes.CleanerRecipe;
import net.rexbr.preludejurassika.recipes.CultureRecipe;
import net.rexbr.preludejurassika.recipes.RessonatorRecipe;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEITutorialModPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(prelude.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {

        registration.addRecipeCategories(new
                AnalyzerRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                CleanerRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                RessonatorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new
                VatRecipeCategory(registration.getJeiHelpers().getGuiHelper()));


    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<AnalyzerRecipe> recipes = rm.getAllRecipesFor(AnalyzerRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(AnalyzerRecipeCategory.UID, AnalyzerRecipe.class), recipes);
        List<CleanerRecipe> recipes1 = rm.getAllRecipesFor(CleanerRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(CleanerRecipeCategory.UID, CleanerRecipe.class), recipes1);
        List<RessonatorRecipe> recipes2 = rm.getAllRecipesFor(RessonatorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(RessonatorRecipeCategory.UID, RessonatorRecipe.class), recipes2);
        List<CultureRecipe> recipes3 = rm.getAllRecipesFor(CultureRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(VatRecipeCategory.UID, CultureRecipe.class), recipes3);


    }
}
