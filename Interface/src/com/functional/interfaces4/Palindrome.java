package com.functional.interfaces4;

@FunctionalInterface
interface CheckPalindrome{
	public abstract boolean checkPalindrome();
}


public class Palindrome {
	static StringBuilder name = new StringBuilder("madnm");
	static boolean check = false;
 public static void main(String[] args) {
	   
	 CheckPalindrome palindrome = ()->{
		 
		 for(int index=0; index<name.length()/2; index++) {
			 int firstIndex = index;
			 int lastIndex = name.length()-firstIndex-1;
			 if(name.charAt(firstIndex)!=name.charAt(lastIndex)) {
				  check = false;
			 }
		 }
		 return check;
		 
	 };
	boolean status =  palindrome.checkPalindrome();
	
	if(status) {
		System.out.println("Text is Palindrome");
	}
	
	else {
		System.out.println("Not Palindrome");
	}
	  
   }
}
