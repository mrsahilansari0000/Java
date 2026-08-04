package com.interfaces.example;

import java.util.ArrayList;

public class DataBase {
	private String id;
	private String pass;
	HDFC getIdPass;
	public boolean auth  = false;
	static ArrayList<HDFC> hdfcUser = new ArrayList<HDFC>();

	private void getDataBase() {
		HDFC rahul = new HDFC("rahul@hdfc", "1234", 25000);
		HDFC mohit = new HDFC("mohit@hdfc", "5454", 2000);
		HDFC sumit = new HDFC("sumit@hdfc", "7474", 500);
		HDFC ronak = new HDFC("ronak@hdfc", "3254", 1500);

		hdfcUser.add(rahul);
		hdfcUser.add(mohit);
		hdfcUser.add(sumit);
		hdfcUser.add(ronak);
	

	}

	public boolean dbConnection(String _id, String _pass) {
		getDataBase();
		for(int i=0; i<hdfcUser.size(); i++) {
			getIdPass = hdfcUser.get(i);
			id = getIdPass.getUserId();
			pass = getIdPass.getUserPass();
			System.out.println(id);
			if(id.equals(_id)&&pass.equals(_pass)) {
				auth = true;
				break;
			}
			
		}	
		return auth;
	}
}
