package com.accessmodifier;

// Private can access in class only in same package Other class cannot access the private
// private can be accessible block only
// When we extend the class then we can't access the private member variable and methods.


class PrivateDemo{
	public int a = 10;
	// Default Variable
	int b = 100;
}


public class PriverAccessModifier extends PrivateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriverAccessModifier obj = new PriverAccessModifier();
		PrivateDemo obj1 = new PrivateDemo();
		System.out.println(obj.a);
		// Private can accesible outside the class it is accesible in class only
		// System.out.println(obj.dingdong);
	}

}
