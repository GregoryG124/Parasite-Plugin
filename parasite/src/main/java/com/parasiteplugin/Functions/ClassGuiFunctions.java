package com.parasiteplugin.Functions;

import org.bukkit.entity.Player;

import com.parasiteplugin.Inventories.ClassGuiInventories;

public class ClassGuiFunctions {
    
    
    public static void openClassMenu(Player player){
        // create new instance of ClassGuiInventories for use in this method
        ClassGuiInventories classGui = new ClassGuiInventories();
        // initialize the inventory
        classGui.ClassOptionsGui();
        // open the class inventory for player who called this command
        classGui.ClassOptionsOpenInventory(player);
    }

    public static void openAddClassMenu(Player player){
        // create new instance of ClassGuiInventories for use in this method
        ClassGuiInventories classAddGui = new ClassGuiInventories();
        // initialize the inventory
        classAddGui.ClassAddGui();
        // open the class add inventory for the player who called this command
        classAddGui.ClassAddOpenInventory(player);
    }
    
}
