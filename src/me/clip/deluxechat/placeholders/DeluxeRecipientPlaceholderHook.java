package me.clip.deluxechat.placeholders;

import org.bukkit.entity.Player;

public abstract class DeluxeRecipientPlaceholderHook {
	
	public abstract String onRecipientPlaceholderRequest(Player sender, Player recipient, String identifier);
	
}
