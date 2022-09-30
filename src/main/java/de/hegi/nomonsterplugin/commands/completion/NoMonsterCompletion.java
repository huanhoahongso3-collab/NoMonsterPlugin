package de.hegi.nomonsterplugin.commands.completion;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class NoMonsterCompletion implements TabCompleter {
  @Override
  public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {

    if (args.length == 1) {
      List<String> world_names = new ArrayList<>();
      List<World> worlds = Bukkit.getWorlds();

      for (World world: worlds) {
        world_names.add(world.getName());
      }

      return world_names;
    }

    if (args.length == 2) {
      List<String> bools = new ArrayList<>();
      bools.add("enable");
      bools.add("disable");

      return bools;
    }

    return new ArrayList<>();
  }
}
