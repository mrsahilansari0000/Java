package com.random.practice;

import java.util.Scanner;

public class CheckEven {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number ");
	int number = sc.nextInt();
	if(number%2==0 && number >0) {
		System.out.println("Number is Even and Positive");
	}
	else {
		System.out.println("Not Even");
	}
}
}
