package net.poweredbyscience.qballai;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Lax on 12/19/2016.
 */
public class QballAI extends JavaPlugin implements Listener {

    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onSpawn(CreatureSpawnEvent ev) {
        ev.getEntity().setAI(false);
    }
}
