package de.hegi.nomonsterplugin.Recipes.ShapedRecipes;


import de.hegi.nomonsterplugin.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class CustomSpiderEyeRecipe {

    public static ShapedRecipe getRecipe() {
        NamespacedKey key = new NamespacedKey(Main.getInstance(), "nomonster");
        ShapedRecipe recipe = new ShapedRecipe(key,new ItemStack(Material.SPIDER_EYE, 2));

        recipe.shape("  B", " S ", "S  ");
        recipe.setIngredient('B', Material.SLIME_BALL);
        recipe.setIngredient('S', Material.STRING);

        return recipe;
    }

}
