package com.collections.exp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadSafetyUtilities {
	public static void main(String[] args) {
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		
		List<Integer> threadSafeList =  Collections.synchronizedList(values);
		
		threadSafeList.add(78);
		threadSafeList.add(50);
		threadSafeList.add(88);
		threadSafeList.add(28);
		threadSafeList.add(41);
		threadSafeList.add(52);
		threadSafeList.add(63);
		threadSafeList.add(22);
		threadSafeList.add(87);
		threadSafeList.add(54);
		synchronized (threadSafeList) {
			for(Integer data : threadSafeList) {
				System.out.println(data);
			}
		}
		
		
	}
}
