package com.bank.example.singlefile;
class Employee{
	double salary;
	public void calculateSalary(double _salary, int hra, int da){
		salary = _salary+hra+da;
		System.out.println("Employee Salary: "+salary);
	}
}
class Manager extends Employee{
	@Override
	public void calculateSalary(double _salary, int hra, int da){
		salary = _salary+hra+da;
		System.out.println("Manager Salary: "+salary+" ");
	}
}
class Developer extends Employee{
	@Override
	public void calculateSalary(double _salary, int hra, int da){
		salary = _salary+hra+da;
		System.out.println("Developer Salary: "+salary);
		System.out.println();
	}
}

public class GoogleLLC {
public static void main(String[] args) {
	Developer dev = new Developer();
	dev.calculateSalary(88000, 5400, 3600);
}
}
