package net.licks92.EterniaNews;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class EterniaNews extends JavaPlugin
{
	Logger logger;
	
	@Override
	public void onEnable()
	{
		logger = Bukkit.getLogger();
		logger.info("EterniaNews en cours de chargement");
	}
	
	@Override
	public void onDisable()
	{
		
	}
}
