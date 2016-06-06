package fr.natip.nastyhub.listeners;

import fr.natip.nastyhub.NastyHubPlugin;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

/**
 * Created by kevin on 05/06/2016.
 */

public class SpawnListener implements Listener {

    NastyHubPlugin plugin;

    public SpawnListener(NastyHubPlugin instance) {
        this.plugin = instance;
    }

    @EventHandler
    public void entitySpawn(EntitySpawnEvent e) {
        Entity ent = e.getEntity();
        if (!plugin.getConfig().getList("spawnWorlds").contains(ent.getWorld().getName())) {
            return;
        }
        e.setCancelled(true);
    }
}

