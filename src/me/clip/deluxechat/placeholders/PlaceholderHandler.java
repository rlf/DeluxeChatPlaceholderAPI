package me.clip.deluxechat.placeholders;

import java.util.Map;
import java.util.Set;


import org.bukkit.plugin.Plugin;

public class PlaceholderHandler {
	
	public static boolean registerPlaceholderHook(Plugin plugin, DeluxePlaceholderHook placeholderHook) {
		return false;
	}

	public static boolean unregisterPlaceholderHook(Plugin plugin) {
		return false;
	}
	
	public static boolean unregisterPlaceholderHook(String plugin) {
		return false;
	}
	
	public static Set<String> getRegisteredPlugins() {
		return null;
	}
	
	public static Map<String, DeluxePlaceholderHook> getPlaceholders() {
		return null;
	}
}
