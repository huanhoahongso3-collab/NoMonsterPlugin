package de.hegi.nomonsterplugin.Recipes.ShapedRecipes;


import de.hegi.nomonsterplugin.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class CustomTridentRecipe {

    public ShapedRecipe getRecipe() {
        NamespacedKey key = new NamespacedKey(Main::getNam, "trident");
        ShapedRecipe recipe = new ShapedRecipe(key,new ItemStack(Material.TRIDENT, 1));

        recipe.shape(" DD", " HD", "P  ");
        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('H', Material.HEART_OF_THE_SEA);
        recipe.setIngredient('P', Material.PRISMARINE_SHARD);

        return recipe;
    }

}
