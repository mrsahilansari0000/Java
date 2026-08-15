package com.collection.list.linked.list;

import java.util.LinkedList;

public class Driver {
      public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Rahul Sharma");
		list.add("Pooja Sony");
		list.add("Raman Kumar");
		
		String fetchData = list.get(0); // -> access the element [ time complexity - o(n) { due to the traversal }
		System.out.println(fetchData);
	}
}
