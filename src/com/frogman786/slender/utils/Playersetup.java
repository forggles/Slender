package com.frogman786.slender.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Playersetup {
	private static ItemStack item1 = new ItemStack(Material.getMaterial("STONE"));
	private static ItemStack sItem1 = new ItemStack(Material.getMaterial("STONE"));
	
	public static void invSetup(Player p){
		//TODO setup player gear stuffs
		if(Slender.isSlender(p)){
			p.getInventory().addItem(sItem1);
		}else{
			p.getInventory().addItem(item1);
		}
	}
	
	public static void Saveinv(Player p){
		//TODO setup save inv data
	}
	
	public static void restoreInv(Player p){
		//TODO setup restore inv data
	}
	
}
