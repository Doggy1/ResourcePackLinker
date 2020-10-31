package me.onix.resourcepacklinker;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		
		this.saveDefaultConfig();
		
		//Register Command
		this.getCommand("ResourcePack").setExecutor(new RpCommand(this));
	}
	
	@Override
	public void onDisable() {
		
	}
	
}
