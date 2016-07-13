package me.clip.deluxechat.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DeluxeChatJSONEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();

	private final Player player;
	
	private String jsonFormat;
	
	private String jsonChatMessage;
	
	private String rawChatMessage;
	
	private boolean cancelled;

	public DeluxeChatJSONEvent(final Player player, final String jsonFormat, final String jsonChatMessage, final String rawChatMessage) {

		this.player = player;
		this.jsonChatMessage = jsonChatMessage;
		this.rawChatMessage = rawChatMessage;
		this.jsonFormat = jsonFormat;
	}

	public Player getPlayer() {
		return player;
	}
	
	public String getJSONFormat() {
		return jsonFormat;
	}
	
	public void setJSONFormat(String updatedJSONFormat) {
		jsonFormat = updatedJSONFormat;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	public String getJSONChatMessage() {
		return jsonChatMessage;
	}

	public void setJSONChatMessage(String updatedJSONChatMessage) {
		this.jsonChatMessage = updatedJSONChatMessage;
	}
	
	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public String getRawChatMessage() {
		return rawChatMessage;
	}
}