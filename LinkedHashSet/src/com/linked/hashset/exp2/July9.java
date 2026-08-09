package com.linked.hashset.exp2;

import java.util.LinkedHashSet;

public class July9 {
    public static void main(String[] args) {
		LinkedHashSet<String> product = new LinkedHashSet<String>();
		product.add("Router");
		product.add("Graphics Card");
		product.add("RAM Module");
		product.add("SSD");
		product.add("Gaming Mouse");
		product.add("CPU");
		product.add("Gaming Mouse");
		product.add("Mechanical Keyboard");
		product.add("4K Monitor");
		product.add("Drone");
		product.add("Gaming Mouse");
		product.add("E-Reader");
		product.add("Portable SSD");
		product.add("USB Hub");
		product.add("Laptop Stand");
		product.add("Cooling Pad");
		
		for(String element : product) {
			System.out.println(element);
		}
	}
}
