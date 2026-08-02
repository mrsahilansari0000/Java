package com.microsoft;

class Salary{
	public void employeeSalary(String name, float salary) {
		System.out.println(name+" Salary: "+salary);
	}
	
    public void employeeSalary(String name , float salary, int bonus) {
		float totalSalary = salary+bonus;
		System.out.println(name+" Salary With Bonus: "+totalSalary);
	}
    
    public void employeeSalary(String name, float salary, int bonus , int incentives) {
		float totalSalary = salary+bonus+incentives;
		System.out.println(name+" Salary with Bonus+incentives: "+totalSalary);
   	}
}


public class Microsoft {
   public static void main(String[] args) {
	   Salary employee1 = new Salary();
	   employee1.employeeSalary("Sumit Kumar",75000.84f, 6000, 2500);
	   
  }
}
