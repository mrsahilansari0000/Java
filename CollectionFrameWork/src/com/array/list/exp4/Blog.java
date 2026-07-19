package com.array.list.exp4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Blog {
	static Scanner sc = new Scanner(System.in);
     public void writeBlog() {
    	 String fileUrl = "C:\\Users\\mrsah\\eclipse-workspace\\CollectionFrameWork\\src\\com\\array\\list\\exp4\\BlogPage.txt";
    	 try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileUrl));
			System.out.println("Write Your Blog Here:");
			String blogContent = sc.nextLine();
			writer.newLine();
			writer.append(blogContent);
			writer.close();
		}
    	 catch (IOException e) {
			e.printStackTrace();
		}
     }
}
