package de.hegi.nomonsterplugin.Recipes.ShapedRecipes;


import de.hegi.nomonsterplugin.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class CustomEnderPearlRecipe {

    public static ShapedRecipe getRecipe() {
        NamespacedKey key = new NamespacedKey(Main.getInstance(), "nomonster");
        ShapedRecipe recipe = new ShapedRecipe(key,new ItemStack(Material.ENDER_PEARL, 1));

        recipe.shape(" L ", "LEL", " L ");
        recipe.setIngredient('L', Material.LAPIS_LAZULI);
        recipe.setIngredient('E', Material.EMERALD);

        return recipe;
    }

}
