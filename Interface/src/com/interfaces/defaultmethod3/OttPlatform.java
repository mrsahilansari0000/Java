package com.interfaces.defaultmethod3;

public interface OttPlatform {
	 public abstract void signUp(String mobileNumber , String password);
     public abstract void logIn(String mobileNumber , String password);
     public abstract void subscribe();
     public abstract void cancelSubscription();
     public default void applyCoupon() {
    	 System.out.println("OttPlatform.applyCoupon()");
     }
}
