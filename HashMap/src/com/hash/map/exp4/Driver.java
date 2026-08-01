package com.hash.map.exp4;

import java.util.HashMap;

class Employee {
	String name;
	String salary;

	public Employee(String name, String salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return 143221;
	}

	@Override
	public boolean equals(Object obj) {
		 Employee em = (Employee) obj;
	        return this.name.equals(em.name);

	}

}

public class Driver {
	public static void main(String[] args) {
		// Treefiy: when more then 8 node created at a particular index then singly linked
		// list convert into the balance tree ( red - black tree )
		HashMap<Employee, String> employee = new HashMap<>(64);
          Employee emp1 = new Employee("Rahul", "25000");
          Employee emp2 = new Employee("Pooja", "30000");
          Employee emp3 = new Employee("Lokesh", "50000");
          Employee emp4 = new Employee("Sumit", "50000");
          Employee emp5 = new Employee("Kumar", "50000");
          Employee emp6 = new Employee("Mukesh", "50000");
          Employee emp7 = new Employee("Simran", "50000");
          Employee emp8 = new Employee("Punneet", "50000");
          Employee emp9 = new Employee("Mahendra", "50000");
          Employee emp10 = new Employee("Pankaj", "50000");
          Employee emp11 = new Employee("Lalit", "50000");
          Employee emp12 = new Employee("Suraj", "50000");
          Employee emp13 = new Employee("Sahil", "50000");
          
          employee.put(emp1, emp1.salary);
          employee.put(emp2, emp2.salary);
          employee.put(emp3, emp3.salary);
          employee.put(emp4, emp4.salary);
          employee.put(emp5, emp5.salary);
          employee.put(emp6, emp6.salary);
          employee.put(emp7, emp7.salary);
          employee.put(emp8, emp8.salary);
          employee.put(emp9, emp9.salary);
          employee.put(emp10, emp10.salary);
          employee.put(emp11, emp11.salary);
          employee.put(emp12, emp12.salary);
          employee.put(emp13, emp13.salary);
          
          System.out.println(employee);
          
	}
}
