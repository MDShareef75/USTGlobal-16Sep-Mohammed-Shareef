package com.ust.springrest.service;

import java.util.List;

import com.ust.springrest.dto.EmployeeBean;

public interface EmployeeService {
	public boolean addEmployee(EmployeeBean bean);
	public boolean modifyEmployee(EmployeeBean bean);
	public boolean deleteEmployee(int id);
	public EmployeeBean getEmployee(int id);
	public List<EmployeeBean> getAllEmployee();

}
