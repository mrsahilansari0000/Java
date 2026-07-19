package com.array.list.exp9;

import java.util.ArrayList;
import java.util.Iterator;

public class Product {

	public static void main(String[] args) {
		ArrayList<String> products = new ArrayList<String>();
		products.add("Washing Machine");
		products.add("$Laptop");
		products.add("Hard Drive");
		products.add("$Mouse");
		products.add("HDMI Cable");
		products.add("USB Cable");
          
		Iterator<String> itr = products.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			if (element.startsWith("$")) {
				itr.remove(); // No concurrentModificationException
			}
		}
		System.out.println(products);
	}

}
