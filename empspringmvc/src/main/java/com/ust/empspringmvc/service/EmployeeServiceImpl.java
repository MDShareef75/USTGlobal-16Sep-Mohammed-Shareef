package com.ust.empspringmvc.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// service layer is used to add some functionality like validation and all
import com.ust.empspringmvc.dao.EmployeeDao;
import com.ust.empspringmvc.dao.EmployeeDaoImp;
import com.ust.empspringmvc.dto.EmployeeBean;

@Service // since this is service layer we can also use @Component
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public EmployeeBean login(int id, String password) {

		return dao.login(id, password);
	}

	@Override
	public int register(EmployeeBean bean) {

		//logic to check email and password
		return dao.register(bean);
	}

	@Override
	public boolean deleteEmployee(int id) {
		
		return dao.deleteEmployee(id);
	}

	@Override
	public EmployeeBean searchEmployee(int id) {
		
		return dao.searchEmployee(id);
	}

	@Override
	public boolean updateEmployee(EmployeeBean bean) {
		
		return dao.updateEmployee(bean);
	}

	@Override
	public boolean changePassword(int id, String password) {

		return dao.changePassword(id, password);
	}

}
