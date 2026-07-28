package com.checked.exception3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Hotstar{
	static boolean auth = false;
	public void userLogin(String emailId, String password){
		String dataBaseUrl = "C:\\Users\\mrsah\\eclipse-workspace\\ExceptionHandling\\src\\com\\checked\\exception3\\hotstar_database";
		try {
			BufferedReader readLoginDetails = new BufferedReader(new FileReader(dataBaseUrl));
			String dbList;
			while((dbList=readLoginDetails.readLine())!=null){
				String dbDetails[] = dbList.split(",");
				String _emailId = dbDetails[1];
				String _pass = dbDetails[2];
				if(emailId.equals(_emailId) && password.equals(_pass)) {
					System.out.println("Login Successfully");
					auth = true;
					break;
				}
			}
			if(!auth){
				System.err.println("Invalid Details");
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}	
}
public class User {
public static void main(String[] args) {
	Hotstar user = new Hotstar();
	user.userLogin("rohit.singh@gmail.com", "Rohit@111");
}
}
