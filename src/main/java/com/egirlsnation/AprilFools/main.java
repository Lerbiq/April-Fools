package com.egirlsnation.AprilFools;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public class main extends JavaPlugin {

    public static main plugin;

    public static Random rng = new Random();

    @Override
    public void onEnable(){
        plugin = this;
        Bukkit.getLogger().info(ChatColor.AQUA + "April Fools plugin by Lerbiq enabled.");

        getServer().getPluginManager().registerEvents(new onPlayerInteract(), this);
        getServer().getPluginManager().registerEvents(new onAttackEntity(), this);
        getServer().getPluginManager().registerEvents(new onPlayerDamage(), this);
        this.getCommand("givesticks").setExecutor(new giveStickCommand());
        this.getCommand("enablepatch").setExecutor(new errorCommand());

    }

    @Override
    public void onDisable(){
        Bukkit.getLogger().info(ChatColor.RED + "April Fools plugin by Lerbiq disabled.");
    }

    public static void heightCheck(LivingEntity entity){
        Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
            @Override
            public void run() {
                if(entity.getLocation().getY() < 200){
                    entity.teleport(entity.getLocation().add(0, 1000, 0));
                }
            }
        }, 50);
    }
}
