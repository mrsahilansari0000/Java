package com.hash.set.exp9;

import java.util.HashSet;

public class SetRehashing {
       public static void main(String[] args) {
    	   // Load Factor -> 0.75
    	   // threshold - > 12
    	   // new capacity = 2*old Capacity
		HashSet<String> item = new HashSet<String>();
		item.add("Tablet");
		item.add("Camera");
		item.add("Earbuds");
		item.add("I Phone");
		item.add("Laptop");
		item.add("Pendrive");
		item.add("Speaker");
		item.add("Mouse");
		item.add("Keyboard");
		item.add("Earphone");
		item.add("Hard Drive");
		item.add("Charger");
		
		System.out.println(item);
		// 13th Element
		item.add("MacBook");
		
		System.out.println(item);
	}
}
