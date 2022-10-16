package de.hegi.nomonsterplugin.Recipes.ShapelessRecipe;

import de.hegi.nomonsterplugin.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapelessRecipe;

import java.util.ArrayList;
import java.util.List;

public class CustomStringRecipe {

  public static ShapelessRecipe getRecipe() {
    NamespacedKey key = new NamespacedKey(Main.getInstance(), "nomonster");
    ShapelessRecipe recipe = new ShapelessRecipe(key,new ItemStack(Material.STRING, 4));
    List<Material> wools = new ArrayList<Material>();

    wools.add(Material.WHITE_WOOL);
    wools.add(Material.BLACK_WOOL);
    wools.add(Material.BLUE_WOOL);
    wools.add(Material.BROWN_WOOL);
    wools.add(Material.CYAN_WOOL);
    wools.add(Material.GRAY_WOOL);
    wools.add(Material.GREEN_WOOL);
    wools.add(Material.LIGHT_BLUE_WOOL);
    wools.add(Material.LIGHT_GRAY_WOOL);
    wools.add(Material.LIME_WOOL);
    wools.add(Material.MAGENTA_WOOL);
    wools.add(Material.ORANGE_WOOL);
    wools.add(Material.PINK_WOOL);
    wools.add(Material.PURPLE_WOOL);
    wools.add(Material.RED_WOOL);
    wools.add(Material.YELLOW_WOOL);

    recipe.addIngredient(new RecipeChoice.MaterialChoice(wools));

    return recipe;
  }

}
