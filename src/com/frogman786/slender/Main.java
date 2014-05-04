package com.frogman786.slender;
 
import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.frogman786.slender.commands.General;
import com.frogman786.slender.commands.Tracking;
import com.frogman786.slender.commands.Cfg;
 
public class Main extends JavaPlugin{
   
    private static Plugin plugin;
    public static Map<String, String> playingmap = new HashMap<String, String>();
    public static Map<String, String> configmap = new HashMap<String, String>();
    public static Map<String,Boolean> trackingmap = new HashMap<String, Boolean>();
    
    public void onEnable() {
        plugin = this;
        registerEvents(this, new Events());
        configini();
        commandini();
    }
   
    public void onDisable() {
       
    }
    public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
        for (Listener listener : listeners) {
            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        }
    }
    public static Plugin getPlugin() {
        return plugin;
    }
    
    private void configini(){
    	FileConfiguration config = getConfig();
		config.options().copyDefaults(true);
		saveConfig();
		for(String str: getConfig().getKeys(true)) {
			 
			String p = getConfig().getString(str);
			 
			configmap.put(str, p);
		}
    }
    
    private void commandini(){
        //compass
        getCommand("track").setExecutor(new tracking());
        getCommand("untrack").setExecutor(new tracking());
        //debugs
        getCommand("cfgdebug").setExecutor(new cfg());
        getCommand("trackdebug").setExecutor(new tracking());
    }
   
   
   
 
}