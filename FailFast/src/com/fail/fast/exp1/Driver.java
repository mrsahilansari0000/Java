package com.fail.fast.exp1;

import java.util.ArrayList;
import java.util.Iterator;

public class Driver {
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
				products.remove(element);
			}
		}
		System.out.println(products);
	}
}
