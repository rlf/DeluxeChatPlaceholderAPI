package me.clip.deluxechat.objects;
/**
 * DeluxeChat DeluxeFormat class
 * @author Ryan McCarthy
 */

import java.util.List;

public class DeluxeFormat {
	
	private String identifier;

	private int index;
	
	private String channel;
	
	private String prefix;
	
	private String nameColor;
	
	private String name;
	
	private String suffix;
	
	private String chatColor;
	
	private boolean showChannelTooltip;
	private boolean showNameTooltip;
	private boolean showPreTooltip;
	private boolean showSuffixTooltip;
	
	private List<String> channelTooltip;
	private List<String> prefixTooltip;
	private List<String> nameTooltip;
	private List<String> suffixTooltip;
	
	private boolean useChannelClick;
	private boolean usePreClick;
	private boolean useNameClick;
	private boolean useSuffixClick;
	
	private String channelClickCommand;
	private String preClickCmd;
	private String nameClickCmd;
	private String suffixClickCmd;
	
	public DeluxeFormat(String identifier, int index) {
		
		setIndex(index);
		setIdentifier(identifier);
		
		setPrefix("");
		setNameColor("&b");
		setName("%displayname%");
		setSuffix("&b: ");
		setChatColor("&f");
	}
	
	public static DeluxeFormat newInstance(DeluxeFormat format) {
		DeluxeFormat copy = new DeluxeFormat(format.getIdentifier(), format.getIndex());
		copy.setChannel(format.getChannel());
		copy.setUseChannelClick(format.useChannelClick());
		copy.setChannelClickCommand(format.getChannelClickCommand());
		copy.setShowChannelTooltip(format.showChannelTooltip());
		copy.setChannelTooltip(format.getChannelTooltip());
		copy.setPrefix(format.getPrefix());
		copy.setUsePreClick(format.usePreClick());
		copy.setPreClickCmd(format.getPreClickCmd());
		copy.setShowPreTooltip(format.showPreTooltip());
		copy.setPrefixTooltip(format.getPrefixTooltip());
		copy.setNameColor(format.getNameColor());
		copy.setName(format.getName());
		copy.setUseNameClick(format.useNameClick());
		copy.setNameClickCmd(format.getNameClickCmd());
		copy.setShowNameTooltip(format.showNameTooltip());
		copy.setNameTooltip(format.getNameTooltip());
		copy.setSuffix(format.getSuffix());
		copy.setUseSuffixClick(format.useSuffixClick());
		copy.setSuffixClickCmd(format.getSuffixClickCmd());
		copy.setShowSuffixTooltip(format.showSuffixTooltip());
		copy.setSuffixTooltip(format.getSuffixTooltip());
		copy.setChatColor(format.getChatColor());
		return copy;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public List<String> getNameTooltip() {
		return nameTooltip;
	}

	public void setNameTooltip(List<String> tooltip) {
		this.nameTooltip = tooltip;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}


	public String getNameColor() {
		return nameColor;
	}

	public void setNameColor(String nameColor) {
		this.nameColor = nameColor;
	}

	public String getChatColor() {
		return chatColor;
	}

	public void setChatColor(String chatColor) {
		this.chatColor = chatColor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPrefixTooltip() {
		return prefixTooltip;
	}

	public void setPrefixTooltip(List<String> preTooltip) {
		this.prefixTooltip = preTooltip;
	}

	public List<String> getSuffixTooltip() {
		return suffixTooltip;
	}

	public void setSuffixTooltip(List<String> suffixTooltip) {
		this.suffixTooltip = suffixTooltip;
	}

	public boolean showNameTooltip() {
		return showNameTooltip;
	}

	public void setShowNameTooltip(boolean showNameTooltip) {
		this.showNameTooltip = showNameTooltip;
	}

	public boolean showPreTooltip() {
		return showPreTooltip;
	}

	public void setShowPreTooltip(boolean showPreTooltip) {
		this.showPreTooltip = showPreTooltip;
	}

	public boolean showSuffixTooltip() {
		return showSuffixTooltip;
	}

	public void setShowSuffixTooltip(boolean showSuffixTooltip) {
		this.showSuffixTooltip = showSuffixTooltip;
	}

	public boolean usePreClick() {
		return usePreClick;
	}

	public void setUsePreClick(boolean usePreClick) {
		this.usePreClick = usePreClick;
	}

	public boolean useNameClick() {
		return useNameClick;
	}

	public void setUseNameClick(boolean useNameClick) {
		this.useNameClick = useNameClick;
	}

	public boolean useSuffixClick() {
		return useSuffixClick;
	}

	public void setUseSuffixClick(boolean useSuffixClick) {
		this.useSuffixClick = useSuffixClick;
	}

	public String getPreClickCmd() {
		return preClickCmd;
	}

	public void setPreClickCmd(String preClickCmd) {
		this.preClickCmd = preClickCmd;
	}

	public String getNameClickCmd() {
		return nameClickCmd;
	}

	public void setNameClickCmd(String nameClickCmd) {
		this.nameClickCmd = nameClickCmd;
	}

	public String getSuffixClickCmd() {
		return suffixClickCmd;
	}

	public void setSuffixClickCmd(String suffixClickCmd) {
		this.suffixClickCmd = suffixClickCmd;
	}

	public boolean showChannelTooltip() {
		return showChannelTooltip;
	}

	public void setShowChannelTooltip(boolean showChannelTooltip) {
		this.showChannelTooltip = showChannelTooltip;
	}

	public List<String> getChannelTooltip() {
		return channelTooltip;
	}

	public void setChannelTooltip(List<String> channelTooltip) {
		this.channelTooltip = channelTooltip;
	}

	public boolean useChannelClick() {
		return useChannelClick;
	}

	public void setUseChannelClick(boolean useChannelClick) {
		this.useChannelClick = useChannelClick;
	}

	public String getChannelClickCommand() {
		return channelClickCommand;
	}

	public void setChannelClickCommand(String channelClickCommand) {
		this.channelClickCommand = channelClickCommand;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	
}
