package com.hash.set.exp1;

import java.util.HashSet;
import java.util.Iterator;

public class Driver {
      public static void main(String[] args) {
		HashSet<String> product = new HashSet<String>();
		product.add("Laptop");
		product.add("Tablet");
		product.add("Headphone");
		product.add("Camera");
		product.add("Tablet");
		product.add("Apple Earbuds");
		
		System.out.println(product);
		
		Iterator<String> itr = product.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
      }
}
