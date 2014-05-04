package com.frogman786.slender.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.frogman786.slender.Main;
import com.frogman786.slender.utils.Slender;

public class General implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(args.length >= 1){
			if(args.length == 1){
				if(args[0] == "join"){
					if(sender instanceof Player){
						Player player = (Player) sender;
						Main.playinglist.add(player.getName());
					}else{
						sender.sendMessage("only players can join a game");
					}
				}
				if(args[0] == "leave"){
					if(sender instanceof Player){
						Player player = (Player) sender;
						if(Main.playinglist.contains(player.getName())){
							if(Slender.isSlender(player)){
								Slender.randomSlender();
							}
							Main.playinglist.remove(player.getName());
							// TODO add stuffs to do when a player quits including isSlender(Player)
						}else{
							player.sendMessage(ChatColor.RED + "You can not quit a game you're not in");
						}
					}else{
						sender.sendMessage("only players can leave a game");
					}
				}
			}
			if(args.length == 2){
				
			}
		}else{
			Player player = (Player) sender;
			sender.sendMessage(com.frogman786.slender.utils.help.getHelpMessage(player));
		}
		return false;
	}

}
