package com.functional.interfaces1;
@FunctionalInterface
interface Data{
	public abstract void getData();
}

// Her we not need to create a Implementing class for Functional Interface. Interface refrences
// can use to hold lambda Expression
// 

public class Driver {
	
	public static void main(String[] args) {
		Data data = () -> {
			System.out.println("Driver.main()");
		};
		
		data.getData();
	}

}
