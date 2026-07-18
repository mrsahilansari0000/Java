package com.accessmodifier;
import com.accessmodifier.*;

// Default can accessible in same package only outside the package we can't access Default.

public class DefaultAccessModifier {
     protected String name = "HELLo";
	public static void main(String[] args) {
		DefaultExp obj  = new DefaultExp();
		// B is Default Variablein other class but in same Package When we extends PrivateDemo clas
		// then we can access this
		 System.out.println(obj.a);
 
	}

}
