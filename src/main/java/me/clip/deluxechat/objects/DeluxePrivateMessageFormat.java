package me.clip.deluxechat.objects;
/**
 * DeluxeChat DeluxeFormat class
 * @author Ryan McCarthy
 */

import java.util.List;

public class DeluxePrivateMessageFormat {
	
    private String format;
    
    private List<String> tooltip;
    
    private String clickAction;
    
    private String chatColor;
	
	public DeluxePrivateMessageFormat(String format, List<String> tooltip, String clickAction, String chatColor) {
		this.setChatColor(chatColor);
		this.setFormat(format);
		this.setTooltip(tooltip);
		this.setClickAction(clickAction);
	}
	
	public DeluxePrivateMessageFormat(String format) {
		this.setFormat(format);
	}
	
	public static DeluxePrivateMessageFormat newInstance(DeluxePrivateMessageFormat format) {
		DeluxePrivateMessageFormat copy = new DeluxePrivateMessageFormat(format.getFormat());
		copy.setTooltip(format.getTooltip());
		copy.setClickAction(format.getClickAction());
		copy.setChatColor(format.getChatColor());
		return copy;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public List<String> getTooltip() {
		return tooltip;
	}

	public void setTooltip(List<String> tooltip) {
		this.tooltip = tooltip;
	}

	public String getClickAction() {
		return clickAction;
	}

	public void setClickAction(String clickAction) {
		this.clickAction = clickAction;
	}

	public String getChatColor() {
		return chatColor;
	}

	public void setChatColor(String chatColor) {
		this.chatColor = chatColor;
	}
	
}
