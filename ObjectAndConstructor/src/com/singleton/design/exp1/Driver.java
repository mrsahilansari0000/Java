package com.singleton.design.exp1;

class Student {
	private static Student s1;
	String name;

	private Student(String name) {
		super();
		this.name = name;
	}

	public static Student getInstance() {
		if (s1 == null) {
			s1 = new Student("AKram Khan");
		}
		return s1;
	}

}

public class Driver {
	public static void main(String[] args) {
		Student d1 = Student.getInstance();
		Student d2 = Student.getInstance();
		System.out.println(d1.name);
	}
}
