package net.loadingchunks.plugins.RoadRunner;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class RoadRunner extends JavaPlugin
{
	public void onEnable()
	{
		PluginDescriptionFile pdfFile = getDescription();
		getLogger().info("Loading " + pdfFile.getName() + " version " + pdfFile.getVersion() + "...");
	}

	public void onDisable() {
		getLogger().info("Stopping...");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (cmd.getName().equalsIgnoreCase("rranvil")) {
			if ((sender instanceof Player)) {
				((Player)sender).getLocation().getBlock().setType(Material.ANVIL);
			}
			else {
				sender.sendMessage("This command can only be run by a player.");
			}
			return true;
		}
		return false;
	}
}