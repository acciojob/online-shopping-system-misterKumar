package com.driver;

public class Book extends Product{
	private String author;

    public Book(int productId, String productName, double price, String author) {
        super(productId, productName, price);
        // your code goes here
        this.author=author;
    }

    public String getAuthor() {
    	// your code goes here
        return author;
    }

    public void displayDetails() {
        // your code goes here
        System.out.println(getProductId() + "\t" + getProductName() + "\t$" + getPrice() + "\tAuthor: " + author);
    }
}
