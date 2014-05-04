package com.frogman786.slender.commands;

import java.util.Map;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.frogman786.slender.Main;

public class Cfg implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Map<String, String> cfgmap = Main.configmap;
		sender.sendMessage(cfgmap.toString());
		return true;
	}

}
