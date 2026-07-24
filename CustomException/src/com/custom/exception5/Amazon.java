package com.custom.exception5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Amazon {
	static Scanner sc = new Scanner(System.in);
	static String userChoice;
	static int standardLength;
	static int itemToken;
	private String[] electronicItems = { "Laptop", "Smartphone", "Headphones", "Smart Watch", "Tablet", "Camera",
			"Bluetooth Speaker" };

	private double[] itemPrices = { 65000.0, 45000.0, 2500.0, 12000.0, 32000.0, 28000.0, 3500.0 };

	private String[] clothesItems = { "T-Shirt", "Jeans", "Shirt", "Trouser", "Hoodie", "Jacket", "Kurta", "Saree",
			"Salwar Suit", "Shorts", "Track Pants", "Sweater", "Formal Pants", "Blouse" };

	private double[] clothesPrices = { 499.0, 1299.0, 899.0, 999.0, 1499.0, 1899.0, 799.0, 2499.0, 1499.0, 399.0, 699.0,
			1199.0, 1299.0, 450.0 };

	private String[] beautyItems = { "Face Wash", "Face Cream", "Moisturizer", "Sunscreen", "Shampoo", "Conditioner",
			"Hair Oil", "Body Lotion", "Lip Balm", "Face Serum", "Eye Cream", "Face Mask", "Makeup Remover" };

	private double[] beautyPrices = { 180.0, 250.0, 220.0, 350.0, 280.0, 320.0, 150.0, 190.0, 80.0, 450.0, 380.0, 120.0,
			200.0 };
    private String cartItem[];
	public void amazonUi() {
		System.out.println("Welcome To Amazon App");
		System.out.println("Electrorinc, Grocerry, Beauty Items Are Availabe Which Item You want");
		userChoice = sc.nextLine();
		userChoice = userChoice.toUpperCase();
		switch (userChoice) {
		case "ELECTRONIC ITEMS":
			System.out.println("Item Name" + " : " + "Price");
			itemToken = 1;
			for (int i = 0; i < electronicItems.length; i++) {
				System.out.println(electronicItems[i] + " :  "+"₹"+itemPrices[i]);
			}
			buyProducts();
			break;
			
		case "CLOTHES ITEMS":
			System.out.println("Item Name" + " : " + "Price");
			itemToken = 2;
			for (int i = 0; i < clothesItems.length; i++) {
				System.out.println(clothesItems[i] + " :  "+"₹"+clothesPrices[i]);
			}
			buyProducts();
			break;
			
		case "BEAUTY ITEMS":
			System.out.println("Item Name" + " : " + "Price");
			itemToken = 3;
			for (int i = 0; i < beautyItems.length; i++) {
				System.out.println(beautyItems[i] + " :  "+"₹"+beautyPrices[i]);
			}
			buyProducts();
			break;

		default:
			System.err.println("Item Out Of Stock");
			break;
		}
	}
	
	public void buyProducts(){
		System.out.println("You Want To Buy Something: Yes Or No");
		String buyChoice = sc.nextLine();
		if(buyChoice.toLowerCase().equals("yes")) {
			addToCart();
		}
		else {
			System.out.println("Thanks For Visit Our Website");
		}
	}
	
	
	public void addToCart(){
		double totalAmount=0.0d;
		System.out.println("How Much Item You Want To Add");
		int totalCartItem = sc.nextInt();
		cartItem = new String[totalCartItem];
		System.out.println("Please Add Items Into Cart:");
		sc.nextLine();
		for(int i=0; i<cartItem.length;i++) {
			cartItem[i] = sc.nextLine();
		}
		if(itemToken==1) {
			for(int i=0; i<cartItem.length; i++){
				for(int j=0; j<electronicItems.length; j++){
					if(cartItem[i].equals(electronicItems[j])){
						totalAmount = totalAmount+itemPrices[j];
					}
				}
			}
		}
		else if(itemToken==2) {
			for(int i=0; i<cartItem.length; i++){
				for(int j=0; j<clothesItems.length; j++){
					if(cartItem[i].equals(clothesItems[j])){
						totalAmount = totalAmount+clothesPrices[j];
					}
				}
			}
		}
		else if(itemToken==3) {
			for(int i=0; i<cartItem.length; i++){
				for(int j=0; j<beautyItems.length; j++){
					if(cartItem[i].equals(beautyItems[j])){
						totalAmount = totalAmount+beautyPrices[j];
					}
				}
			}
		}
		
		System.out.println("Total Billing Amount: "+totalAmount);
		System.out.println("Confirm Order: Yes Or No");
		String confirmOrder = sc.nextLine();
		if(confirmOrder.toLowerCase().equals("yes")){
			doPayment();
		}
		else {
			System.out.println("Order In Cart Remains");
		}
	}
	
	private boolean doPayment() {
		System.out.println("Connect To Payment Gateway....");
		System.out.println("Payment Done");
	  return true;
	}
}
