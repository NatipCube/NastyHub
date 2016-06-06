package fr.natip.nastyhub.listeners;

import fr.natip.nastyhub.NastyHubPlugin;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

/**
 * Created by kevin on 05/06/2016.
 */

public class WeatherListener implements Listener {

    NastyHubPlugin plugin;

    public WeatherListener(NastyHubPlugin instance) {
        this.plugin = instance;
    }

    @EventHandler
    public void weatherChange(WeatherChangeEvent e) {
        if (!plugin.getConfig().getList("weatherWorlds").contains(e.getWorld().getName())) {
            return;
        }

        e.setCancelled(true);
    }
}

