package com.functional.interfaces4;

import java.util.Scanner;

public class Driver {
     static int userInput;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SquareRoot root = (input)->{
			return (input*input);
		};
		
		System.out.print("Enter The Number: ");
		userInput = sc.nextInt();
		int finalOutput = root.calculateSqureRoot(userInput);
		System.out.println("Squre Number: "+finalOutput);
	}

}
