package com.abstractclass.exp1;

public abstract class Ecommerce {
	
      public abstract void addToCart();
      
      public abstract void upi();
      
      public abstract void netBanking();
      
      void getInvoice() {
    	  System.out.println("Invoice Generated Sucessfully");
      }
}
