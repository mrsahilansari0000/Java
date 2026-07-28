package com.checked.exception1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public void readFile() {
		String fileUrl = "C:\\Users\\mrsah\\eclipse-workspace\\ExceptionHandling\\src\\com\\checked\\exception1\\employee_data";
		try {
			BufferedReader read = new BufferedReader(new java.io.FileReader(fileUrl));
			String line;
			while ((line = read.readLine()) != null) {
				String lineArr[] = line.split(",");
				String city = lineArr[3];
				if (city.equals("Jaipur")){
					System.out.println(line);
				}
			}
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ReadFile obj = new ReadFile();
		obj.readFile();
	}
}
