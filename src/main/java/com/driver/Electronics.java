package com.driver;

public class Electronics extends Product {
	 private String brand;
	    public Electronics(int productId, String productName, double price, String brand) {
			super(productId, productName, price);
			// your code goes here
			this.brand=brand;
		}

		public String getBrand() {
			// your code goes here
			return brand;
		}

		public void displayDetails() {
			// your code goes here
			System.out.println(getProductId() + "\t" + getProductName() + "\t$" + getPrice() + "\tBrand: " + brand);
		}
}
