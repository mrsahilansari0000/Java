package com.javaarray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int marks[] = {25,35,14,12,16,5,2,78,98};
//		Arrays.sort(marks);
		Integer marks[] = {25, 35, 14, 12, 16, 5, 2, 78, 98};

        // Descending order sort
        Arrays.sort(marks, Collections.reverseOrder());

		
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
			
		}
		
		for (int i = marks.length-1; i >=0; i--) {
			System.out.println(marks[i]);
		}

		


 	}

}
