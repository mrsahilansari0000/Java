package com.bank;

public class BankAccount {
    private float balance = 45000.36f;
    static float rateofInterest = 5.2f;
    public int time = 2;
    
    protected float bankInterest() {
    	float finalInterest = (balance*rateofInterest*time)/100;
    	return finalInterest;
    }
    
    String userName = "Rahul Yadav";
    int age = 25;
    String ifcCode = "BAR0";
    
    protected void userDetails() {
    	System.out.println("Name: "+userName);
        System.out.println("Age: "+age);
        System.out.println("IFC Code "+ifcCode);
    }
    
    protected void updateDetails(String _name, int _age, String _code) {
    	userName = _name;
    	age = _age;
    	ifcCode = _code;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
