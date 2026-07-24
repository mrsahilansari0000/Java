package com.continuestatement;

public class ContinueStatement {
 public static void main(String[] args) {
	 String[] mobiles = {
			    "Samsung Galaxy S25 Ultra",
			    "iPhone 16 Pro",
			    "Google Pixel 9 Pro",
			    "iPhone 16",
			    "OnePlus 13",
			    "iPhone 16 Pro Max",
			    "Xiaomi 15 Pro",
			    "Samsung Galaxy Z Fold 7",
			    "iPhone 16 Plus",
			    "iPhone 15"
			};
	 
	 int count = 0;
	 System.out.println("Android Mobile List ");
	 for(int i = 0 ; i<mobiles.length; i++) {
		 if(mobiles[i].toLowerCase().startsWith("iphone")) {
			 continue;
		 }
		 else {
			 System.out.println(mobiles[i]);
		 }
	 }
}
}
