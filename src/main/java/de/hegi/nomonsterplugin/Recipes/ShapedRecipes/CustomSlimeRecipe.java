package de.hegi.nomonsterplugin.Recipes.ShapedRecipes;


import de.hegi.nomonsterplugin.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class CustomSlimeRecipe {

    public static ShapedRecipe getRecipe() {
        NamespacedKey key = new NamespacedKey(Main.getInstance(), "nomonster");
        ShapedRecipe recipe = new ShapedRecipe(key,new ItemStack(Material.SLIME_BALL, 1));

        recipe.shape(" K ", "KEK", " K ");
        recipe.setIngredient('K', Material.KELP);
        recipe.setIngredient('E', Material.EGG);

        return recipe;
    }

}
