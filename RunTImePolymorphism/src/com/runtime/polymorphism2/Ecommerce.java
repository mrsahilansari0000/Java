package com.runtime.polymorphism2;

public interface Ecommerce {
    public abstract void login();
    public abstract void adCart();
    public abstract void placeOrder();
    
    public static void doPayment() {
    	System.out.println("Payment Done");
    }
}
