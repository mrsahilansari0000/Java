package com.java.string;

public class StudentDetails {
     public static void main(String[] args) {
		String name1 = "Rahul"; // 1 Obj in SCP( String Constant Pool)
		String name2 = new String("Rahul"); // 1 Obj in SCP( String Constant Pool) and one in Heap
		System.out.println(name1==name2); // Compare memory address of the content
		
		String name3 = "Sumit"; // 1 Obj in SCP
		String name4 = "Sumit"; // name4 refers the same Object
		System.out.println(name3==name4);
		
		String name5 = "Karan"; // 1 Obj in SCP
		String name6 = new String("Karan"); // 1 Obj in Heap and name6 refers same Obj in SCP
		System.out.println(name5==name6);
		
		
		String greet = "Hello";
		greet.concat(" Jaipur");
		System.out.println(greet); // It Print Hello Because String Object is Immutable if we try to change
		                        // it then we get the new Obj Here we concat String but nobody refers it so
		                        // it print Hello
		
		String greetNew = "Hello"; // 1 Obj in SCP
		String jaipur = greetNew.concat(" Jaipur"); // Here Jaipur store in SCP and refers by str it is by default
		                                            // Hello Jaipur is stored in Heap and refers by jaipur
		String s1 = "Hello"; 
		String s2 = "World";
		String s3 = s1+s2; // s3 will be created in heap : Content -> Hello World
		String s4 = "Hello World"; // 1 Obj in SCP
		System.out.println("Hi "+(s3==s4));
		
		String s5 = "Hello"+"jaipur"; // Compile Time Optimization , Only Single Object Will Be Created
		
		
		String pune = "Jaipur";
		String mumbai = "Hello Jaipur";
		String delhi = "Hello Jaipur";
		String agra = new String("Hello Jaipur");
		System.out.println(jaipur==agra);
		System.out.println(jaipur==pune);
		System.out.println(mumbai==agra);
		System.out.println(mumbai==delhi);
		
	}
}
