package com.iibsib;

class A
{
	A()
	{
		System.out.println("A Class Constructer");
	}
	static 
	{
		System.out.println("Static Block a class");	
	}

}
class B extends A
{
	B()
	{
	System.out.println("B Class Constructer");
	}
	{
	System.out.println("Instance Block1");	
	}
	{
		System.out.println("Instance Block2");	
	}
	{
		System.out.println("Instance Block3");	
	}
	{
		System.out.println("Instance Block4");	
	}
	static 
	{
		System.out.println("Static Block1");	
	}
	static 
	{
		System.out.println("Static Block2");	
	}
	static 
	{
		System.out.println("Static Block3");	
	}
	static 
	{
		System.out.println("Static Block4");	
	}
	
}
public class Pratices 
{
	public static void main(String[] args)
	{
	
	}
	static 
	{
		B b1=new B();
	}
}