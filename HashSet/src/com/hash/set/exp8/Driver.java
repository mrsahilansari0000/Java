package com.hash.set.exp8;

import java.util.HashSet;

class Flipkart{
	String itemName;

	public Flipkart(String itemName) {
		super();
		this.itemName = itemName;
	}
	
	@Override
	public boolean equals(Object obj) {
		Flipkart kart = (Flipkart) obj;
		return this.itemName.equals(kart.itemName);
	}
	
	@Override
	public int hashCode() {
		return this.itemName.hashCode();
	}
	
}

public class Driver {
      public static void main(String[] args) {
		HashSet<String> item = new HashSet<String>();
		item.add("Laptop");
		item.add("Tablet");
		item.add("Laptop");
		System.out.println(item.size());
		
		HashSet<Flipkart> items = new HashSet<Flipkart>();
		Flipkart item1 = new Flipkart("Samsung LED");
		Flipkart item2 = new Flipkart("Washing Machine");
		Flipkart item3 = new Flipkart("Apple I Pad");
		Flipkart item4 = new Flipkart("Washing Machine");
		
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
        System.out.println(items.size());
		
		
		
	}
}
