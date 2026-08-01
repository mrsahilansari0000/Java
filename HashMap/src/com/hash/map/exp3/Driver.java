package com.hash.map.exp3;

import java.util.HashMap;
import java.util.Map;


public class Driver {
	
     public static void main(String[] args) {
		HashMap<String, String> products = new HashMap<String, String>(64);
		
		products.put("Washing Machine", "60000");
		products.put("Refrigerator", "45000");
		products.put("Microwave Oven", "12000");
		products.put("LED Television", "35000");
		products.put("Smartphone", "25000");
		products.put("Laptop", "55000");
		products.put("Air Conditioner", "40000");
		products.put("Vacuum Cleaner", "8000");
	    
		
		
		System.out.println(products);
		
		for(Map.Entry<String, String> data : products.entrySet()) {
			System.out.println(data);
		}
	}
}
