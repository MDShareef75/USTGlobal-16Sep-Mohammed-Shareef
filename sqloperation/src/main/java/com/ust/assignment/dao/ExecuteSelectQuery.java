package com.ust.assignment.dao;

import java.sql.*;
//import com.mysql.jdbc.Driver;

public class ExecuteSelectQuery {
	public static void main(String[] args) {
		Connection conn = null;	//reference vars interfaces
		Statement stmt = null;	//reference vars interfaces
		ResultSet rs = null;	//reference vars interfaces
		
		try {//JDBC starts from here

			//step 1: loading the driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2: get the connection
			//String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";		(or)
			String url = "jdbc:mysql://localhost:3307/ust_ty_db";
			//	protocol : sub-protocol : sub-name
			//	jdbc - protocol
			//	mysql - sub-protocol
			//	//localhost:3307/....&password=root - sub-name
				//	localhost - domain-name (IP address)
				//	3307 - port-number
				//	ust_ty_db - DB-name
				//  ?user=root&password=root - query-string //not mandatory
			//conn = DriverManager.getConnection(url);		(or)
			conn = DriverManager.getConnection(url, "root", "root");
			
			
			//step 3: Issue SQL query
			String sql = "select * from employee_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);//it creates object of type result set since it is interface
			
			
			//step 4: Read the results
			while(rs.next()) {
				//int id = rs.getInt("id");	//X -> rs.getX(String)	: we can pass String value here... X is the returnType
				int id = rs.getInt(1);		//X -> rs.getX(int) 	: we can pass Integer value here.. X is the returnType
				String name = rs.getString("name");		
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				System.out.println("ID     : "+id);
				System.out.println("Name   : "+name);
				System.out.println("Salary : "+sal);
				System.out.println("Gender : "+gender);
				System.out.println("******************");
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			
			//step 5: close all JDBC Objects 
			try {
				if (conn!=null) {
					conn.close();
				}
				if (stmt!=null) {
					stmt.close();
				}
				if (rs!=null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}//end of main
}
