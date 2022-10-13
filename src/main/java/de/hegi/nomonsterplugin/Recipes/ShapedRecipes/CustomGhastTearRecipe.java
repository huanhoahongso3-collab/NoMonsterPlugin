package de.hegi.nomonsterplugin.Recipes.ShapedRecipes;


import de.hegi.nomonsterplugin.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class CustomGhastTearRecipe {

    public static ShapedRecipe getRecipe() {
        NamespacedKey key = new NamespacedKey(Main.getInstance(), "nomonster");
        ShapedRecipe recipe = new ShapedRecipe(key,new ItemStack(Material.GHAST_TEAR, 1));

        recipe.shape("QQQ", "QBQ", "QQQ");
        recipe.setIngredient('Q', Material.QUARTZ);
        recipe.setIngredient('B', Material.BLAZE_POWDER);

        return recipe;
    }

}
