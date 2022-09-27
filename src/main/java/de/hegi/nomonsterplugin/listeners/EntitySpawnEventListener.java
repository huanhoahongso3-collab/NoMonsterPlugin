package de.hegi.nomonsterplugin.listeners;

import de.hegi.nomonsterplugin.Main;
import de.hegi.nomonsterplugin.config.Config;
import org.bukkit.NamespacedKey;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class EntitySpawnEventListener implements Listener {

    @EventHandler
    public void onEntitySpawn(EntitySpawnEvent event) {
        Entity entity = event.getEntity();
        String world_name = event.getLocation().getWorld().getName();

        if (!this.getWorldConfig(world_name)) {
            return;
        }

        if (entity instanceof Monster) {
            event.setCancelled(true);
        }
    }

    private boolean getWorldConfig(String world_name) {
        Config config = Main.getInstance().getPluginConfig();

        if (!config.getConfig().contains(world_name + ".stopMonsterSpawning")) {
            config.getConfig().set(world_name + ".stopMonsterSpawning", true);
        }
        return config.getConfig().getBoolean(world_name + ".stopMonsterSpawning");
    }

}
