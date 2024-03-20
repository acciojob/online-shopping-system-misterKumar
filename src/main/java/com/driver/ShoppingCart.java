package com.driver;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Product> cartItems;

    public ShoppingCart() {
        // your code goes here
        cartItems=new ArrayList<>();
    }

    public void addProduct(Product product) {
       // your code goes here
        cartItems.add(product);
    }

    public double getTotalCost() {
        double totalCost = 0;
        // your code goes here
        for (Product product : cartItems) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }

    public void displayCart() {
        // your code goes here
        System.out.println("Shopping Cart:");
        System.out.println("Product ID\tProduct Name\tPrice\tDetails");
        for (Product product : cartItems) {
            product.displayDetails();
        }
    }
    
    // Getter method for direct access to cartItems
    public ArrayList<Product> getCartItems() {
    	// your code goes here
        return cartItems;
    }
}
