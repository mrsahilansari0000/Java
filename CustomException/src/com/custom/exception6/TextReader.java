package com.custom.exception6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {
	static String readLine;
	public static void main(String[] args) throws IOException {
		String fileUrl = "C:\\Users\\mrsah\\eclipse-workspace\\CustomException\\src\\com\\custom\\exception6\\FileSource.txt";
		try {
			BufferedReader readFile = new BufferedReader(new FileReader(fileUrl));
			while ((readLine = readFile.readLine())!=null) {
                System.out.println(readLine);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
