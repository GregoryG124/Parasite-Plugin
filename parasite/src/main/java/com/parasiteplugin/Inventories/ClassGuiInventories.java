package com.parasiteplugin.Inventories;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ClassGuiInventories{

    public Inventory classOptionsInv;
    public Inventory classAddInv;


    // Code relating to the ClassOptions gui
    public void ClassOptionsGui() {
        
        // create new options gui inventory
        classOptionsInv = Bukkit.createInventory(null, 54, "Classes");

        // put items into inventory
        ClassOptionsInitializeInventory();

    }

    public void ClassOptionsInitializeInventory(){
        // "add class" for class options inventory
        classOptionsInv.setItem(45, createItems(Material.GREEN_STAINED_GLASS_PANE, "Add Class", "Click on this item to create a new class"));
        // "remove class" for class options inventory
        classOptionsInv.setItem(53, createItems(Material.RED_STAINED_GLASS_PANE, "Remove Class", "Click this to remove a class"));
        // "previous page" for class options inventory
        classOptionsInv.setItem(48, createItems(Material.YELLOW_STAINED_GLASS_PANE, "Previous Page", "Click to go to the previous page"));
        // "next page" for class options inventory
        classOptionsInv.setItem(50, createItems(Material.YELLOW_STAINED_GLASS_PANE, "Next Page", "Click to go to the previous page"));

    }

    public void ClassOptionsOpenInventory(final Player caller){
        // opens the inventory for the player who called the inventory
        caller.openInventory(classOptionsInv);
    }


    // code relating to the class add gui
    public void ClassAddGui(){
        
        // create new add gui inventory
        classAddInv = Bukkit.createInventory(null, 9, "Add Class");
        
        // puts items into inventory
        ClassAddInitializeInventory();
    }

    public void ClassAddInitializeInventory(){
        // fill inventory slots 2-7 with blank items
        for (int i = 1; i<8; i++){
            classAddInv.setItem(i, createItems(Material.GRAY_STAINED_GLASS_PANE, "Insert class icon into slot 1", "Only slot 1 is empty"));
        }
        classAddInv.setItem(8, createItems(Material.RED_STAINED_GLASS_PANE, ChatColor.DARK_RED + "Accept (BLOCKED)", "You must insert an item into slot 1"));
    }

    public void ClassAddOpenInventory(final Player caller){
        caller.openInventory(classAddInv);       
    }







    // method for quickly creating items to add to inventories
    // NOTE_1: not sure it's needed yet, but could also pass an int to method allowing for material stack size to be changed
    protected ItemStack createItems(final Material material, final String name, final String lore){
        
        final ItemStack item = new ItemStack(material, 1);
        final ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(name);

        meta.setLore(Arrays.asList(lore));

        item.setItemMeta(meta);

        return item;
    }
}