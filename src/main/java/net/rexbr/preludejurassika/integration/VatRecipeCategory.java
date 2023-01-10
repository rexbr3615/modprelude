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
import net.rexbr.preludejurassika.recipes.CleanerRecipe;
import net.rexbr.preludejurassika.recipes.CultureRecipe;

import javax.annotation.Nonnull;

public class VatRecipeCategory implements IRecipeCategory<CultureRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(prelude.MODID, "culture");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(prelude.MODID, "textures/gui/culture_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public VatRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(ModBlocks.CLEANER.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends CultureRecipe> getRecipeClass() {
        return CultureRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TextComponent("culture");
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
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull CultureRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 6).addIngredients(Ingredient.of(ModItems.NUTRIENTS.get()));
        builder.addSlot(RecipeIngredientRole.INPUT, 57, 18).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 103, 18).addIngredients(Ingredient.of(ModItems.EMPTY_EGG.get()));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStack(recipe.getResultItem());
    }
}
