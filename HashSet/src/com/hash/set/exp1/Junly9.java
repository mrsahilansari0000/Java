package com.hash.set.exp1;

import java.util.HashSet;
import java.util.Iterator;

class OnlyTesting {
     String productName;

	 public OnlyTesting(String productName) {
		super();
		this.productName = productName;
	 }

	 public String getProductName() {
		 return productName;
	 }
	 
	 @Override
	 public int hashCode() {
		 return 143211;
	 }
	 
	 @Override
	 public boolean equals(Object obj) {
		 OnlyTesting onlyObj = (OnlyTesting) obj;
		return this.productName.equals(onlyObj.productName);
	 }
	  
}

public class Junly9 {

	public static void main(String[] args) {
		HashSet<OnlyTesting> product = new HashSet<OnlyTesting>(64);
		
        OnlyTesting o1 = new OnlyTesting("Earphone");
        OnlyTesting o2 = new OnlyTesting("Laptop");
        OnlyTesting o3 = new OnlyTesting("Smartphone");
        OnlyTesting o4 = new OnlyTesting("Mouse");
        OnlyTesting o5 = new OnlyTesting("Earphone");
        OnlyTesting o6 = new OnlyTesting("Tablet");
        OnlyTesting o7 = new OnlyTesting("Charger");
        OnlyTesting o8 = new OnlyTesting("Power Bank");
        OnlyTesting o9 = new OnlyTesting("Monitor");
        OnlyTesting o10 = new OnlyTesting("Wireless Earbuds");
        
		product.add(o1);
		product.add(o2);
		product.add(o3);
		product.add(o4);
		product.add(o5);
		product.add(o6);
		product.add(o7);
		product.add(o8);
		product.add(o9);
		product.add(o10);
		
		System.out.println(o1.getProductName().hashCode());
		System.out.println(o5.getProductName().hashCode());

		Iterator<OnlyTesting> itr = product.iterator();
		while (itr.hasNext()) {
			OnlyTesting fetchData = itr.next();
			String element = fetchData.getProductName();
			System.out.println(element);
		}
	}
}
