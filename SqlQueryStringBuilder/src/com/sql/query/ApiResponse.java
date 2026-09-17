package com.sql.query;

public class ApiResponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuilder apiResponse = new StringBuilder();
        
        apiResponse.append("{status: success, ");
        apiResponse.append("data: { id: 123 }");
        System.out.println(apiResponse);
        if(apiResponse.equals(null)) {
        	System.out.println("Empty Response");
        }
	}

}
