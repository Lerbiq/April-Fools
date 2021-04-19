package com.egirlsnation.AprilFools;

import org.bukkit.Bukkit;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.spigotmc.event.entity.EntityDismountEvent;

public class onEntityDismount implements Listener {

    @EventHandler
    public void onEntityDismount(EntityDismountEvent e){
        Bukkit.getLogger().info(e.getEntity().toString());
        Bukkit.getLogger().info(e.getDismounted().toString());
        if(e.getEntity() instanceof Player){
            if(e.getDismounted() instanceof EnderPearl){
                EnderPearl pearl = (EnderPearl) e.getDismounted();
                if(pearl.getCustomName().equals("Cancel")){
                    e.setCancelled(true);
                }

            }
        }
    }
}
