package com.hash.set.exp1;

import java.util.HashSet;

public class Driver {
    public static void main(String[] args) {
		HashSet<String> city = new HashSet<String>();
		city.add("Bangalore");
		city.add("Jaipur");
		city.add("Mysore");
		city.add("Hyderabad");
		city.add(null);
		
		System.out.println(city);
		
		System.out.println("Bangalore".hashCode());
		System.out.println("Mysore".hashCode());
		
		int hash = "Jaipur".hashCode();
		hash = hash ^ (hash >>> 16);
		int bucketIndex = hash & (16-1);
		System.out.println("Jaipur Store at "+bucketIndex+" index");
		
		hash = "Mysore".hashCode();
		hash = hash ^ (hash >>> 16);
		bucketIndex = hash & (16-1);
		System.out.println("Mysore Store at "+bucketIndex+" index");
		
		hash = "Hyderabad".hashCode();
		hash = hash ^ (hash >>> 16);
		bucketIndex = hash & (16-1);
		System.out.println("Hyderabad Store at "+bucketIndex+" index");
		
		
	}
}
