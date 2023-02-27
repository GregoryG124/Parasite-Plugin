package com.parasiteplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.parasiteplugin.Functions.ClassGuiFunctions;

public class ClassGuiCommands implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if (sender instanceof Player){
            Player player = (Player) sender;
            
            // run if full command is /parasite class menu
            if (args[0].equalsIgnoreCase("class") && args[1].equalsIgnoreCase("menu")){
                
                // creates and opens the menu for the player
                ClassGuiFunctions.openClassMenu(player);
            }


        }
        else{
            System.out.println("Command can only be executed by a player");
        }


        return true;
    }


}