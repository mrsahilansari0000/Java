package com.ott.platform;

public interface OttPlatform {
	
     public abstract void signUp(String mobileNumber , String password);
     public abstract void logIn(String mobileNumber , String password);
     public abstract void subscribe();
     public abstract void cancelSubscription();
     public abstract void applyCoupon();
}
