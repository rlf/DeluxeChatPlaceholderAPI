package me.clip.deluxechat.events;

import java.util.Set;

import me.clip.deluxechat.objects.DeluxeFormat;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DeluxeChatEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();

	private final Player player;
	
	private Set<Player> recipients;
	
	private DeluxeFormat rawFormat;
	
	private String chatMessage;
	
	private boolean cancelled;

	public DeluxeChatEvent(final Player player, final Set<Player> recip, final DeluxeFormat rawPlayerFormat, final String chatMessage) {

		this.player = player;
		this.recipients = recip;
		this.chatMessage = chatMessage;
		this.rawFormat = rawPlayerFormat;
	}

	public Player getPlayer() {
		return player;
	}
	
	public DeluxeFormat getDeluxeFormat() {
		return rawFormat;
	}
	
	public void setDeluxeFormat(DeluxeFormat updatedFormat) {
		rawFormat = updatedFormat;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	public Set<Player> getRecipients() {
		return recipients;
	}

	public void setRecipients(Set<Player> recipients) {
		this.recipients = recipients;
	}

	public String getChatMessage() {
		return chatMessage;
	}

	public void setChatMessage(String chatMessage) {
		this.chatMessage = chatMessage;
	}
	
	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
}