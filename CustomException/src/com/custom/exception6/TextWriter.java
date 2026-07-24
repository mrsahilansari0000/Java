package com.custom.exception6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {
	public static void main(String[] args) {
		String fileUrl = "C:\\Users\\mrsah\\eclipse-workspace\\CustomException\\src\\com\\custom\\exception6\\PhoneBook.txt";
		try {
			BufferedWriter writeFile = new BufferedWriter(new FileWriter(fileUrl));
			writeFile.write("Hello");
			writeFile.newLine();
			writeFile.write("World");
			writeFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
