package com.frogman786.slender.utils;

import java.util.Collections;

import org.bukkit.entity.Player;

import com.frogman786.slender.Main;

public class Slender {
	public static boolean isSlender(Player p){
		if(Main.playinglist.get(0) == p.getName()){
			return true;
		}else{
			return false;
		}
	}
	
	public static void randomSlender(){
		Collections.shuffle(Main.playinglist);
	}
	
	public static void setSlender(Player p){
		int slenderPos = Main.playinglist.indexOf(p.getName());
		if(slenderPos != 0){
			Main.playinglist.remove(slenderPos);
			Main.playinglist.add(0,p.getName());
		}
	}
}
