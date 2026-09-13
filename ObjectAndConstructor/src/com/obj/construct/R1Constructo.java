package com.obj.construct;
class CreatingCompanyGroups {
	public CreatingCompanyGroups() {
		System.out.println("I am the default super, internally executes even without calling. I am parent of all other.");
	}

	public CreatingCompanyGroups(String statement) {
		this(1111);
		System.out.println("During Execution of cD2, i've come to super");
	}

	public CreatingCompanyGroups(int practiseNumber) {
		System.out.println("before printing cC2 called super class statement,, you have to print me...");
	}
}

class CompanyCheckout extends CreatingCompanyGroups {
	String companyName;
	String companyCulture;
	int companyRevenue;
	boolean overallDoability;
	long companyEmployees;
	char companyCateogary;
	int companyTier;
	String finalDecisionToJoining;

	public CompanyCheckout() {
		System.out.println("i am default constructor of CompanyCheckout class");
	}

	public CompanyCheckout(String companyName, String companyCulture, int companyRevenue, boolean overallDoability) {
		this.companyName = companyName;
		this.companyCulture = companyCulture;
		this.companyRevenue = companyRevenue;
		this.overallDoability = overallDoability;
	}

	public CompanyCheckout(String companyName, String companyCulture, int companyRevenue, boolean overallDoability,
			long companyEmployees, char companyCateogary) {
		super("I am sending you in super");
		this.companyName = companyName;
		this.companyCulture = companyCulture;
		this.companyRevenue = companyRevenue;
		this.overallDoability = overallDoability;
		this.companyEmployees = companyEmployees;
		this.companyCateogary = companyCateogary;

	}

	public CompanyCheckout(String companyName, String companyCulture, int companyRevenue, boolean overallDoability,
			long companyEmployees, char companyCateogary, int companyTier) {

		this(companyName, companyCulture, companyRevenue, overallDoability, companyEmployees, companyCateogary,
				companyTier, "YES");

	}

	public CompanyCheckout(String companyName, String companyCulture, int companyRevenue, boolean overallDoability,
			long companyEmployees, char companyCateogary, int companyTier, String finalDecisionToJoining) {

		this.companyName = companyName;
		this.companyCulture = companyCulture;
		this.companyRevenue = companyRevenue;
		this.overallDoability = overallDoability;
		this.companyEmployees = companyEmployees;
		this.companyCateogary = companyCateogary;
		this.companyTier = companyTier;
		this.finalDecisionToJoining = finalDecisionToJoining;
	}

}

public class R1Constructo {

	public static void main(String[] args) {
		System.out.println("Developing Constrcutor's COncept Understanding \n");

		CompanyCheckout cC = new CompanyCheckout();
		System.out.println("Called to dedfuat constructor of CC class  successfully.. \n");
		System.out.println("now moving forward in program, just wait & watch  and see the flow\n");

		CompanyCheckout cC1 = new CompanyCheckout("Microsoft", "Very Goood", 500000, true);
		System.out.println("Created the 1st object of ComoanyChckout which is accessing info as  -");

		System.out.println("Name of cC1 is - " + cC1.companyName);
		System.out.println("Culture of cC1 is - " + cC1.companyCulture);
		System.out.println("Revenue of cC1 is - " + cC1.companyRevenue);
		System.out.println("OberallDoability of cC1 is - " + cC1.overallDoability);
		System.out.println("\n");

		CompanyCheckout cC2 = new CompanyCheckout("Google", "Excelleent", 100000, true, 89452312, 'A');
		System.out.println("Created the 2nd object of ComoanyChckout which is accessing info as  -");

		System.out.println("Name of cC2 is - " + cC2.companyName);
		System.out.println("Culture of cC2 is - " + cC2.companyCulture);
		System.out.println("Revenue of cC2 is - " + cC2.companyRevenue);
		System.out.println("OberallDoability of cC2 is - " + cC2.overallDoability);
		System.out.println("Employees of cC2 is - " + cC2.companyEmployees);
		System.out.println("Categorries of cC2 is - " + cC2.companyCateogary);
		System.out.println("\n");

		CompanyCheckout cC3 = new CompanyCheckout("Amazon", "Very Toxic", 25000, false, 4512562, 'B', 1);
		System.out.println("Created the 2rd object of ComoanyChckout which is accessing info as  -");

		System.out.println("Name of cC3 is - " + cC3.companyName);
		System.out.println("Culture of cC3 is - " + cC3.companyCulture);
		System.out.println("Revenue of cC3 is - " + cC3.companyRevenue);
		System.out.println("OberallDoability of cC3 is - " + cC3.overallDoability);
		System.out.println("Employees of cC3 is - " + cC3.companyEmployees);
		System.out.println("Categorries of cC3 is - " + cC3.companyCateogary);
		System.out.println("Tier of cC3 is - " + cC3.companyTier);
		System.out.println("OverAll Joining of cC3 is - " + cC3.finalDecisionToJoining);

		System.out.println("\n");

	}

}

