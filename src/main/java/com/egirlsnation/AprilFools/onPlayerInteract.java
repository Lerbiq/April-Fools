package com.egirlsnation.AprilFools;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class onPlayerInteract implements Listener {

    @EventHandler
    public void PlayerInteractEvent(PlayerInteractEvent e) {

        Player player = e.getPlayer();
        ItemStack hand = e.getItem();
        if(player.getGameMode().equals(GameMode.CREATIVE)){
            return;
        }
        if (hand != null) {
            if (hand.getType().equals(Material.BLAZE_ROD) || hand.getType().equals(Material.CHAIN) || hand.getType().equals(Material.BONE) || hand.getType().equals(Material.BAMBOO)) {
                if (hand.getItemMeta() != null) {
                    if (hand.getItemMeta().hasLore()) {
                        List<String> lore = hand.getItemMeta().getLore();
                        if (lore != null) {
                            if (lore.contains(ChatColor.RED + "Popbob's dick")) {
                                player.getWorld().strikeLightning(player.getTargetBlock(null, 200).getLocation());
                            } else if (lore.contains(ChatColor.RED + "Auto ass yeeter")) {
                                Snowball snowball = player.getWorld().spawn(player.getEyeLocation(), Snowball.class);
                                snowball.setShooter(player);
                                snowball.setVelocity(player.getLocation().getDirection().multiply(3));
                            } else if (lore.contains(ChatColor.RED + "Obi gone machine 420")) {
                                WitherSkull skull = player.getWorld().spawn(player.getEyeLocation(), WitherSkull.class);
                                skull.setCharged(true);
                                skull.setShooter(player);
                                skull.setVelocity(player.getLocation().getDirection().multiply(6));
                            } else if (lore.contains(ChatColor.MAGIC + "Get good")) {
                                if (player.isInsideVehicle()) {
                                    if (player.getVehicle() instanceof EnderPearl) {
                                        player.sendMessage(ChatColor.RED + "You cannot use " + ChatColor.MAGIC + "I boned ur mom" + ChatColor.RED + " now.");
                                        return;
                                    }
                                }
                                EnderPearl pearl = player.getWorld().spawn(player.getEyeLocation(), EnderPearl.class);
                                pearl.addPassenger(player);
                                pearl.setVelocity(player.getLocation().getDirection().multiply(2.5));
                            }
                        }
                    }
                }
            }
        }

    }
}
