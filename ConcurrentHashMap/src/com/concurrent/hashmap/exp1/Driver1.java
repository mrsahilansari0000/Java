package com.concurrent.hashmap.exp1;

import java.util.concurrent.ConcurrentHashMap;
class Dummy extends Thread{
	static Driver1 driver = new Driver1();
	static public void threadOne() throws InterruptedException {
	 	   for(int i=1; i<=4; i++) {
	 		  driver.testData.put("Thread-A"+i, "Data "+i);
	 		  Thread.sleep(2000);
	 	   }
	    }
		
		static public void threadTwo() throws InterruptedException {
			for(int i=1; i<=4; i++) {
		 		   driver.testData.put("Thread-B"+i, "Data "+i);
		 		  Thread.sleep(2000);
		 	   }
	    }
}
public class Driver1 {
	static ConcurrentHashMap<String, String> testData;
	public static void main(String[] args) throws InterruptedException {
		testData   = new ConcurrentHashMap<String, String>();
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        Dummy dummy = new Dummy();
        dummy.threadOne();
        dummy.threadTwo();
        
        System.out.println(testData);
	}
	
}
