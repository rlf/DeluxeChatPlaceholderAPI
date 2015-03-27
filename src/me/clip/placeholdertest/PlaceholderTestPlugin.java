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
						 * %placeholdertestplugin_<identifier>% is found
						 */
						@Override
						public String onPlaceholderRequest(Player p, String identifier) {

							switch (identifier) {
							
							// %placeholdertestplugin_red%
							case "red":
								return "&c";
								
							// %placeholdertestplugin_white%
							case "white":
								return "&f";
								
							// %placeholdertestplugin_blue%	
							case "blue":
								return "&1";
								
							// %placeholdertestplugin_playername%	
							case "playername":
								return p.getName();
								
							// %placeholdertestplugin_uuid%	
							case "uuid":
								return p.getUniqueId().toString();
								
							// %placeholdertestplugin_flying%	
							case "flying":
								return p.isFlying() ? "&aYes" : "&cNo";
								
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
	

	@Override
	public void onDisable() {

		PlaceholderHandler.unregisterPlaceholderHook(this);
	}
}
