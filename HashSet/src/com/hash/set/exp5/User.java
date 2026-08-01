package com.hash.set.exp5;

class Employee {
	String firstName;
	String lastName;

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// In Object Class equals method compare the reference so here we override the
	// equals
	// method for compare the object
	@Override
	public boolean equals(Object obj2) {
		Employee emp = (Employee) obj2;
		return this.firstName.equals(emp.firstName) && this.lastName.equals(emp.lastName);

	}
	
	@Override
	public int hashCode() {
		return this.firstName.hashCode()+this.lastName.hashCode();
	}

}

public class User {
	public static void main(String[] args) {
		Employee rahul = new Employee("Rahul", "Kumar");
		Employee pooja = new Employee("Rahul", "Kumar");
		System.out.println(rahul.equals(pooja));
		System.out.println(rahul.hashCode()+" "+pooja.hashCode());
	}
}
