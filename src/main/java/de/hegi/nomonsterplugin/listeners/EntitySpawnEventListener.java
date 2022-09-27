package de.hegi.nomonsterplugin.listeners;

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
        String world_Key = event.getLocation().getWorld().getKey().getKey();

        if (entity instanceof Monster) {
            event.setCancelled(true);
        }
    }
}
