package de.hegi.nomonsterplugin.Recipes.ShapedRecipes;


import de.hegi.nomonsterplugin.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class CustomBlazeRodRecipe {

    public static ShapedRecipe getRecipe() {
        NamespacedKey key = new NamespacedKey(Main.getInstance(), "nomonster");
        ShapedRecipe recipe = new ShapedRecipe(key,new ItemStack(Material.BLAZE_ROD, 1));

        recipe.shape(" N ", " G ", " N ");
        recipe.setIngredient('N', Material.NETHER_BRICK);
        recipe.setIngredient('G', Material.GOLD_BLOCK);

        return recipe;
    }

}
