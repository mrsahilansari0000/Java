package com.nullpointer.exception;

import java.util.Scanner;

class CustomException extends RuntimeException{
	CustomException(String message){
		super(message);
	}
}

public class Driver {
	static Scanner sc = new Scanner(System.in);
       public static void main(String[] args) {
    	int value[] = new int[5];
    	String name="Rahul Sharma";
    	int age = 25;
    	try {	
    		System.out.println("Enter Name");
    		String input = sc.nextLine();
    		if(input.equals(name)) {
    			System.out.println("Data Match");
    		}
    		else{
    			throw new CustomException("Not Match");
    		}
    		
		} 
    	catch (Exception e) {	
			System.err.println(e.getMessage());	
		}
    	finally {
			sc.close();
		}
	}
}
