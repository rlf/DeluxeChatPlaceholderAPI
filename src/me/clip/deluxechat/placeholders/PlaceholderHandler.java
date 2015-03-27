package me.clip.deluxechat.placeholders;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class PlaceholderHandler {
	

	public static boolean registerPlaceholderHook(Plugin plugin, DeluxePlaceholderHook placeholderHook) {
		return false;
	}
	
	public static boolean registerRecipientPlaceholderHook(Plugin plugin, DeluxeRecipientPlaceholderHook placeholderHook) {
		return false;
	}
	
	public static boolean registerPlaceholderHook(String plugin, DeluxePlaceholderHook placeholderHook) {
		return false;
	}
	
	public static boolean registerRecipientPlaceholderHook(String plugin, DeluxeRecipientPlaceholderHook placeholderHook) {
		return false;
	}

	public static boolean unregisterPlaceholderHook(Plugin plugin) {
		return false;
	}
	
	public static boolean unregisterRecipientPlaceholderHook(Plugin plugin) {
		return false;
	}
	
	public static boolean unregisterPlaceholderHook(String plugin) {
		return false;
	}
	
	public static boolean unregisterRecipientPlaceholderHook(String plugin) {
		return false;
	}
	
	public static Set<String> getRegisteredPlaceholderPlugins() {
		return null;
	}
	
	public static Set<String> getRegisteredRecipientPlaceholderPlugins() {
		return null;
	}
	
	public static Map<String, DeluxePlaceholderHook> getPlaceholders() {
		return null;
	}
	
	public static Map<String, DeluxeRecipientPlaceholderHook> getRecipientPlaceholders() {
		return null;
	}
	public static List<String> setPlaceholders(Player p, List<String> text) {
		return null;
	}

	public static String setPlaceholders(Player player, String text) {
		return null;
	}
	
	public static List<String> setRecipientPlaceholders(Player p, Player recipient, List<String> text) {
		return null;
	}
	
	public static String setRecipientPlaceholders(Player player, Player recipient, String text) {
		return null;
	}
}
