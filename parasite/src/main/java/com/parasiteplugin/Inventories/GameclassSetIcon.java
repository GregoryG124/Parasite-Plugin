package com.parasiteplugin.Inventories;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.parasiteplugin.Functions.ClassGuiFunctions;

public class GameclassSetIcon {

    public Inventory classSetIconInv;


    // code relating to the class set icon gui
    public void ClassAddGui(){
        
        // create new set icon inventory
        classSetIconInv = Bukkit.createInventory(null, 9, "Add Class");
        
        // puts items into inventory
        ClassAddInitializeInventory();
    }

    public void ClassAddInitializeInventory(){
        // fill inventory slots 2-7 with blank items
        for (int i = 1; i<8; i++){
            classSetIconInv.setItem(i, ClassGuiFunctions.createItems(Material.GRAY_STAINED_GLASS_PANE, "Insert class icon into slot 1", "Only slot 1 is empty"));
        }
        classSetIconInv.setItem(8, ClassGuiFunctions.createItems(Material.RED_STAINED_GLASS_PANE, ChatColor.DARK_RED + "Accept (BLOCKED)", "You must insert an item into slot 1"));
    }

    public void ClassAddOpenInventory(final Player caller){
        caller.openInventory(classSetIconInv);       
    }
    
}
