package com.javaarray;

import java.util.Scanner;

class MobileDb{
	String androidMobile[] = {"Redmi Note 7 Pro","Samsung J6","Oppo Reno 5G","Realme P1 5G","Iphone 15 Pro","Redmi Note 9","Oppo A7"};
}

public class JavaArray extends MobileDb{
	int keyPattern[] = new int[5];
	Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	JavaArray obj = new JavaArray();
    	System.out.println("The Android Mobile List: ");
		for(int i=0; i<obj.androidMobile.length; i++) {
			 
			
		   System.out.println(obj.androidMobile[i]);
			 
		}
	    System.out.println("Enter KeyPattern Value");
		for(int j=0; j<obj.keyPattern.length; j++) {
			obj.keyPattern[j] = obj.sc.nextInt();
		}
		System.out.println("KeyPattern Value");
		for(int j=0; j<obj.keyPattern.length; j++) {
			System.out.println(obj.keyPattern[j]);
		}
	}
}
