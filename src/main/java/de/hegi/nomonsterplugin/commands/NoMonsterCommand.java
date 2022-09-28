package de.hegi.nomonsterplugin.commands;

import de.hegi.nomonsterplugin.Main;
import de.hegi.nomonsterplugin.config.Config;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Locale;

public class NoMonsterCommand implements CommandExecutor {
  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (!(sender instanceof Player)) {
      sender.sendMessage(ChatColor.RED + "You can only execute this command as a Player!");
      return true;
    }
    Config config = Main.getInstance().getPluginConfig();
    Player player = (Player) sender;
    String world_name = player.getWorld().getName();

    if (args.length == 0) {
      sender.sendMessage(ChatColor.RED + "No parameter entered. Example: /nomonster true  Usage: /nomonster <true|false>");
      return true;
    }

    switch (args[0].toLowerCase()) {
      case "false":
        config.getConfig().set(world_name + ".stopMonsterSpawning", false);
        config.save();
        sender.sendMessage(ChatColor.GREEN + "Successfully set NoMonsterSpawning to false.");
        break;
      case "true":
        config.getConfig().set(world_name + ".stopMonsterSpawning", true);
        config.save();
        sender.sendMessage(ChatColor.GREEN + "Successfully set NoMonsterSpawning to true.");
        break;
      default:
        sender.sendMessage(ChatColor.RED + "Only allowed parameters are: <true|false>");
    }

    return false;
  }
}
