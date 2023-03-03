package com.parasiteplugin.Functions;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.parasiteplugin.Inventories.ClassGuiInventories;


public class ClassGuiFunctions {
    
    // Class menu methods
    public static void openClassMenu(Player player){
        // create new instance of ClassGuiInventories for use in this method
        ClassGuiInventories classGui = new ClassGuiInventories();
        // initialize the inventory
        classGui.ClassOptionsGui();
        // open the class inventory for player who called this command
        classGui.ClassOptionsOpenInventory(player);
    }

    // Add class menu methods
    public static void openAddClassMenu(Player player){
        // create new instance of ClassGuiInventories for use in this method
        ClassGuiInventories classAddGui = new ClassGuiInventories();
        // initialize the inventory
        classAddGui.ClassAddGui();
        // open the class add inventory for the player who called this command
        classAddGui.ClassAddOpenInventory(player);
    }
    
    // toggle the last slot to blocked
    public final static class ToggleBlocked{
        // class variables
        private final static int slot = 8;
        private final static ItemStack item = ClassGuiInventories.createItems(Material.RED_STAINED_GLASS_PANE, ChatColor.DARK_RED + "Accept (BLOCKED)", "You must insert an item into slot 1");
        
        // getter methods
        public static int getSlot(){
            return slot;
        }

        public static ItemStack getItemStack(){
            return item;
        }

    }

    // toggle the last slot to unblocked
    public final static class ToggleUnblocked{
        //class variables
        private final static int slot = 8;
        private final static ItemStack item = ClassGuiInventories.createItems(Material.GREEN_STAINED_GLASS_PANE, ChatColor.GREEN + "Accept", "Click to confirm item for class icon");
        
        // getter methods
        public static int getSlot(){
            return slot;
        }

        public static ItemStack getItemStack(){
            return item;
        }
    }
    
}
