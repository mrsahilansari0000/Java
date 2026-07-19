package com.array.list.exp2;

import java.util.ArrayList;

public class StudentDetails {
        public static void main(String[] args) {
			
        	ArrayList<String> student = new ArrayList<String>();
        	student.add("Rohit Kumar");
        	student.add("Sumit Yadav");
        	student.add("Rajesh Joshi");
        	student.add("Rohit Sharma");
        	student.add("Pooja Sony");
        	student.add("Rohit Roy");
        	
        	for(int i=0; i<student.size(); i++) {
        		String name = student.get(i);
        		if(name.toLowerCase().startsWith("rohit")){
        			System.out.println(name);
        		}
        	}
        	
  }
}
