package de.hegi.nomonsterplugin.Recipes;


import org.bukkit.Bukkit;
import de.hegi.nomonsterplugin.Recipes.ShapedRecipes.*;

public class RecipesManager {
  public void addAllRecipes() {
    this.addShapedRecipes();
  }

  private void addShapedRecipes() {
    Bukkit.addRecipe(CustomTridentRecipe.getRecipe());
    Bukkit.addRecipe(CustomGhastTearRecipe.getRecipe());
  }

}
