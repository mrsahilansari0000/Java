package com.array.list.exp3;

import java.util.Scanner;
public class AxisUser {
	static Scanner sc = new Scanner(System.in);
       public static void main(String[] args) {
    	   System.out.println("Welcome To Axis Bank");
    	   System.out.println("Employee Or BankUser");
    	   String choose = sc.nextLine();
    	   if(choose.toLowerCase().equals("bankuser")) {
    		   BankUserDetails userSide = new BankUserDetails();
        	   userSide.UserData();
        	   System.out.println("For Getting The BankAccunt Details Press 1");
        	   int ack = sc.nextInt();
        	   if(ack==1) {
        		   userSide.getDetails();
        	   }
    	   }
    	   else if(choose.toLowerCase().equals("employee")) {
    		   System.out.println("Employee Dashboard");
    		   System.out.println("Send The Message To Defaulter Yes or No");
    		   String ack = sc.nextLine();
    		   if(ack.toLowerCase().equals("yes")) {
    			   BankUserDetails userSide = new BankUserDetails();
    			   userSide.UserData();
    			   userSide.sendMinBalNotification();
    		   }
    	   }
    	   
	}
}
