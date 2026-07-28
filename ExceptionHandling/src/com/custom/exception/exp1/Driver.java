package com.custom.exception.exp1;

class NullData extends RuntimeException {
	NullData(String message) {
		super(message);
	}
}

public class Driver {
	static String name;

	Driver(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		Driver data = new Driver("Kodewala");
		
		try {
			if (name == null) {
				throw new NullData("Null Data");
			}
			System.out.println(name);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
