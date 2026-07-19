package com.array.list.add.remove.exp4;

import java.util.ArrayList;

public class City {
       public static void main(String[] args) {
		ArrayList<String> city = new ArrayList<String>();
		city.add("Rajasthan");
		city.add("Delhi");
		city.add("Punjab");
		city.add("Haryana");
		city.add("Hmachal Pradesh");
		System.out.println(city);
		
		city.add(1, "Madhya Pradesh");
		city.remove(3);
	}
}
