package com.array.list.exp7;

import java.util.ArrayList;


public class Product {
     public static void main(String[] args) {
		ArrayList<String> products = new ArrayList<String>();
		products.add("$Washing Machine");
		products.add("$Laptop");
		products.add("Hard Drive");
		products.add("$Mouse");
		products.add("$HDMI Cable");
		products.add("USB Cable");
       
//		Iterator<String> productList =  products.iterator();
//		while(productList.hasNext()) {
//			String item = productList.next();
//			if(item.startsWith("$")) {
//				products.remove(item);
//				continue;
//			}
//			else {
//				System.out.println(item);
//			}
//		}
		
		for (String product : products) {
			if(product.startsWith("$")) {
				products.remove(product);
			}
		}
	}
}
