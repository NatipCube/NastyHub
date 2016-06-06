package fr.natip.nastyhub;

import fr.natip.nastyhub.listeners.DamageListener;
import fr.natip.nastyhub.listeners.JoinListener;
import fr.natip.nastyhub.listeners.WeatherListener;
import fr.natip.nastyhub.runnables.TimeRunnable;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import fr.natip.nastyhub.listeners.SpawnListener;
import org.bukkit.scheduler.BukkitTask;

public class NastyHubPlugin extends JavaPlugin {
	public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveConfig();
		BukkitTask timeRunnable = new TimeRunnable(this).runTaskTimer(this, 0, 0);
        Bukkit.getPluginManager().registerEvents(new DamageListener(this), this);
	    Bukkit.getPluginManager().registerEvents(new JoinListener(this), this);
	    Bukkit.getPluginManager().registerEvents(new SpawnListener(this), this);
		Bukkit.getPluginManager().registerEvents(new WeatherListener(this), this);
	}
}
