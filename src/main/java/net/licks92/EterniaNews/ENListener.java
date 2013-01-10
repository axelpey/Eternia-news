package net.licks92.EterniaNews;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ENListener implements Listener
{
	EterniaNews plugin;
	
	public ENListener(EterniaNews r_plugin)
	{
		plugin = r_plugin;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onPlayerConnect(PlayerJoinEvent event)
	{
		
	}
}
