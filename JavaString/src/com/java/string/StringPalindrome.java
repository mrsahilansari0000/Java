package com.java.string;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String name = "abbabba";
          
		   boolean verify = false;
           
           for(int i=0; i<name.length()/2; i++) {
        	   int firstIndex = i;
        	   int lastIndex = name.length()-i-1;
        	   if(name.charAt(i)==name.charAt(lastIndex)) {
        		   verify = true;
        	   }
           }
           if(verify) {
        	   System.out.println("String is Palindrome");
           }
           else {
        	   System.out.println("String is Not Palindrome");
           }
	}

}
