package com.frogman786.slender.utils;

import org.bukkit.entity.Player;

public class help {
	private static String[] basic = {"line1\n","line2"};
	private static String[] admin = {"line1\n","line2\n"};
	public static String getHelpMessage(Player p){
		if(p.hasPermission("frog.slender.admin")){
			return (admin.toString() + basic.toString());
		}else{
				return basic.toString();
			}
	}
}
