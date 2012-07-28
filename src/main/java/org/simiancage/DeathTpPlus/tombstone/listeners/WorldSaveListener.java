package org.simiancage.DeathTpPlus.tombstone.listeners;

/**
 * PluginName: DeathTpPlugin
 * Class: WorldSaveListener
 * User: DonRedhorse
 * Date: 14.11.11
 * Time: 20:47
 */

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldSaveEvent;
import org.simiancage.DeathTpPlus.tombstone.workers.TombWorker;


public class WorldSaveListener implements Listener {
    @EventHandler
    public void onWorldSave(WorldSaveEvent event) {
        TombWorker.getInstance().save();
    }

}
