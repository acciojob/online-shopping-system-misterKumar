package com.driver;

public abstract class Product {
	private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        // your code goes here
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
    	// your code goes here
        return productId;
    }

    public String getProductName() {
    	// your code goes here
        return productName;
    }

    public double getPrice() {
    	// your code goes here
        return price;
    }

    public abstract void displayDetails();
}
