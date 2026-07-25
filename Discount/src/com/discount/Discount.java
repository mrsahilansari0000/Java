package com.discount;
import java.util.Scanner;
public class Discount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Total Puchasing Amount ");
        int amount = sc.nextInt();
        System.out.println("If You Have Any Premium Membership Please Choose:");
        System.out.print("Gold "+"Silver "+"Platinum ");
        String membership = sc.next();
        
        switch(membership) {
           
        case "Gold":
        	int goldDiscountRate = 10;
        	int discountAmount1 = (amount*goldDiscountRate)/100;
        	System.out.print("You Get The " + discountAmount1 + " Discount on "+ amount);
        	break;
        	
        case "Silver":
        	int silverDiscountRate = 0;
        	int discountAmount2 = (amount*silverDiscountRate)/100;
        	System.out.print("You Get The " + discountAmount2 + " Discount on "+ amount);
        	break;
        	
        case "Platinum":
        	int platinumDiscountRate = 15;
        	int discountAmount3 = (amount*platinumDiscountRate)/100;
        	System.out.print("You Get The " + discountAmount3 + " Discount on "+ amount);
        	break;
        	
        	default:
        		System.out.println("You Have Not any Membership ");
        }
        sc.close();
	}

}
