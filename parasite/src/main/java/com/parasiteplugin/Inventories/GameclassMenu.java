package com.parasiteplugin.Inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.parasiteplugin.Functions.ClassGuiFunctions;

public class GameclassMenu {

    public Inventory classMenuInv;

    // Code relating to the ClassOptions gui
    public void ClassOptionsGui() {
    
        // create new options gui inventory
        classMenuInv = Bukkit.createInventory(null, 54, "Classes");

        // put items into inventory
        ClassOptionsInitializeInventory();

    }

    public void ClassOptionsInitializeInventory(){
        // "add class" for class options inventory
        classMenuInv.setItem(45, ClassGuiFunctions.createItems(Material.GREEN_STAINED_GLASS_PANE, "Add Class", "Click on this item to create a new class"));
        // "remove class" for class options inventory
        classMenuInv.setItem(53, ClassGuiFunctions.createItems(Material.RED_STAINED_GLASS_PANE, "Remove Class", "Click this to remove a class"));
        // "previous page" for class options inventory
        classMenuInv.setItem(48, ClassGuiFunctions.createItems(Material.YELLOW_STAINED_GLASS_PANE, "Previous Page", "Click to go to the previous page"));
        // "next page" for class options inventory
        classMenuInv.setItem(50, ClassGuiFunctions.createItems(Material.YELLOW_STAINED_GLASS_PANE, "Next Page", "Click to go to the previous page"));

    }

    public void ClassOptionsOpenInventory(final Player caller){
        // opens the inventory for the player who called the inventory
        caller.openInventory(classMenuInv);
    }
        
}
