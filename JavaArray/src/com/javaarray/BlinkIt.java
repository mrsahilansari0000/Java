package com.javaarray;

import java.util.Scanner;

class GrosseryItem{
	int orderQuantity;
	String orderdItem[];
	String payMethod;
	int totalAmount = 0;
	int discount;
	int finalAmount;
	Scanner sc = new Scanner(System.in);
	String[] vegetables = {
            "Carrot", "Tomato", "Potato", "Onion", 
            "Broccoli", "Spinach", "Cabbage", "Cauliflower",
            "Cucumber", "Bell Pepper", "Eggplant", "Peas",
            "Beans", "Lettuce", "Radish", "Beetroot"
        };
	
	int[] vegetablesPrice = {25, 40, 30, 35, 25, 42, 42, 33, 22, 54, 32, 60, 70, 58, 24, 37};
	
	String paymentOption[] = {
            "UPI",
            "Cash",
            "Credit Card",
            "Debit Card",
            "Net Banking",
            "Wallet"
        };
	
	void selectCart() {
		System.out.println("How Much Order You Want To Place ");
		orderQuantity = sc.nextInt();
		System.out.println("Grossy Item Available Right Now ");
		for(int i=0; i<vegetables.length; i++) {
			System.out.println(vegetables[i]+" "+vegetablesPrice[i]+"/kg");
		}
		
		System.out.println();
		System.out.println("Please Place Your Order ");
		orderdItem = new String[orderQuantity];
		
		for(int i=0; i<orderQuantity; i++) {
			orderdItem[i] = sc.next();
		}
		
	}
	
	void totalBill() {
		System.out.println("Order Item");
		for(int i=0; i<orderQuantity; i++) {
			for(int j=0; j<vegetables.length; j++) {
				if(orderdItem[i].equalsIgnoreCase(vegetables[j])) {
					System.out.println(orderdItem[i]+" "+vegetablesPrice[j]+"/kg");
				}
			}
		}
		
		for(int i=0; i<orderQuantity; i++) {
			for(int j=0; j<vegetables.length; j++) {
				if(orderdItem[i].equalsIgnoreCase(vegetables[j])) {
					totalAmount = totalAmount+ vegetablesPrice[j];
				}
			}
		}
		System.out.println("Total Billing Amount "+totalAmount+"₹");
		
	}
	
	void paymentMethod() {
		System.out.print("Choose Payment Option: ");
		for(int i=0; i<paymentOption.length; i++) {
			System.out.print(paymentOption[i]+",");
		}
		System.out.println();
		payMethod = sc.next();
		
		if(payMethod.equalsIgnoreCase("UPI")) {
			 discount = (totalAmount*5)/100;
			 finalAmount = totalAmount - discount;
			 System.out.println("Yout Got "+discount+" Discount On "+ totalAmount);
			 System.out.println("Please Pay "+finalAmount);
		}
		
	}
	
}


public class BlinkIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrosseryItem grossery = new GrosseryItem();
		grossery.selectCart();
		grossery.totalBill();
		grossery.paymentMethod();

	}

}
