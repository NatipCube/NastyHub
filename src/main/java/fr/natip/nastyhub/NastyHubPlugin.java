package fr.natip.nastyhub;

import fr.natip.nastyhub.listeners.DamageListener;
import fr.natip.nastyhub.listeners.JoinListener;
import fr.natip.nastyhub.listeners.WeatherListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import fr.natip.nastyhub.listeners.SpawnListener;

public class NastyHubPlugin extends JavaPlugin {
public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveConfig();
        Bukkit.getPluginManager().registerEvents(new DamageListener(this), this);
        Bukkit.getPluginManager().registerEvents(new JoinListener(this), this);
        Bukkit.getPluginManager().registerEvents(new SpawnListener(this), this);
	Bukkit.getPluginManager().registerEvents(new WeatherListener(this), this);
     }
}
