package com.fail.safe.exp1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver {
	public static void main(String[] args) {
		List<String> products = new CopyOnWriteArrayList<String>();
		products.add("Washing Machine");
		products.add("Laptop");
		products.add("Hard Drive");
		products.add("Mouse");
		products.add("HDMI Cable");
		products.add("USB Cable");
		
		for(String element : products) {
			if(element.equals("Hard Drive")) {
				products.remove(element);
				break;
			}
			
		}
		System.out.println(products);
	}
}
