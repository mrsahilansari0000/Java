package com.custom.exception5;

import java.io.IOException;
import java.util.Scanner;

public class AmazonUser {
	static Scanner sc = new Scanner(System.in);
	static String email;
	static String password;
	static String choose = null;
	public static void main(String[] args) {
		AmazonAuthentication user = new AmazonAuthentication();
		System.out.println("Choose: SignUp Or Login");
		choose = sc.nextLine();
		if(choose.equalsIgnoreCase("signup")) {
			System.out.println("Enter The Email");
			email = sc.nextLine();
			System.out.println("Enter The Password");
			password = sc.nextLine();
			try {
				user.signUp(email, password);
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
			System.out.println("Enter The Email");
			email = sc.nextLine();
			System.out.println("Enter The Password");
			password = sc.nextLine();
			try {
				user.logIn(email, password);
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		
		
	}

}
