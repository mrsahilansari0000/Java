package com.interfaces.example;

public class HDFCUser {
   public static void main(String[] args) {
	   HDFC user = new HDFC("rahul@hdfc", "1234", 25000);
	   Authentication authVerify = new Authentication();
	   authVerify.logIn("rahul@hdfc", "1234");
	  
   }
}
