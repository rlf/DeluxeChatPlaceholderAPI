package me.clip.deluxechat.placeholders;

import org.bukkit.entity.Player;

public abstract class DeluxePlaceholderHook {
	
	public abstract String onPlaceholderRequest(Player p, String identifier);
}
