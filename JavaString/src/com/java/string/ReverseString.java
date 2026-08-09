package com.java.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder  name = new StringBuilder("madam");
		StringBuilder newString = new StringBuilder();
		for(int i=0; i<name.length()/2; i++) {
			int firstIndex = i;
			int lastIndex = name.length()-i-1;
			char firstChar = name.charAt(firstIndex);
			char lastChar = name.charAt(lastIndex);
			
			name.setCharAt(firstIndex, lastChar);
			name.setCharAt(lastIndex, firstChar);
			
			newString = name;
		}
		if(newString == name) {
			System.out.println("String is Palindrome");
		}
	}

}
