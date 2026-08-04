package com.multiple.inheritence.interfaces;

public interface Payment {
	
          void upi();
          public default void toMobileNumber() {
        	  System.out.println("Payment.toMobileNumber()");
          }
}
