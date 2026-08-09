package com.hotel.management;

public class RangMahal {
     public void RangMahalApplication() {
    	 System.out.println("Welcome To RangMahal");
    	 String[] roomTypes = {
    			    "Single Room",
    			    "Double Room",
    			    "Deluxe Room",
    			    "Suite Room ",
    			    "Family Room"
    			};
    	 
    	 int[] roomPrices = {
    			    1500,  // Single Room
    			    2800,  // Double Room
    			    4500,  // Deluxe Room
    			    5000,  // Suite Room
    			    5200   // Family Room
    			};
    	 
    	 System.out.println("Rooms"+"        :   "+"Price");
    	 for(int i=0; i<roomTypes.length; i++) {
    		 System.out.println(roomTypes[i]+"   :   "+roomPrices[i]);
    	 }
    	 
     }
}
