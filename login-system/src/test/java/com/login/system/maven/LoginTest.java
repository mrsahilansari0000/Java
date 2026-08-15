package com.login.system.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest{
	static Login loginObj;
	
	@BeforeAll
	public static void before() {
		loginObj = new Login();
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Test Case Run.......");
	}
	
	
    @Test
    public void testLogin() throws InterruptedException {
    	Thread.sleep(7000);
    	boolean token = loginObj.login("tedsteeecase@gmail.com", "test@123");
    	System.out.println(token);
    	boolean expected  = true;
    	assertEquals(expected, token);
    }
    
}
