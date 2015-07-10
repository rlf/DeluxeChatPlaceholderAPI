package me.clip.deluxechat.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class RecipientPlaceholderEvent extends Event {

	private static final HandlerList handlers = new HandlerList();

	private final Player player;
	
	private Player recipient;
	
	private String jsonFormat;
	
	private String chatMessage;
	
	private boolean bungeeMessage;

	public RecipientPlaceholderEvent(final Player player, final Player recipient, final String jsonFormat, final String chatMessage, boolean isBungeeMessage) {

		this.player = player;
		this.recipient = recipient;
		this.chatMessage = chatMessage;
		this.jsonFormat = jsonFormat;
		this.bungeeMessage = isBungeeMessage;
	}

	public Player getPlayer() {
		return player;
	}
	
	public String getJSONFormat() {
		return jsonFormat;
	}
	
	public void setJSONFormat(String jsonFormat) {
		this.jsonFormat = jsonFormat;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	public Player getRecipient() {
		return recipient;
	}

	public String getChatMessage() {
		return chatMessage;
	}

	public void setChatMessage(String chatMessage) {
		this.chatMessage = chatMessage;
	}

	public boolean isBungeeMessage() {
		return bungeeMessage;
	}
}