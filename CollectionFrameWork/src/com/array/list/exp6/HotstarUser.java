package com.array.list.exp6;

import java.util.Scanner;

public class HotstarUser {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    		System.out.println("Enter the Email Id:");
    		String userEmail = sc.nextLine();
    		System.out.println("Enter the Password:");
    		String userPass = sc.nextLine();
    		
    		Hotstar hotstar = new Hotstar(userEmail, userPass);
    		hotstar.logIn(userEmail, userPass);
    	
	}
}
