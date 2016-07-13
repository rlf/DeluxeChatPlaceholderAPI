package me.clip.deluxechat.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlaceholderHookUnloadEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
	
	private boolean cancelled;
	
	private String plugin;

	public PlaceholderHookUnloadEvent(final String plugin) {
		this.plugin = plugin;
	}

	public String getPluginName() {
		return plugin;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
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