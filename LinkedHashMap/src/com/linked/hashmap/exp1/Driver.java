package com.linked.hashmap.exp1;

import java.util.LinkedHashMap;

public class Driver {
       public static void main(String[] args) {
		LinkedHashMap<String, String> products = new LinkedHashMap<String, String>();
		products.put("Washing Machine", "55000");
		products.put("HP Laptop", "65000");
		products.put("DELL Laptop", "75000");
		
		System.out.println(products);
	
	}
}
