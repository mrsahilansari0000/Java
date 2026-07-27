package com.axis.bank;

import java.util.Scanner;

public class BankUser {
	static Scanner sc = new Scanner(System.in);
       public static void main(String[] args) {
    	AxisBank axis = new AxisBank();
		System.out.println("Please Login:");
		System.out.println("Enter User Id:");
		String id = sc.nextLine();
		System.out.println("Enter User Pass:");
		String pass = sc.nextLine();
		
		if(id.equals(axis.getUserId())&&pass.equals(axis.getUserPass())) {
			System.out.println("Login Successfully");
			System.out.println("Press 1 For Check the Balance");
			System.out.println("Press 2 For Deposit the Balance");
			System.out.println("Press 3 For Withdrawl the Balance");
			String option = sc.nextLine();
			switch (option) {
			case "1":
				System.out.println("Current Bank Balance: "+axis.getBalance());
				break;
				
			case "2":
				System.out.println("Enter Amount:");
				int deposit = sc.nextInt();
				axis.deposit(deposit);
				System.out.println("Current Bank Balance: "+axis.getBalance());
				break;
				
			case "3":
				System.out.println("Enter Amount:");
				int withdrawl = sc.nextInt();
				axis.withDrawl(withdrawl);
				System.out.println("Current Bank Balance: "+axis.getBalance());
				break;

			default:
				break;
			}
		}
		else {
			System.err.println("Invalid Details");
		}
	}
}
