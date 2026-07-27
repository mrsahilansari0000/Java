package com.amazon;

import java.util.ArrayList;

public class AmazonDataBase {
	public void getDataBase() {
		ArrayList<Amazon> userDetail = new ArrayList<Amazon>();
		
		Amazon user1 = new Amazon("rahulkumar@gmail.com", "rahul@123");
		Amazon user2 = new Amazon("kiransharma@gmail.com", "kiran@123");
		
		userDetail.add(user1);
		userDetail.add(user2);

	}
}
