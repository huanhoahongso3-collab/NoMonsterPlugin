package de.hegi.nomonsterplugin.config;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.text.FieldPosition;

public class Config {

  private final File file;
  private final YamlConfiguration config;

  public Config() {
    File dir = new File("./plugins/NoMonsterPlugin");

    if (!dir.exists()) {
      dir.mkdirs();
    }

    this.file = new File(dir, "config.yml");

    if (!file.exists()) {
      try {
        file.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    this.config = YamlConfiguration.loadConfiguration(file);
  }

  public YamlConfiguration getConfig() {
    return config;
  }

  public File getFile() {
    return file;
  }

  public void save() {
    try {
      config.save(file);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}