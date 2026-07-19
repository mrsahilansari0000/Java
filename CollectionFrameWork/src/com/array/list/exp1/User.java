package com.array.list.exp1;

import java.util.ArrayList;

public class User {
	public static void main(String[] args) {
		// Multiple Nulls are allowed
        ArrayList<String> employeeCode = new ArrayList<String>(); // Create the object of ArrayList and store String Object
        ArrayList<String> employeeName = new ArrayList<String>();
 
        employeeCode.add("10054418685");
        employeeCode.add("20054896984");
        employeeCode.add("30054898986");
        employeeCode.add("10054698957");
        employeeCode.add("20054898988");
        employeeCode.add("10054418685");
        employeeCode.add("20054896984");
        employeeCode.add("30054898986");
        employeeCode.add("10054698957");
        employeeCode.add("20054898988");
        
        employeeName.add("Rahul Sharma");
        employeeName.add("Priya Patel");
        employeeName.add("Amit Kumar");
        employeeName.add("Sneha Gupta");
        employeeName.add("Vikash Singh");
        employeeName.add("Anjali Verma");
        employeeName.add("Rohan Mehta");
        employeeName.add("Neha Jain");
        employeeName.add("Saurabh Yadav");
        employeeName.add("Pooja Sharma");
        employeeName.add(null);
        employeeName.add(null);
        employeeName.add(null);
        System.out.println(employeeName);
//        employeeCode.add(null);
//        employeeCode.add(null);
  
        for(int i=0; i<employeeCode.size(); i++) {
        		String code = employeeCode.get(i);
        		String name = employeeName.get(i);
            	if(code.startsWith("1005")) {
            		System.out.println("Employee Code: "+code);
            		System.out.println("Employee Name: "+name);
            	}
        }
        
     
        
        
	}
}
