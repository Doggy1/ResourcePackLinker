package me.onix.resourcepacklinker;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RpCommand implements CommandExecutor {
	
	private Main plugin;
	
	public RpCommand(Main instance) {
		this.plugin = instance;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (label.equalsIgnoreCase("resourcepack") || label.equalsIgnoreCase("rp")) {
			if (sender instanceof Player) {
				sender.sendMessage(plugin.getConfig().getString("pack-link"));
				return true;
			}
		}
		
		return false;
	}

}
