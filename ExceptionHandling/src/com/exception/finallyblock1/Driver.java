package com.exception.finallyblock1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Driver {
	static BufferedReader br;
      public static void main(String[] args) throws IOException {
		String filrUrl = "C:\\Users\\mrsah\\eclipse-workspace\\ExceptionHandling\\src\\com\\exception\\finallyblock1\\aadhar_data";
			try {
				br = new BufferedReader(new FileReader(filrUrl));
			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				br.close();
			}
		
	}
}
