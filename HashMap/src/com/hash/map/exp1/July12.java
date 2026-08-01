package com.hash.map.exp1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class July12 {

	public static void main(String[] args) {
		HashMap<String, String> studentData = new HashMap<String, String>();
		studentData.put("10000", "Akram");
		studentData.put("10001", "Puneet");
		studentData.put("10002", "Mohit");
		studentData.put("10003", "Kodewala");
		studentData.put("10003", "Kodewala");

		Set<Entry<String, String>> studentEntrySet = studentData.entrySet();
		Iterator<Entry<String, String>> itr = studentEntrySet.iterator();

		while (itr.hasNext()) {
			Entry<String, String> data = itr.next();
			System.out.println(data.getKey() + " : " + data.getValue());

		}
		System.out.println("-----------------------+");
		for (Entry<String, String> data : studentEntrySet) {
			System.out.println(data);
		}

		// System.out.println(studentData.get(studentData));
	}
}
