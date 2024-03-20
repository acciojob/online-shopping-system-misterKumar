package com.driver;

public class Clothing extends Product {
	private String size;

    public Clothing(int productId, String productName, double price, String size) {
        super(productId, productName, price);
        // your code goes here
        this.size = size;
    }

    public String getSize() {
    	// your code goes here
        return size;
    }

    public void displayDetails() {
        // your code goes here
        System.out.println(getProductId() + "\t" + getProductName() + "\t$" + getPrice() + "\tSize: " + size);
    }
}
