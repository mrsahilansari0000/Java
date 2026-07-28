package com.checked.exception2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//class MyException extends Exception{
//	MyException(String ex){
//		super(ex);
//	}
//}

public class ProductDetails {
	public void getProductDetails(){
		String filePath = "C:\\Users\\mrsah\\eclipse-workspace\\ExceptionHandling\\src\\com\\checked\\exception2\\product_details";
		try {
			// BufferReader - > Read The File, BufferReader Class have many methods like - > readLine
			BufferedReader read = new BufferedReader(new FileReader(filePath)); // FileReader -> Open The File
			String line;
			if((line = read.readLine())==null) {
				//throw new MyException("File Is Empty");
				System.err.println("File Is Empty");
			}
			//System.out.println("Product Code"+" Product Name");
			int i=1;
			while((line = read.readLine())!=null) {
				i++;
				String lineArr[] = line.split(",");
				String companyProduct = lineArr[1];
				if(companyProduct.equals("Samsung")) {
					System.out.println(line);
					//System.out.println(lineArr[0]+" "+lineArr[1]);
				}
			}
			System.out.println("While Loop Run "+i+" "+"times");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    public static void main(String[] args) {
    	ProductDetails data = new ProductDetails();
    	data.getProductDetails();
	}
}
