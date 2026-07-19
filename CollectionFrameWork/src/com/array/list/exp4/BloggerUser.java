package com.array.list.exp4;

import java.util.Scanner;

public class BloggerUser {
	 static Scanner sc = new Scanner(System.in);
     public static void main(String[] args) {
    	 UserData data = new UserData();
    	System.out.println("Login Dashboard");
    	System.out.println("Enter Email");
    	String email = sc.nextLine();
    	System.out.println("Enter Password");
    	String password = sc.nextLine();
    	data.userLogin(email, password);
    	
    	
	}
}
