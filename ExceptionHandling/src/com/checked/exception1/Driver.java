package com.checked.exception1;

// Known by the compiler and it forcing to handle the exception.
public class Driver {
       public static void main(String[] args) {
    	   
    	try {
			String name = "Kodewala";
			System.out.println(name.length()); // Unchecked Exception
		} catch (Exception e) {
	        e.printStackTrace();
		}
    	
		try {
			Class.forName("com.checked.exception1.Driversss");   
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
