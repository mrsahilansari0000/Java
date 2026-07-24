package com.consturctor.chaining;
class Employee{
	String name;
	Employee(String _name){
		this.name = _name;
		System.out.println(name+" is an Employee");
	}
}
public class Manager extends Employee{
	String department;
	Manager(String _name, String _department){
		super(_name);
		this.department = _department;
		System.out.println(name+" is an Employee of "+department+" Department");
	}
public static void main(String[] args) {
	Manager rahul = new Manager("Rahul Sharma", "IT");
}
}
