package com.parasiteplugin.Main;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import com.parasiteplugin.Commands.ClassGuiCommands;
import com.parasiteplugin.Listeners.InventoryClickListener;

/*
 * parasite java plugin
 */
public class Plugin extends JavaPlugin
{
  private static final Logger LOGGER=Logger.getLogger("parasite");



  public void onEnable()
  {
    LOGGER.info("parasite enabled");

    // register commands
    this.getCommand("parasite").setExecutor(new ClassGuiCommands());


    // register listeners
    getServer().getPluginManager().registerEvents(new InventoryClickListener(), this);


  }

  public void onDisable()
  {
    LOGGER.info("parasite disabled");
  }
}
