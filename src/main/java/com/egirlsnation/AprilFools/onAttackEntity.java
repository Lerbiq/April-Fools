package com.egirlsnation.AprilFools;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

public class onAttackEntity implements Listener {


    @EventHandler
    public void onEntityAttack(EntityDamageByEntityEvent e){
        if(e.getDamager() instanceof Player){
            Player damager = (Player) e.getDamager();
            ItemStack hand = damager.getInventory().getItemInMainHand();

            if(damager.getGameMode().equals(GameMode.CREATIVE)){
                return;
            }

            if (hand != null) {
                if (hand.getType().equals(Material.STICK)) {
                    if (hand.getItemMeta() != null) {
                        if (hand.getItemMeta().hasLore()) {
                            List<String> lore = hand.getItemMeta().getLore();
                            if (lore != null) {
                                if (lore.contains(ChatColor.RED + "It yeets")) {
                                    if(e.getEntity() instanceof LivingEntity){
                                        ((LivingEntity)e.getEntity()).addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 200, 100));
                                        ((LivingEntity)e.getEntity()).addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 2000, 100));
                                        main.heightCheck((LivingEntity) e.getEntity());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }else if(e.getDamager() instanceof Arrow){
            Arrow arrow = (Arrow) e.getDamager();
            if(arrow.getShooter() instanceof LivingEntity){
                LivingEntity entity = (LivingEntity) arrow.getShooter();
                e.getEntity().teleport(entity.getLocation());
            }
        }
    }
}
