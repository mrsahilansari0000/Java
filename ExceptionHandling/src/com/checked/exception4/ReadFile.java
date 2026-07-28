package com.checked.exception4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
      public static void main(String[] args) {
		
    	  String dbUrl = "C:\\Users\\mrsah\\eclipse-workspace\\ExceptionHandling\\src\\com\\checked\\exception4\\DataBaseUrl.txt";
    	  try {
			BufferedReader reader = new BufferedReader(new FileReader(dbUrl));
			String dbStatus;
			while((dbStatus=reader.readLine())!=null) {
				System.out.println(dbStatus);
			}
		    }
    	  catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
	}
}
