package com.functional.marker.together;

@FunctionalInterface
public interface Authentication {
    public abstract boolean verifyUser(String mobileNumber, int password);
   
}
