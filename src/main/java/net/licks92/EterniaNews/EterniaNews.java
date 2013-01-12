package net.licks92.EterniaNews;

import org.bukkit.Bukkit;

import net.licks92.EterniaCore.Plugin.EterniaPlugin;

public class EterniaNews extends EterniaPlugin
{
	@Override
	public void onEnable()
	{
		if(!this.linkToCore(this.getName()))
		{
			Bukkit.getLogger().severe("Le plugin n'a pas pu se connecter au core Eternia et ne peut donc pas fonctionner.");
		}
		log.info("Le plugin s'est bien connecté au core Eternia!");
	}
	
	@Override
	public void onDisable()
	{
		
	}
}
