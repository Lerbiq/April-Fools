package com.egirlsnation.AprilFools;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class giveStickCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args){
        if(!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "You need to be a player to execute this command!");
        }else{
            Player player = (Player) sender;
            PlayerInventory inventory = player.getInventory();

            String name = Bukkit.getPlayer(UUID.fromString("")).getDisplayName();

            ItemStack lightningWand = new ItemStack(Material.BLAZE_ROD);
            ItemMeta meta = lightningWand.getItemMeta();
            meta.addEnchant(Enchantment.KNOCKBACK, 20,true);
            List<String> lore = new ArrayList<>();
            meta.setDisplayName(ChatColor.RED + "Ooga Booga Nibbaa Guacamole");
            lore.add(ChatColor.RED + "Popbob's dick");
            lore.add(ChatColor.DARK_PURPLE + "WARNING: Causes autism");
            meta.setLore(lore);
            lightningWand.setItemMeta(meta);

            ItemStack jihadWand = new ItemStack(Material.CHAIN);
            ItemMeta jihadMeta = jihadWand.getItemMeta();
            jihadMeta.addEnchant(Enchantment.KNOCKBACK, 20,true);
            List<String> jihadLore = new ArrayList<>();
            jihadMeta.setDisplayName(ChatColor.RED + "Yummy Yummy Cummy Cummy");
            jihadLore.add(ChatColor.RED + "Auto ass yeeter");
            jihadLore.add(ChatColor.DARK_PURPLE + "WARNING: Causes ADHD");
            jihadMeta.setLore(jihadLore);
            jihadWand.setItemMeta(jihadMeta);

            ItemStack skullWand = new ItemStack(Material.BONE);
            ItemMeta skullMeta = skullWand.getItemMeta();
            skullMeta.addEnchant(Enchantment.KNOCKBACK, 20,true);
            List<String> skullLore = new ArrayList<>();
            skullMeta.setDisplayName(ChatColor.RED + "I boned ur mom");
            skullLore.add(ChatColor.RED + "Obi gone machine 420");
            skullLore.add(ChatColor.DARK_PURPLE + "WARNING: Causes dementia");
            skullMeta.setLore(skullLore);
            skullWand.setItemMeta(skullMeta);

            ItemStack bambooWand = new ItemStack(Material.BAMBOO);
            ItemMeta bambooMeta = bambooWand.getItemMeta();
            bambooMeta.addEnchant(Enchantment.KNOCKBACK, 20,true);
            List<String> bambooLore = new ArrayList<>();
            bambooMeta.setDisplayName(ChatColor.MAGIC + "I boned ur mom");
            bambooLore.add(ChatColor.MAGIC + "Get good");
            bambooLore.add(ChatColor.DARK_PURPLE + "WARNING: " + ChatColor.MAGIC + "Sample text");
            bambooMeta.setLore(bambooLore);
            bambooWand.setItemMeta(bambooMeta);

            ItemStack yeetWand = new ItemStack(Material.STICK);
            ItemMeta yeetMeta = yeetWand.getItemMeta();
            yeetMeta.addEnchant(Enchantment.DAMAGE_ALL, 5,false);
            List<String> yeetLore = new ArrayList<>();
            yeetMeta.setDisplayName(ChatColor.BLUE + "YA YEEEEEEET");
            yeetLore.add(ChatColor.RED + "It yeets");
            yeetLore.add(ChatColor.DARK_PURPLE + "WARNING: Causes erectile dysfunction");
            yeetMeta.setLore(yeetLore);
            yeetWand.setItemMeta(yeetMeta);


            if(inventory.firstEmpty() == -1){
                player.getWorld().dropItemNaturally(player.getLocation(), lightningWand);
                player.getWorld().dropItemNaturally(player.getLocation(), jihadWand);
                player.getWorld().dropItemNaturally(player.getLocation(), skullWand);
                player.getWorld().dropItemNaturally(player.getLocation(), bambooWand);
                player.getWorld().dropItemNaturally(player.getLocation(), yeetWand);
            }else{
                inventory.addItem(lightningWand);
                inventory.addItem(jihadWand);
                inventory.addItem(skullWand);
                inventory.addItem(bambooWand);
                inventory.addItem(yeetWand);
            }

            player.sendMessage(ChatColor.BLUE + "Here you go.");
        }
        return true;
    }
}
