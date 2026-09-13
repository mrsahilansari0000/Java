
class EvenData{
	int chooseNumber;
	
	void checkEven(int a) {
		this.chooseNumber = a;
		
		if(chooseNumber>0 && chooseNumber%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Not A Even Number");
		}
	}
	
	
}


public class CheckEven {
   public static void main(String[] args) {
	   EvenData even = new EvenData();
	   even.checkEven(24);
}
}
