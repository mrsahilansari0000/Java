package com.functional.interfaces4;

@FunctionalInterface
interface Reverse{
	public abstract void reverseString();
}


public class ReverseEngine {
	static StringBuilder name = new StringBuilder("Hello");
	static int firstIndex;
	static int lastIndex;
      public static void main(String[] args) {
		Reverse engine = ()->{
			for(int index=0; index<name.length()/2; index++) {
			 firstIndex = index;
			 lastIndex = name.length()-1-firstIndex;
			 
			 char firstChar = name.charAt(firstIndex);
			 char lastChar = name.charAt(lastIndex);
			 
			 name.setCharAt(firstIndex, lastChar);
			 name.setCharAt(lastIndex, firstChar);
			} 
			 
		};
		engine.reverseString();
		System.out.println(name);
	}
}
