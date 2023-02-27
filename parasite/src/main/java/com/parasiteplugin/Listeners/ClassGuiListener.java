package com.parasiteplugin.Listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.parasiteplugin.Functions.ClassGuiFunctions;

public class ClassGuiListener implements Listener {

    @EventHandler
    public void openInventoryClick(final InventoryClickEvent event){
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
    }
    
}