package de.hegi.nomonsterplugin.commands;

import de.hegi.nomonsterplugin.Main;
import de.hegi.nomonsterplugin.config.Config;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class NoMonsterCommand implements CommandExecutor {
  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    Config config = Main.getInstance().getPluginConfig();
    if (args.length == 1 && (args[0].equals("enable") || args[0].equals("disable"))) {
      for (String world: this.getWorldNameList()) {
        if (args[0].equals("enable")) {
          config.getConfig().set(world + ".stopMonsterSpawning", true);
        } else {
          config.getConfig().set(world + ".stopMonsterSpawning", true);
        }
      }
      config.save();
      sender.sendMessage(ChatColor.GREEN + "Successfully " + args[0] + " the NoMonsterPlugin for every World");

      return true;
    }

    if (args.length <= 1) {
      sender.sendMessage(ChatColor.RED + "Not enough parameters entered.");
      sender.sendMessage(ChatColor.GRAY + "Usage: /nomonster <world> <enable|disable>");

      return true;
    }
    World world = Bukkit.getWorld(args[0]);

    if (world == null) {
      sender.sendMessage(ChatColor.RED + "This World doesn't exist!");
      sender.sendMessage(ChatColor.GRAY + "Usage: /nomonster <world> <enable|disable>");

      return true;
    }

    switch (args[1].toLowerCase()) {
      case "disable":
        config.getConfig().set(world.getName() + ".stopMonsterSpawning", false);
        config.save();
        sender.sendMessage(ChatColor.GREEN + "Successfully disable the NoMonsterPlugin for the World: " + ChatColor.AQUA + world.getName());

        return true;
      case "enable":
        config.getConfig().set(world.getName() + ".stopMonsterSpawning", true);
        config.save();
        sender.sendMessage(ChatColor.GREEN + "Successfully enable the NoMonsterPlugin for the World: " + ChatColor.AQUA + world.getName());

        return true;
    }

    sender.sendMessage(ChatColor.RED + "Second Parameter only allows: <enable|disable>");
    sender.sendMessage(ChatColor.GRAY + "Usage: /nomonster <world> <enable|disable>");

    return true;
  }

  private List<String> getWorldNameList() {
    List<World> worlds = Bukkit.getWorlds();
    List<String> world_names = new ArrayList<>();

    for (World world: worlds) {
      world_names.add(world.getName());
    }

    return world_names;
  }
}
