package com.delivery;

public class Delivery {
	
	String customerName;
	String itemName;
	String deliveryDate;
	String status;
	
	public Delivery() {
		System.out.println("Customer Name Default Value "+customerName);
		System.out.println("Item Name Default Value "+itemName);
		System.out.println("Delivery Date Default Value "+deliveryDate);
		System.out.println("Status Default Value "+status);
		
	}
	
	public Delivery(String _customerName, String _itemName, String _deliveryDate, String _status) {
		this.customerName = _customerName;
		this.itemName = _itemName;
		this.deliveryDate = _deliveryDate;
		this.status = _status;
		System.out.println("Customer Name: "+customerName);
		System.out.println("Item Name: "+itemName);
		System.out.println("Delivery Date: "+deliveryDate);
		System.out.println("Status: "+status);
		
	}
	
  public static void main(String[] args) {
	  Delivery def = new Delivery();
	  Delivery rahul = new Delivery("Rahul Kumar", "Washing Machine", "5-April-2026", "Dispatched");
	  Delivery lalit = new Delivery("Lalit Sony", "Redmi Note 7", "1-April-2026", "Out Of Delivery");
	  Delivery sonu = new Delivery("Sonu Yadav", "Suit Case", "7-April-2026", "Pending");
  }
}
