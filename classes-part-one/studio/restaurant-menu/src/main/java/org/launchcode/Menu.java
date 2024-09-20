package org.launchcode;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public Menu() {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = new Date();  // Initializes to the current date
    }
    public void addMenuItem(MenuItem item) {
        if (menuItems.contains(item)) {
            System.out.println("Duplicate item! '" + item.getDescription() + "' is already on the menu.");
        } else {
            menuItems.add(item);
            updateLastUpdated();
        }
    }

    public void removeMenuItem(MenuItem item){
       if (menuItems.remove(item)){
           updateLastUpdated();
       }else {
           System.out.println("Item not found: " + item.getDescription());
       }
    }

    private void updateLastUpdated(){
        this.lastUpdated = new Date();
    }

    public void displayMenu() {
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
        System.out.println("Last updated: " + lastUpdated);
    }
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}