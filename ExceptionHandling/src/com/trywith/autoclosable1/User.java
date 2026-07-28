package com.trywith.autoclosable1;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 * @author
 * 
 * 
 */
public class User {
     public static void main(String[] args) {
    	 String fileUrl = "C:\\Users\\mrsah\\eclipse-workspace\\ExceptionHandling\\src\\com\\trywith\\autoclosable1\\sample_text.txt";
    	 // Try With Resources Introduce in java -ver 7 even if we don't closing the connection using finally
    	 // It automatically close the all connection
    	 // using try with resources class must be auto closable
		try(
			BufferedReader read = new BufferedReader(new FileReader(fileUrl));
		 // Not Allow Because User Class is Not AutoClosable Here
         // When Use Extends AutoClosable Class Then It working Fine
		 //	User  obj = new User();
				// ctrl+shift+r --> all resources
				// ctrl+shift+o --> see all method of particular class
			)
		{
			String line;
			while((line=read.readLine())!=null){
				System.out.println(line);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
