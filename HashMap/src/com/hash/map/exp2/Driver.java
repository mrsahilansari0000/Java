package com.hash.map.exp2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

class Employee {
	String name;
	String salary;

	public Employee(String name, String salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object o) {
	    Employee e = (Employee) o;
	    return this.name.equals(e.name) && this.salary.equals(e.salary);
	}

	@Override
	public int hashCode() {
	    return 143321;
	}
	
	

}

public class Driver {
	public static void main(String[] args) {
		HashMap<Employee, String> employeeDetails = new HashMap<>();

		Employee emp1 = new Employee("Rahul Sharma", "25000");
		Employee emp2 = new Employee("Rahul Sharma", "30000");
		Employee emp3 = new Employee("Rahul Sharma", "25000");
		

		employeeDetails.put(emp1, emp1.salary);
		employeeDetails.put(emp2, emp2.salary);
		employeeDetails.put(emp3, emp3.salary);

		Set<Entry<Employee, String>> itr = employeeDetails.entrySet();

		Iterator<Entry<Employee, String>> data = itr.iterator();

		while (data.hasNext()) {
			Entry<Employee, String> element = data.next();
			System.out.println(element.getKey().name+" " + element.getValue());
		}

	}
}
