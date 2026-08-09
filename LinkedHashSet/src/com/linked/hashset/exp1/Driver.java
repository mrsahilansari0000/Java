package com.linked.hashset.exp1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Driver {

	public static void main(String[] args) {
		// Internally it use the HashSet and all element in 
		// And use the Doubly Linked List for maintain the order
	     LinkedHashSet<String> city = new LinkedHashSet<String>();
	     city.add("Bangalore");
	     city.add("Mumbai");
	     city.add("Delhi");
	     city.add("Hyderabad");
	     city.add("Chennai");
	     city.add("Pune");
	     city.add("Ahmedabad");
	     city.add("Jaipur");
	     city.add("Lucknow");
	     city.add("Kanpur");
	     city.add("Nagpur");
	     city.add("Indore");
	     city.add("Thane");
	     city.add("Bhopal");
	     city.add("Visakhapatnam");
	     city.add("PimpriChinchwad");
	     city.add("Patna");
	     city.add("Vadodara");
	     city.add("Ghaziabad");
	     city.add("Ludhiana");
	     city.add(null); // -> only one null element are allowed 
	    
	     System.out.println(city);
	     Iterator<String> cityData = city.iterator();
	     while(cityData.hasNext()) {
	    	 String data = cityData.next();
	    	 if(data.startsWith("P")) {
	    		 System.out.println(data);
	    	 }
	     }
	}

}
