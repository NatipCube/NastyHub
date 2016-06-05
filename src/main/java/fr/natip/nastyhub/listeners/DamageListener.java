package fr.natip.nastyhub.listeners;

import fr.natip.nastyhub.NastyHubPlugin;
import org.bukkit.GameMode;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class DamageListener implements Listener {
	
    NastyHubPlugin plugin;

    public DamageListener(NastyHubPlugin instance) {
        this.plugin = instance;
    }
	
	@EventHandler
	public void onDamage(EntityDamageEvent e) {
		if (e.getEntityType() != EntityType.PLAYER) {
			return;
		}
	
		
			Player p = (Player) e.getEntity();
			if (!plugin.getConfig().getList("healthWorlds").contains(p.getWorld().getName())) {
				return;
			}
			
			e.setCancelled(true);		
	    }
	
	@EventHandler
	public void onFood(FoodLevelChangeEvent e) {
		if (e.getEntityType() != EntityType.PLAYER) {
			return;
		}
	
		
			Player p = (Player) e.getEntity();
			if (!plugin.getConfig().getList("foodWorlds").contains(p.getWorld().getName())) {
				return;
			}
			
			e.setCancelled(true);		
	}
}
