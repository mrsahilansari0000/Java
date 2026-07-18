package com.accessmodifier;

// Protected can be access in same package and outside the package
// In outside package access in sub class and extends the class


public class ProtectedAccessModifie extends DefaultAccessModifier {

	public static void main(String[] args) {
		ProtectedAccessModifie obj = new ProtectedAccessModifie();
		// TODO Auto-generated method stub
		System.out.println(obj.name);

	}

}
