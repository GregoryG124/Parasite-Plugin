package com.parasiteplugin.Inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

import com.parasiteplugin.Functions.ClassGuiFunctions;

public class GameclassSetName {
    

    public Inventory classNameInv;
    

    // code related to name class gui
    public void ClassNameGui(){

        // creates new classnamegui inventory
        classNameInv = Bukkit.createInventory(null, InventoryType.ANVIL, "Set Class Name");

        // puts items in to inventory
        ClassNameInitializeInventory();
    }

    public void ClassNameInitializeInventory(){
        classNameInv.setItem(0, ClassGuiFunctions.createItems(Material.GREEN_STAINED_GLASS_PANE, "Type Name Here", "Click to confirm class name"));
    }

    public void ClassNameOpenInventory(final Player caller){
        caller.openInventory(classNameInv);
    }
    
}
