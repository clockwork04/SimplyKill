package nya.clockwork04.SimplyKill;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public void onEnable() {
		Bukkit.getServer().getLogger().info("SimplyKill By Snoopie Enabled!");
	}	
	
	public void onDisable() {
		Bukkit.getServer().getLogger().info("Medic disabled!");
	}	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] args) {
		
		if (!(sender instanceof Player)) {
			sender.sendMessage("You Cant Kill Console");
			return true;
		}
		
		Player player = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("kill")) {
			if (args.length == 0) {
				player.setHealth(0);
				player.sendMessage(ChatColor.RED + "You Killed Yourself!");
				Bukkit.getServer().getLogger().info(player.getName() + " Committed Seppukku!");
				return true;
			}
		}
	return true;
	}
}
