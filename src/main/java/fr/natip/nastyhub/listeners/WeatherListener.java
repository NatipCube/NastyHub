package fr.natip.nastyhub.runnables;

import fr.natip.nastyhub.NastyHubPlugin;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * Created by kevin on 06/06/2016.
 */
public class TimeRunnable extends BukkitRunnable {

    NastyHubPlugin plugin;

    public TimeRunnable(NastyHubPlugin instance) {
        this.plugin = instance;
    }

   public void run() {

        for (World w : Bukkit.getServer().getWorlds()) {
            if (!plugin.getConfig().getList("timeWorlds").contains(w.getName())) {
                return;
            }

            w.setTime(plugin.getConfig().getInt("lockTime"));
        }
    }
}
