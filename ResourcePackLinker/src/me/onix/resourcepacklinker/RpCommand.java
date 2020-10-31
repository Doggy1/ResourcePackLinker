package me.onix.resourcepacklinker;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class RpCommand implements CommandExecutor {
	
	private Main plugin;
	private final String link;
	
	public RpCommand(Main instance) {
		this.plugin = instance;
		
		link = plugin.getConfig().getString("pack-link");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (label.equalsIgnoreCase("resourcepack") || label.equalsIgnoreCase("rp")) {
			if (sender instanceof Player) {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6This server recommends the following resource pack:"));
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&n" + link));
				return true;
			}
		}
		
		return false;
	}

}
