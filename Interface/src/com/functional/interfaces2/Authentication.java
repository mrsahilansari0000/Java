package com.functional.interfaces2;

@FunctionalInterface
public interface Authentication {
    public abstract boolean verifyUser(String mobileNumber, int password);
   
}
