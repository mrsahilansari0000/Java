package com.sql.query;

import java.util.Scanner;

public class SqlQuery {
	StringBuilder sqlQuery = new StringBuilder("SELECT * FROM employees WHERE ");
    static Scanner sc = new Scanner(System.in);
	public void employeeId (String _employeeId) {
		sqlQuery.append("employee Id = "+_employeeId);
		System.out.println(sqlQuery);
	}
	
	public static void main(String[] args) {
		SqlQuery query = new SqlQuery();
		System.out.println("Enter Employee Id");
		String id = sc.nextLine();
		query.employeeId(id);

	}

}
