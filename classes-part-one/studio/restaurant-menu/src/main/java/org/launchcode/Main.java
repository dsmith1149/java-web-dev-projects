package org.launchcode;


public class Main {

    public static void main(String[] args) {
        MenuItem pizza = new MenuItem(12.99, "Delicious cheese pizza", "Main Course", true);
        MenuItem salad = new MenuItem(8.99, "Fresh garden salad", "Appetizer", false);
        MenuItem cake = new MenuItem(6.50, "Chocolate lava cake", "Dessert", true);
        MenuItem pizza2 = new MenuItem(12.99, "Delicious cheese pizza", "Main Course", true);


        Menu menu = new Menu();


        menu.addMenuItem(pizza);
        menu.addMenuItem(salad);
        menu.addMenuItem(cake);


        System.out.println("Menu after adding items:");
        menu.displayMenu();

        System.out.println("\nTrying to add a duplicate item:");
        menu.addMenuItem(pizza2);

        menu.removeMenuItem(salad);


        System.out.println("\nMenu after removing salad:");
        menu.displayMenu();
    }
}


