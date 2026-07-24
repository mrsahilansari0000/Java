package com.custom.exception2;

class PremiumPurchaseException extends RuntimeException{
	PremiumPurchaseException(String message){
		super(message);
	}
}

class Authentication{
	static boolean verify = false;
	private String email = "sumit@gmail.com";
	private int password = 7842;
	
	private boolean connectDb() {
         if(email.equals("sumit@gmail.com") && password==7842) {
        	 verify = true;
         }
         return verify;
	}
	
	public static void auth() {
		Authentication auth = new Authentication();
		auth.connectDb();
	}
	
	
}

public class Hotstar {
     boolean premiumFeature = false;
     
     public void purchasePremium() {
    	Authentication.auth();
    	 if(Authentication.verify) {
    	   premiumFeature = true;
    	 }
    	 else {
    		 System.err.println("Purchase Failed");
    	 }
     }
      
     public void getPremiumContent() {
    		 if(premiumFeature) {
    			 System.out.println("Movie Play");
    		 }
    		 else {
    			 throw new PremiumPurchaseException("Please Purchase Premium");  // Throwable Class Store The Actual Message
    		 }
     }
}
