package com.array.list.exp5;

import java.util.ArrayList;

public class VoterList {
     public static void main(String[] args) {
		ArrayList<String> voterList = new ArrayList<String>();
		voterList.add("Ravi Gupta");
		voterList.add("Rahul Kumar");
		voterList.add("Pooja Sony");
		voterList.add("Ramesh Sharma");
		voterList.add("Puneet Choudhry");
		voterList.add("Shoaib Ansari");
		System.out.print(voterList);
		voterList.remove(2); // The Element After That Index Shifted Left After The Index ( O(n) )
	}
}
