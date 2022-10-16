package de.hegi.nomonsterplugin.Recipes;


import org.bukkit.Bukkit;
import de.hegi.nomonsterplugin.Recipes.ShapedRecipes.*;
import de.hegi.nomonsterplugin.Recipes.ShapelessRecipe.*;

public class RecipesManager {
  public void addAllRecipes() {
    this.addShapedRecipes();
    this.addShapelessRecipes();
  }

  private void addShapedRecipes() {
    Bukkit.addRecipe(CustomBlazeRodRecipe.getRecipe());
    Bukkit.addRecipe(CustomBoneRecipe.getRecipe());
    Bukkit.addRecipe(CustomEnderPearlRecipe.getRecipe());
    Bukkit.addRecipe(CustomGhastTearRecipe.getRecipe());
    Bukkit.addRecipe(CustomRottenFleshRecipe.getRecipe());
    Bukkit.addRecipe(CustomSlimeRecipe.getRecipe());
    Bukkit.addRecipe(CustomSpiderEyeRecipe.getRecipe());
    Bukkit.addRecipe(CustomTridentRecipe.getRecipe());
  }

  private void addShapelessRecipes() {
    Bukkit.addRecipe(CustomStringRecipe.getRecipe());
  }

}
