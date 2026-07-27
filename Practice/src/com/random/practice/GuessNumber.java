package com.random.practice;

import java.util.Scanner;

public class GuessNumber {
     public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Please Guess The Number Between 1 to 10");
		int finalNumber = 5;
		System.out.println("Please Enter Number");
		int guessNumber = 0;
		
		while(guessNumber!=finalNumber) {
			guessNumber = sc.nextInt();
			
			if(guessNumber==finalNumber) {
				System.out.println("Congrats! You Guess The Right Number");
			}
			else {
				System.out.println("Try Again");
			}
			
		}
	}
}
