package de.hegi.nomonsterplugin;

import de.hegi.nomonsterplugin.listeners.EntitySpawnEventListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new EntitySpawnEventListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
