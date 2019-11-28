package com.ust.assignment.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {

	public static void main(String[] args) {
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);

			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//String sql = " insert into employee_info values (8,'giridhara',10000,'m') ";
			String sql = " insert into employee_info values (?,?,?,?) ";//dynamic inputs
			
			//stmt = conn.createStatement();
			//for dynamic
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			//dynamic ends
			
			
			//int count = stmt.executeUpdate(sql);
			int count = pstmt.executeUpdate();
			
			System.out.println(count + " Row(s) inserted ");
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if (conn!=null) {
					conn.close();
				}
//				if (stmt!=null) {
//					conn.close();
//				}
				if (pstmt!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
