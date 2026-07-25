package com.delivery;


public class Student {
	 int studentId;
	 String studentName;
	 int age;
	 String subject;
	 
	 public Student(int _studentId, String _studentName) {
		 this.studentId = _studentId;
		 this.studentName = _studentName;
	 }
	 
	 public Student(int _studentId, String _studentName, int _age) {
		 this.studentId = _studentId;
		 this.studentName = _studentName;
		 this.age = _age;
	 }
	 
	 public Student(int _studentId, String _studentName, int _age, String _subject) {
		 this.studentId = _studentId;
		 this.studentName = _studentName;
		 this.age = _age;
		 this.subject = _subject;
	 } 
	 
	 
     public static void main(String[] args) {
    	 Student student1 = new Student(5488, "Monika Sharma");
    	 Student student2 = new Student(5874, "Lalit Yadav", 24);
    	 Student student3 = new Student(7458, "Mohit Kumar", 25, "Science Math");
    	 
    	 System.out.println("Monika Details");
    	 System.out.println("Student Id: "+student1.studentId+" | "+"Student Name: "+student1.studentName);
    	 System.out.println("Lalit Details");
    	 System.out.println("Student Id: "+student2.studentId+" | "+"Student Name: "+student2.studentName+" | "+"Student Age: "+student2.age);
    	 System.out.println("Mohit Details");
    	 System.out.println("Student Id: "+student3.studentId+" | "+"Student Name: "+student3.studentName+" | "+"Student Age: "+student3.age+" | "+"Subject: "+student3.subject);
	}
} 
