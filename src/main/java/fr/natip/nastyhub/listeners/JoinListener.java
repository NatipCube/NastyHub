package fr.natip.nastyhub.listeners;

import fr.natip.nastyhub.NastyHubPlugin;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by Louis on 05/06/2016.
 */
public class JoinListener implements Listener {

    NastyHubPlugin plugin;

    public JoinListener(NastyHubPlugin instance) {
        this.plugin = instance;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        if (!plugin.getConfig().getList("gamemodeWorlds").contains(p.getWorld().getName())) {
            return;
        }

        p.setGameMode(GameMode.ADVENTURE);

    }

}
