package com.functional.interfaces4;

import java.util.Scanner;

public class Drivers {
	static String finalAnswer;
	static String userText;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  ConvertToUpperCase convertText = (text)->{
		finalAnswer = text.toUpperCase();
	};
	
	System.out.print("Enter The Text: ");
	userText = sc.nextLine();
	convertText.convertToUpperCase(userText);
	System.out.println(finalAnswer);
   }
}
