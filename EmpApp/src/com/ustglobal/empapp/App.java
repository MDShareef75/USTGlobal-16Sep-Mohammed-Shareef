package com.ustglobal.empapp;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Press 1 to get all employee data ");
		System.out.println("Press 2 to insert employee data ");
		System.out.println("Press 3 to update employee data ");
		System.out.println("Press 4 to delete employee data ");
		System.out.println("Press 5 to search employee data ");
		
		Scanner s = new Scanner(System.in);
		int ch = s.nextInt();
		
		switch (ch) {
		case 1:
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			//EmployeeDAOImpl imp1 = new EmployeeDAOImpl();
			java.util.List<EmployeeBean> result = dao.getAllEmployeeData();
		
			for(EmployeeBean bean :result) {
				System.out.println("id : "+bean.getId());
				System.out.println("name : "+bean.getName());
				System.out.println("salary : "+bean.getSal());
				System.out.println("gender : "+bean.getGender());
				System.out.println("******************************");
			}
			break;

		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			int id = s.nextInt();
			EmployeeBean bean = dao5.searchEmployeeData(id);
			if (bean!=null) {
				System.out.println("id : "+bean.getId());
				System.out.println("name : "+bean.getName());
				System.out.println("salary : "+bean.getSal());
				System.out.println("gender : "+bean.getGender());
				System.out.println("*******************************");
			}else {
				System.out.println("no data found");
			}
			break;
		default:
			
		}
	}
}
