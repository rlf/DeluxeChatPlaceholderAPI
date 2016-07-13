package me.clip.placeholdertest;

import me.clip.deluxechat.placeholders.DeluxePlaceholderHook;
import me.clip.deluxechat.placeholders.PlaceholderHandler;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class PlaceholderTestPlugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		if (Bukkit.getPluginManager().isPluginEnabled("DeluxeChat")) {

			boolean hooked = PlaceholderHandler.registerPlaceholderHook(this,
					new DeluxePlaceholderHook() {

						/*
						 * this method will be called any time a placeholder
						 * %<yourplugin>_<identifier>% is found
						 */
						@Override
						public String onPlaceholderRequest(Player p, String identifier) {

							if (identifier.equalsIgnoreCase("color")) {
								//your plugin method to obtain a players chat color
								return getChatColor(p);
							}
							//was not a correct identifier
							return null;
						}
					});
			
			if (hooked) {
				getLogger().info("DeluxeChat placeholder hook was successfully registered!");
			}
		}
	}
	
	public String getChatColor(Player p) {
		return "";
	}
	

	@Override
	public void onDisable() {

		PlaceholderHandler.unregisterPlaceholderHook(this);
	}
}
