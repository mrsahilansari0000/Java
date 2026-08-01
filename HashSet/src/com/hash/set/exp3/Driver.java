package com.hash.set.exp3;

import java.util.HashSet;

class Employee{
	String name;
	
	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 142321;
	}
}


public class Driver {
     public static void main(String[] args) {
		HashSet<Employee> emp = new HashSet<Employee>();
		Employee emp1 = new Employee("Kodewala");
		Employee emp2 = new Employee("Academy");
		emp.add(emp1);
		emp.add(emp2);
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		int hash = emp1.hashCode();
		hash = hash ^ (hash >>> 6);
		int bucketIndex = hash & (16 - 1);
		System.out.println(bucketIndex);
	}
}
