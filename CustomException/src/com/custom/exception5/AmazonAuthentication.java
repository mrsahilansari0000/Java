package com.custom.exception5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class AmazonAuthentication {
	private static boolean signUpAuth = false;
	private static boolean logInAuth = false;
	public String emailIds[] = new String[55];
	public String passwords[] = new String[55];

	private void getDataBase() throws IOException {
		String dataBaseUrl = "C:\\Users\\mrsah\\eclipse-workspace\\CustomException\\src\\com\\custom\\exception5\\AmazonDataBase.txt";
		BufferedReader read = null;
		try {
			if (dataBaseUrl != null) {
				read = new BufferedReader(new FileReader(dataBaseUrl));
				String fields;
				int i = 0;
				while ((fields = read.readLine()) != null) {
					String userDetails[] = fields.split(",");
					this.emailIds[i] = userDetails[0];
					this.passwords[i] = userDetails[1];
					i++;
				}
			} else {
				System.err.println("No DataBase Found");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			read.close();
		}
	}

	public boolean signUp(String _email, String _password) throws IOException {
		getDataBase();
		for (int i = 0; i < emailIds.length; i++) {
			String tempEmailId = emailIds[i];
			String tempPassword = passwords[i];
			if (_email.equals(tempEmailId) && _password.equals(tempPassword)) {
				signUpAuth = true;
				System.err.println("You Already Resigtered Please Login..");
				break;
			}
		}

		if (!signUpAuth) {
			try {
				String dataBaseUrl = "C:\\Users\\mrsah\\eclipse-workspace\\CustomException\\src\\com\\custom\\exception5\\AmazonDataBase.txt";
				BufferedWriter writer = new BufferedWriter(new FileWriter(dataBaseUrl, true));
				writer.newLine();
				writer.write(_email + "," + _password + ", " + "true");
				writer.close();
				signUpAuth = true;
				System.out.println("SignUp SuccessFully Please Login");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return signUpAuth;
	}

	public boolean logIn(String _email, String _password) throws IOException {
		getDataBase();
		for (int i = 0; i < emailIds.length; i++) {
			String tempEmailId = emailIds[i];
			String tempPassword = passwords[i];
			if (_email.equals(tempEmailId) && _password.equals(tempPassword)) {
				logInAuth = true;
				System.out.println("Login Succesfully");
				Amazon obj = new Amazon();
				obj.amazonUi();
				break;
			}
		}
		if (!logInAuth) {
			System.err.println("Invalid Details Login Failed");
		}
		return logInAuth;
	}
}
