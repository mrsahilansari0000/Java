import java.util.Scanner;

public class ValidateInput {
     String userName;
     int userPassword;
     Scanner sc = new Scanner(System.in);
     public void signUp() {
    	 System.out.println("Enter The UserName ");
    	 userName =sc.next();
    	 while(!userName.matches("[a-zA-Z]+")) {
    		 System.out.println("Enter The Valid UserName");
    		 userName =sc.next();
    	 }
    	 System.out.println("Enter The userPassword ");
    	 userPassword =sc.nextInt();
    	 
    	 //userName = sc.next();
    	 
     }
     
     public void logIn() {
    	 String tempUserName;
    	 int tempUserPassword;
    	 System.out.println("Please Enter User Name and Password ");
    	 tempUserName = sc.next();
    	 System.out.println("PAss");
    	 tempUserPassword = sc.nextInt();
    	 
    	 if(tempUserName.equalsIgnoreCase(userName) && tempUserPassword == userPassword) {
    		 System.out.println("Sucsessfully Login");
    	 }
     }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidateInput userCreation = new ValidateInput();
		userCreation.signUp();
		userCreation.logIn();
	}

}
