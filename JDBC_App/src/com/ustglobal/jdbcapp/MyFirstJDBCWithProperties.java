package com.ustglobal.jdbcapp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyFirstJDBCWithProperties {
	public static void main(String[] args) {
		Connection conn = null;	//reference vars interfaces
		Statement stmt = null;	//reference vars interfaces
		ResultSet rs = null;	//reference vars interfaces
		FileReader reader = null;
		
		try {//JDBC starts from here
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			String driver = prop.getProperty("driver-class-name");
			Class.forName(driver);
			
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);
			
			String sql = "select * from employee_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
			
				int id = rs.getInt(1);		
				String name = rs.getString("name");		
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				System.out.println("ID     : "+id);
				System.out.println("Name   : "+name);
				System.out.println("Salary : "+sal);
				System.out.println("Gender : "+gender);
				System.out.println("******************");
			} 
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}finally {
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
	}
}
