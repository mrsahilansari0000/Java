package com.hash.map.exp1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class SbiBank {
	public static void main(String[] args) {

		HashMap<String, String> bankDetails = new HashMap<String, String>();
		bankDetails.put("Mohit Sharma", "60000");
		bankDetails.put("Sumit Kumar", "25000");
		bankDetails.put("Mohit Sharma", "50000");
		bankDetails.put("Kiran Devi", "120000");
		bankDetails.put("Rohit Seth", "160000");
		bankDetails.put("Mohd Fazal", "98000");
		bankDetails.put("Pooja Sony", "110000");
		bankDetails.put("Ajay Yadav", "112000");
		bankDetails.put("Manmohan Kumar", "140000");
		bankDetails.put("Baldev Sharma", "170000");
		bankDetails.put("Pooja Sony", "125000");
		bankDetails.put("Rahul Sharma", "80000");
		bankDetails.put(null, "80000");
		System.out.println(bankDetails);

		Set<Entry<String, String>> entrySet = bankDetails.entrySet(); // Convert HashMap to Set

		Iterator<Entry<String, String>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			Entry<String, String> data = itr.next();
			String value = data.getValue();
			int salary = Integer.parseInt(value);
			if (salary >= 100000) {
				System.out.println(data.getKey() + " " + data.getValue());
			}
		}

	}
}
