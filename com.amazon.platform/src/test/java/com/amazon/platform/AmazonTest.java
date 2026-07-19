package com.amazon.platform;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AmazonTest {
	static Amazon amazon;

	@BeforeAll
	public static void beforeAll() {
		amazon = new Amazon(); 
	}
	
	@Test
	public void testLogin() {
		boolean expected = true;
		boolean authResult = amazon.login("testcase@paytm", 4444);
		assertEquals(expected, authResult);
	}
	
	@Test
	public void testUpi() {
		boolean expected = true;
		boolean authResult = amazon.upi("testcase@paytm", 4444);
		assertEquals(expected, authResult);
	}
	
	@Test
	public void testGetStatus() {
		String expected = "Order Placed";
		String authResult = amazon.getStatus();
		assertEquals(expected, authResult);
	}
}