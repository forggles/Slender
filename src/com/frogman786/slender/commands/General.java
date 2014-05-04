package com.frogman786.slender.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class General implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(args.length >= 1){
			
		}else{
			Player player = (Player) sender;
			sender.sendMessage(com.frogman786.slender.utils.help.getHelpMessage(player));
		}
		return false;
	}

}
