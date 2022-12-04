package net.rexbr.preludejurassika.integration;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.rexbr.preludejurassika.block.ModBlocks;
import net.rexbr.preludejurassika.item.ModItems;
import net.rexbr.preludejurassika.prelude;
import net.rexbr.preludejurassika.recipes.AnalyzerRecipe;
import net.rexbr.preludejurassika.recipes.CleanerRecipe;

import javax.annotation.Nonnull;

public class CleanerRecipeCategory implements IRecipeCategory<CleanerRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(prelude.MODID, "clean");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(prelude.MODID, "textures/gui/cleaner.png");

    private final IDrawable background;
    private final IDrawable icon;

    public CleanerRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(ModBlocks.CLEANER.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends CleanerRecipe> getRecipeClass() {
        return CleanerRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TextComponent("clean");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull CleanerRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 34, 40).addIngredients(Ingredient.of(Items.POTION));
        builder.addSlot(RecipeIngredientRole.INPUT, 57, 18).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 103, 18).addIngredients(Ingredient.of(ModItems.PAINT_BRUSH.get()));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStack(recipe.getResultItem());
    }
}
