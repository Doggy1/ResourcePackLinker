package me.onix.resourcepacklinker;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		
		//Register Command
		this.getCommand("ResourcePack").setExecutor(new RpCommand());
	}
	
	@Override
	public void onDisable() {
		
	}
	
}
