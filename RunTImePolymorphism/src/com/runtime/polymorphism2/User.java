package com.runtime.polymorphism2;

public class User {
  public static void main(String[] args) {
	  EcommerceProcessor processor = new EcommerceProcessor();
	  Flipkart user = new Flipkart();
	  processor.processor(user);
	  Amazon user1 = new Amazon();
	  processor.processor(user1);
}
}
