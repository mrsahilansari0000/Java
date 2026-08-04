package com.interfaces.example;

public class Authentication {
     public void logIn(String id, String pass) {
    	 DataBase db = new DataBase();
    	 boolean auths = db.dbConnection(id, pass);
    	 System.out.println(auths);
    	 if(auths) {
    		 System.out.println("Login Successfully");
    	 }
    	 
    	 else {
    		 System.err.println("Invalid Details");
    	 }
		 
    	 
     }
}
