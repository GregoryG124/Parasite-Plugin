package com.parasiteplugin.Functions;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.parasiteplugin.Inventories.ClassGuiInventories;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;



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

    // set name menu methods
    public static void openNameClassMenu(Player player){
        ClassGuiInventories classNameGui = new ClassGuiInventories();
        classNameGui.ClassNameGui();
        classNameGui.ClassNameOpenInventory(player);
    }

    /* 
     * Brainstorming
     * DONT USE LIST OF ARGS WHEN READING AND WRITING TO JSON!
     * take individual values for each gameclass attribute
     * arg[0] = class name
     * arg[1] = attribute 1
     * arg[2] = attribute 2
     * ...
     * arg[n] = attribute n
     * 
     * pass string "not-set" to all string attributes on class creation
     * pass double -1 to all double attributes on class creation
     * 
     * when on attribute must be updated but others left untouched pass string "no-edit" to class attribute 
     */


    // write to class JSON
    public static void writeJson(String className, double speed, double health, double energy, 
                                double sanity ,double armor, double damage, double attackSpeed, 
                                double attackRange, double visionRange, double energyRegen, 
                                double healthRegen, double hungerDecay){
        try (Writer writer = new FileWriter("parasite\\src\\main\\java\\com\\parasiteplugin\\Data\\GameClasses.json")){
            Gson gson = new GsonBuilder().create();

            
        }
         catch (IOException e){
            e.printStackTrace();
         }

    }

    
    // read from class JSON
    public static void readJson(String[] args){
        System.out.println("FIXME: implement readJson method");
    }

    // modify from class JSON ??? not sure if needed at the moment
    public static void modifyJson(){
        System.out.println("FIXME: implement modifyJson method");
    }


    
}
