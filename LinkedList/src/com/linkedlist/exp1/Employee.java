package com.linkedlist.exp1;

import java.util.LinkedList;

public class Employee {
        public static void main(String[] args) {
			LinkedList<String> employee = new LinkedList<String>();
			employee.add("Sumit kumar");
			employee.add("Rahul Sony");
			employee.add("Karan yadav");
			employee.add("Pooja Sony");
			employee.add("Manoj Gupta");
			employee.add("Sumit kumar");
			
			System.out.println(employee);
			
			employee.add(1, "Raju Rastogi");
			
			System.out.println(employee);
		}
}
