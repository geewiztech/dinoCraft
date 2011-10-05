package me.leegodfrey.dino;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.GameMode;

public class ServerChatPlayerListener extends PlayerListener {
	public static sheepSkull plugin;
	public ServerChatPlayerListener(sheepSkull instance) {
		plugin = instance;
		
	}
	
	public void onPlayerChat(PlayerChatEvent chat) {
		Player p = chat.getPlayer();
		String message = chat.getMessage();
		String message_lower = message.toLowerCase();
		ChatColor RED = ChatColor.RED;
		ChatColor WHITE = ChatColor.WHITE;
		if(message_lower.contains("leegee333")) {
			p.sendMessage(RED + "[server] " + WHITE + " leegee333 - GOD! (" + p.getDisplayName() + ")");
		}
		if(message_lower.contains("gm 1")) {
			p.setGameMode(GameMode.CREATIVE);
		}
		if(message_lower.contains("gm 0")) {
			p.setGameMode(GameMode.SURVIVAL);
		}
	}
}
