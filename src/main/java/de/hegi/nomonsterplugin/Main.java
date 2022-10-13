package de.hegi.nomonsterplugin;

import de.hegi.nomonsterplugin.Recipes.RecipesManager;
import de.hegi.nomonsterplugin.commands.NoMonsterCommand;
import de.hegi.nomonsterplugin.commands.completion.NoMonsterCompletion;
import de.hegi.nomonsterplugin.listeners.EntitySpawnEventListener;
import de.hegi.nomonsterplugin.config.Config;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.List;

public final class Main extends JavaPlugin {

  private static Main instance;
  private Config config;
  @Override
  public void onLoad() {
    instance = this;
    config = new Config();
  }

  @Override
  public void onEnable() {
    Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "The No Monster Plugin loaded!");
    PluginManager manager = Bukkit.getPluginManager();
    manager.registerEvents(new EntitySpawnEventListener(), this);

    getCommand("nomonster").setExecutor(new NoMonsterCommand());
    getCommand("nomonster").setTabCompleter(new NoMonsterCompletion());

    RecipesManager recipesManager = new RecipesManager();
    recipesManager.addAllRecipes();
  }

  @Override
  public void onDisable() {
    config.save();
  }

  public Config getPluginConfig() {
    return config;
  }

  public static Main getInstance() {
    return instance;
  }

}
