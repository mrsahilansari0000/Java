package com.array.list.exp8;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<String> products = new ArrayList<String>();
		products.add("Washing Machine");
		products.add("Laptop");
		products.add("Hard Drive");
		products.add("Mouse");
		products.add("HDMI Cable");
		products.add("USB Cable");
        
		// When we add or remove element from the collection during the iteration then collection will fail 
		// and we get ConcurrentModificationException this is called Fail Fast
		
		// ( modcount == expectedModCount ) No ConcurrentModificationException
		// ( modcount! == expectedModCount ) ConcurrentModificationException Occurs
	
		for (String product : products) {
			products.add("Pendrive");
		}
	}
}
