package com.hash.set.exp11;

import java.util.HashSet;
import java.util.Iterator;

public class Driver {
      public static void main(String[] args) {
		HashSet<String> userId = new HashSet<String>();
		userId.add("rahulsharma@gmail.com");
		userId.add("priyaverma@gmail.com");
		userId.add("amitsharma123@gmail.com");
		userId.add("nehasharma@gmail.com");
		userId.add("rohitverma01@gmail.com");
		userId.add("snehakumar@gmail.com");
		userId.add("rahulkumar@outlook.com");
		userId.add("priyasharma@outlook.com");
		userId.add("amitverma2023@outlook.com");
		userId.add("neha.verma@outlook.com");
		userId.add("rohitsharma01@outlook.com");
		userId.add("vikaspatel007@outlook.com");
		userId.add("anjalikumar@outlook.com");
		userId.add("deepakverma@outlook.com");
		userId.add("poojasharma88@outlook.com");
		userId.add("saurabhrai@outlook.com");
		userId.add("snehaverma@outlook.com");
		userId.add("vikassharma007@gmail.com");
		userId.add("anjali.verma@gmail.com");
		userId.add("deepaksharma@gmail.com");
		userId.add("poojarai@gmail.com");
		userId.add("kiran.verma@outlook.com");
		userId.add("saurabhverma99@gmail.com");
		userId.add("kiranpatel@gmail.com");
		userId.add("manishsharma88@gmail.com");
		userId.add("rani.gupta@gmail.com");
		userId.add("rahulverma2024@gmail.com");
		userId.add("shwetasingh@gmail.com");
		userId.add("arjunsharma.pro@gmail.com");
		userId.add("meenakumari@gmail.com");
		userId.add("yashverma007@gmail.com");
		userId.add("sonalisharma@gmail.com");
		
		System.out.println("Gmail User");
		for(String id : userId) {
			if(id.contains("@gmail.com")) {
				System.out.println(id);
			}
		}
		System.out.println();
		System.out.println("Outlook User");
		Iterator<String> id = userId.iterator();
		while(id.hasNext()) {
			String data = id.next();
			if(data.contains("@outlook.com")) {
				System.out.println(data);
			}
		}
	}
}
