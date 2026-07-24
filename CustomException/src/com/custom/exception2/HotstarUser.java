package com.custom.exception2;

public class HotstarUser {
       public static void main(String[] args) {
    	   Hotstar user = new Hotstar();
    	   user.purchasePremium();
    	   try {
			user.getPremiumContent();
		} 
    	   
    	  catch (PremiumPurchaseException e) {
			System.err.println(e.getMessage());
		}
    	   finally {
    		  System.exit(0);
 
    	   }
	}
}
