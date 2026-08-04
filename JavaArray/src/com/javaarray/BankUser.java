package com.javaarray;

class AxisBank{
	
	String userName[] = new String[5];
    int userBalance[] = new int[5];
	
    
	public void getDataBase() {
		
		// Initialize the bankUser
		userName[0] = "Rahul Yadav";
		userName[1] = "Sumit Sharma";
		userName[2] = "Kiran Devi";
		userName[3] = "Mohit Kumar";
		userName[4] = "Rajat Rathore";
		
		// Initialize the bankBalance
		userBalance[0] = 50000;
		userBalance[1] = 35000;
		userBalance[2] = 25000;
		userBalance[3] = 55000;
		userBalance[4] = 70000;
		
	}
	
	
}


public class BankUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank axisUser = new AxisBank();
		System.out.println("The Bank User Account Details: ");
		System.out.println("Bank User Details");
		axisUser.getDataBase();
		for(int i=0; i<axisUser.userName.length; i++) {
			System.out.println(axisUser.userName[i]);
		}
		
		for(int i=0; i<axisUser.userBalance.length; i++) {
			System.out.println(axisUser.userBalance[i]);
		}
	}

}
