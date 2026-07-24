package com.conti;

public class ContiExp {
   public static void main(String[] args) {
	   String[] mobiles = {
	            "Samsung Galaxy S25 Ultra",
	            "iPhone 16 Pro Max",
	            "Google Pixel 9 Pro",
	            "OnePlus 13",
	             null,
	            "Samsung Galaxy A56",
	            "iPhone 16",
	            "Google Pixel 9",
	            "Nothing Phone (3)",
	            "Vivo X200 Pro",
	            
	            "Oppo Find X8 Pro",
	            "Samsung Galaxy S25",
	             null,
	            "Realme GT 7 Pro",
	            "iPhone 16 Pro",
	            "Xiaomi 15",
	             null,
	            "Samsung Galaxy Z Fold7",
	            "Samsung Galaxy Z Flip7",
	            "Google Pixel 9a",
	            
	            "Sony Xperia 1 VII",
	             null,
	            "Tecno Phantom V3",
	            "Infinix GT 30 Pro",
	            "Poco X8 Pro",
	             null,
	            "Motorola Razr 60",
	            "Nokia G400",
	            "Lava Agni 3",
	            "iQOO 13"
	        };
	   
	   for(int index=0; index<mobiles.length; index++) {
		   
		   String productData = mobiles[index];
		   
		   if(productData==null) {
			   System.out.println("The null Value are available at index "+index);
			   continue;
		   }
		   
		   System.out.println(productData.toUpperCase());
	   }
  }
   
   
}
