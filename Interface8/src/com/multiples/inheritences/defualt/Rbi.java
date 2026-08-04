package com.multiples.inheritences.defualt;

public interface Rbi {
      default void currentAccount() {
    	  System.out.println("Rbi.currentAccount()");
      }
}
