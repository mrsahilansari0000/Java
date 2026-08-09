
class Employee{
	static int employeeCode = 0;
	String companyName = "Microsoft";
	
	String name;
	int age;
	int experience;
	
//	public int employeeCode() {
//		employeeCode = employeeCode+1;
//		return employeeCode;
//	} 
	
	{
		employeeCode = employeeCode+1;
		//this.employeeCode = employeeCode;
	}
	
	public Employee(String name, int age, int experience) {
		this.name=name;
		this.age=age;
		this.experience=experience;
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Age: "+age);
		System.out.println("Employee Experience: "+experience);
		System.out.println("Employee Code: "+companyName+" "+employeeCode);

	}
	
}


public class Microsoft {
  public static void main(String[] args) {
	  Employee rahul = new Employee("Rahul Kumar", 28, 3);
	  Employee sumit = new Employee("Sumit Sony", 25, 6);
	  
	  System.out.println("New Employee Details: ");
	  System.out.println("Name: "+rahul.name);
	  System.out.println("EmployeId: "+"Microsoft "+Employee.employeeCode);
	  System.out.println("Age: "+rahul.age);
	  System.out.println("Experience: "+rahul.experience+" "+"Years");
	  System.out.println();
	  System.out.println("Name: "+sumit.name);
	  System.out.println("EmployeId: "+"Microsoft "+Employee.employeeCode);
	  System.out.println("Age: "+sumit.age);
	  System.out.println("Experience: "+sumit.experience+" "+"Years");
 }
}
