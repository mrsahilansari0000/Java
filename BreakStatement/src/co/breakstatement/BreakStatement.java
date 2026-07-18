package co.breakstatement;

public class BreakStatement {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i==6) {
				System.out.println("Matched"+i);
			}
			else {
				System.out.println("Not Matched"+i);
				break;
			}
		}
		System.out.println("Break");

	}

}
