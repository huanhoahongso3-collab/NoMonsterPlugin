package de.hegi.nomonsterplugin.Recipes.ShapedRecipes;


import de.hegi.nomonsterplugin.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import java.util.ArrayList;
import java.util.List;

public class CustomRottenFleshRecipe {

    public static ShapedRecipe getRecipe() {
        NamespacedKey key = new NamespacedKey(Main.getInstance(), "nomonster");
        ShapedRecipe recipe = new ShapedRecipe(key,new ItemStack(Material.BLAZE_ROD, 1));
        List<Material> flesh = new ArrayList<Material>();
        flesh.add(Material.BEEF);
        flesh.add(Material.PORKCHOP);
        flesh.add(Material.CHICKEN);
        flesh.add(Material.RABBIT);
        flesh.add(Material.MUTTON);

        recipe.shape("SF ", "   ", "   ");
        recipe.setIngredient('S', Material.SLIME_BALL);
        recipe.setIngredient('F', new RecipeChoice.MaterialChoice(flesh));

        return recipe;
    }

}
