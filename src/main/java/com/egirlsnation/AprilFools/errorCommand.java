package com.egirlsnation.AprilFools;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class errorCommand implements CommandExecutor {

    public static Random rng = new Random();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args){

        if(sender instanceof Player){
            sender.sendMessage(ChatColor.RED + "You don't have enough permission to execute this command");
        }else{
            int randomNum = rng.nextBoolean() ? rng.nextInt(100) : rng.nextInt(100) * -1;
            int randomNum2 = rng.nextBoolean() ? rng.nextInt(100) : rng.nextInt(100) * -1;
            int randomNum3 = 44441 + rng.nextInt(4000);
            String timestamp = new SimpleDateFormat("HH.mm.ss").format(new Date());
            Bukkit.broadcastMessage(ChatColor.RED+"net.minecraft.server.v1_16_R3.ReportedException: Loading NBT data\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTTagCompound.b(NBTTagCompound.java:475) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTTagCompound.access$200(NBTTagCompound.java:27) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTTagCompound$1.b(NBTTagCompound.java:53) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTTagCompound$1.b(NBTTagCompound.java:38) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTTagCompound.b(NBTTagCompound.java:468) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTTagCompound.access$200(NBTTagCompound.java:27) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTTagCompound$1.b(NBTTagCompound.java:53) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTTagCompound$1.b(NBTTagCompound.java:38) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTTagCompound.b(NBTTagCompound.java:468) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTTagCompound.access$200(NBTTagCompound.java:27) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTTagCompound$1.b(NBTTagCompound.java:53) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTTagCompound$1.b(NBTTagCompound.java:38) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTCompressedStreamTools.a(NBTCompressedStreamTools.java:176) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTCompressedStreamTools.a(NBTCompressedStreamTools.java:145) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTCompressedStreamTools.a(NBTCompressedStreamTools.java:135) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.RegionFileCache.readFromRegionFile(RegionFileCache.java:200) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.RegionFileCache.read(RegionFileCache.java:180) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.IChunkLoader.read(IChunkLoader.java:104) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.PlayerChunkMap.read(PlayerChunkMap.java:1719) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.WorldServer$2.readData(WorldServer.java:159) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at com.destroystokyo.paper.io.PaperFileIOThread$ChunkDataTask.run(PaperFileIOThread.java:508) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at com.destroystokyo.paper.io.QueueExecutorThread.pollTasks(QueueExecutorThread.java:105) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at com.destroystokyo.paper.io.QueueExecutorThread.run(QueueExecutorThread.java:38) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "Caused by: java.io.EOFException: Unexpected end of ZLIB input stream\n" +
                    "        at java.util.zip.InflaterInputStream.fill(InflaterInputStream.java:245) ~[?:?]\n" +
                    "        at java.util.zip.InflaterInputStream.read(InflaterInputStream.java:159) ~[?:?]\n" +
                    "        at java.io.BufferedInputStream.fill(BufferedInputStream.java:252) ~[?:?]\n" +
                    "        at java.io.BufferedInputStream.read1(BufferedInputStream.java:292) ~[?:?]\n" +
                    "        at java.io.BufferedInputStream.read(BufferedInputStream.java:351) ~[?:?]\n" +
                    "        at java.io.DataInputStream.readFully(DataInputStream.java:200) ~[?:?]\n" +
                    "        at java.io.DataInputStream.readLong(DataInputStream.java:421) ~[?:?]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTTagLongArray$1.b(SourceFile:33) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTTagLongArray$1.b(SourceFile:24) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        at net.minecraft.server.v1_16_R3.NBTTagCompound.b(NBTTagCompound.java:468) ~[patched_1.16.5.jar:git-Yatopia-ver/1.16.5-42]\n" +
                    "        ... 22 more\n" +
                    "["+ timestamp +" ERROR]: Could not load chunk for task: Chunk task: class:com.destroystokyo.paper.io.chunk.ChunkLoadTask, for world 'world', (" + randomNum + "," + randomNum2 + "), hashcode:21180"+ randomNum3 +", priority: -1, file IO thread has dumped the relevant exception above\n" +
                    "This usually means that the region is corrupted. Restoring a backup is advised. Further errors may result in deletion of the region.");
        }
        return true;
    }
}
