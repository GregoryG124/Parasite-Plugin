package com.parasiteplugin.Listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import com.parasiteplugin.Functions.ClassGuiFunctions;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void openInventoryClick(final InventoryClickEvent event){

        // cases for when in main class inventory
        if (event.getView().getTitle().equalsIgnoreCase("Classes")){
            
            // cancels the click event when in Classes inventory
            event.setCancelled(true);
            
            // click air event
            if (event.getCurrentItem() == null || event.getCurrentItem().getType().equals(Material.AIR) || event.getRawSlot() >= event.getInventory().getSize()){
                return;
            }
            // click "add class" event
            else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("add class")){
                Player player = (Player) event.getWhoClicked();
                ClassGuiFunctions.openAddClassMenu(player);
            }
            // click "remove class" event
            else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("remove class")){
                System.out.println("FIXME: implement functionality for Remove Class event handler");
            }
            // click "next page" event
            else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("next page")){
                System.out.println("FIXME: implement functionality for Next Page event handler");
            }
            // click "previous page" event
            else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("previous page")){
                System.out.println("FIXME: implement functionality for Previous Page event handler");
            }
            else {
                return;
            }
        }
        // cases for when in add class inventory
        else if (event.getView().getTitle().equalsIgnoreCase("Add Class")){
            System.out.println("Add Class Click");
            System.out.println(event.getRawSlot());

            // set unblocked conditions
            if (event.getSlot() == 0 && event.getCursor().getType() != Material.AIR){
                event.getView().setItem(8, null);
                event.getView().setItem(ClassGuiFunctions.ToggleUnblocked.getSlot(), ClassGuiFunctions.ToggleUnblocked.getItemStack());
            }            
            
            if (event.getSlot() == 0 && event.getCursor().getType() == Material.AIR){
                event.getView().setItem(8, null);
                event.getView().setItem(ClassGuiFunctions.ToggleBlocked.getSlot(), ClassGuiFunctions.ToggleBlocked.getItemStack());
            }



        }  
    }
}