package de.hegi.nomonsterplugin.config;
import de.hegi.nomonsterplugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration
import org.bukkit.configuration.file.YamlConfiguration
import org.bukkit.plugin.Plugin;

import java.io.File


class Config(private val name: String) {

    private File configFile;
    private FileConfiguration config;
    private Plugin plugin = Bukkit.getPluginManager().getPlugin('NoMonsterPlugin');
    init {
        load(false)
    }

    private fun load(reset: Boolean) {
        configFile = File(plugin.dataFolder, "$name.yml")
        if (!configFile.exists() || reset) {
            configFile.parentFile.mkdirs()
            plugin.saveResource("$name.yml", true)
            configFile.createNewFile()
        }
        config = YamlConfiguration()
        try {
            config.load(configFile)
        } catch (e: Exception) {
            e.printStackTrace()
            consoleMessage("$prefix §c$name.yml Config failed to load! ^^ Reason above ^^")
            consoleMessage("$prefix §cCopy and Save your §nlatest.log§f §cto get Support!")
        }
    }

    fun getConfig(): FileConfiguration {
        return config
    }

    fun save() {
        config.save(configFile)
    }

    fun reset() {
        configFile.delete()
        configFile.deleteOnExit()
        load(true)
    }

    fun reload(): FileConfiguration {
        load(false)
        return config
    }
}