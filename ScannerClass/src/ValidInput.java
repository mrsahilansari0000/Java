import java.util.Scanner;

public class ValidInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name ");
		while(true) {
			String name = sc.next();
			if(name.matches("[a-zA-Z]+")) {
				System.out.println("Name Save Successfully");
				break;
			}
			else {
				System.out.println("Invalid Name Please Enter Again ");
			}
			
		}
		

	}

}
