package com.egirlsnation.AprilFools;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class onPlayerDamage implements Listener {

    @EventHandler
    public void onPlayerDamage(EntityDamageEvent e){
        if(e.getEntity() instanceof Player){
            if(e.getCause().equals(EntityDamageEvent.DamageCause.FALL)){
                Player player = (Player) e.getEntity();
                player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 20, 100));
            }else if(e.getCause().equals(EntityDamageEvent.DamageCause.LAVA)){
                e.getEntity().getWorld().getBlockAt(e.getEntity().getLocation().add(0,1,0)).setType(Material.WATER);
            }else if(e.getCause().equals(EntityDamageEvent.DamageCause.ENTITY_ATTACK)){
                Player player = (Player) e.getEntity();
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 100));
            }else if(e.getCause().equals(EntityDamageEvent.DamageCause.FIRE)){
                Player player = (Player) e.getEntity();
                player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 20, 100));
            }
        }
    }
}
