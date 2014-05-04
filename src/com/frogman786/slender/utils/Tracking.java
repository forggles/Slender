package com.frogman786.slender.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import com.frogman786.slender.Main;

public class Tracking {
	public static Player getNearest(Player p){
		double closest = Double.MAX_VALUE;
		Player closestp = null;
		for(String s : Main.playinglist){
			Player i = Bukkit.getPlayer(s); 
			if(!(isSneaking(i)) && i!=p){
			double dist = i.getLocation().distance(p.getPlayer().getLocation());
				if (closest == Double.MAX_VALUE || dist < closest){
					closest = dist;
					closestp = i;
				}
			}
		}
		if (closestp == null){
		  return p;
		}
		else{
		  return closestp;
		}
	}
	public static double getNearestDistance(Player p){
		double closest = Double.MAX_VALUE;
		for(String s : Main.playinglist){
			Player i = Bukkit.getPlayer(s); 
			if(!(isSneaking(i)) && i!=p){
			double dist = i.getLocation().distance(p.getPlayer().getLocation());
				if (closest == Double.MAX_VALUE || dist < closest){
					closest = dist;
				}
			}
		}
		return closest;
	}
	private static boolean isSneaking(Player p){
		if(Boolean.parseBoolean(Main.configmap.get("tracking.sneaking")) && p.isSneaking()){
			return true;
		}else{
			return false;
		}
	}
}
