package net.rexbr.preludejurassika.integration;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.rexbr.preludejurassika.prelude;
import net.rexbr.preludejurassika.block.ModBlocks;
import net.rexbr.preludejurassika.item.ModItems;
import net.rexbr.preludejurassika.recipes.AnalyzerRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;

public class AnalyzerRecipeCategory implements IRecipeCategory<AnalyzerRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(prelude.MODID, "analyze");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(prelude.MODID, "textures/gui/gem_cutting_station_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public AnalyzerRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(ModBlocks.ANALYZER.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends AnalyzerRecipe> getRecipeClass() {
        return AnalyzerRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TextComponent("analyzer");
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
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull AnalyzerRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 34, 40).addIngredients(Ingredient.of(ModItems.NUCLEOTIDES.get()));
        builder.addSlot(RecipeIngredientRole.INPUT, 57, 18).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 103, 18).addIngredients(Ingredient.of(ModItems.DISC_DRIVE.get()));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStack(recipe.getResultItem());
    }
}
