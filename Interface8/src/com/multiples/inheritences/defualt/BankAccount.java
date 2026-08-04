package com.multiples.inheritences.defualt;

public interface BankAccount {
      default void currentAccount() {
    	   System.out.println("BankAccount.currentAccount()");
       }
}
