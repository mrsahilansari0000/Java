package com.ecommerce.delivery;

import java.util.Scanner;

class Flipkart extends Ecommerce{
	static Scanner sc = new Scanner(System.in);
	int totalItem;
	int totalAmount = 0;
	String items[];
    String itemName[] = {"Washing Machine", "Head Phone", "Mobile Cover", "Laptop" };
    int itemPrice[] = {55000, 1800, 650, 85000};
    
    public void showItem() {
    	System.out.println("Available Items");
		for(int i=0; i<itemName.length; i++) {
			System.out.println(itemName[i]);
		}
		
		System.out.println("How Much Item You Want To Add");
		totalItem = sc.nextInt();
		sc.nextLine();
		items = new String[totalItem];
    }
    
	@Override
	public void addCart() {
		System.out.println("Please Add Items");
		for(int i=0; i<totalItem; i++) {
			items[i] = sc.nextLine();
		}
		
		for(int i=0; i<totalItem; i++) {
			for(int j=0; j<itemName.length; j++) {
				if(items[i].equalsIgnoreCase(itemName[j])) {
					totalAmount = totalAmount+itemPrice[j];
				}
			}
		}
		
		System.out.println("Total Amount "+totalAmount);
		
	}

	@Override
	public void placeOrder() {
		System.out.println("Flipkart.placeOrder()");
		
	}

	@Override
	public void addNewAdress() {
		System.out.println("Flipkart.addNewAdress()");
		
	}

	@Override
	public void applyCoupon() {
		System.out.println("Flipkart.applyCoupon()");
		
	}
	
}
public class FlipkartUser {
public static void main(String[] args) {
	Flipkart user1 = new Flipkart();
	user1.showItem();
	user1.addCart();
}
}
