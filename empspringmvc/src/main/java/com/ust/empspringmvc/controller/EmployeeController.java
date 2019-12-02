package com.ust.empspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.method.annotation.InitBinderDataBinderFactory;

import com.ust.empspringmvc.dto.EmployeeBean;
import com.ust.empspringmvc.service.EmployeeService;
import com.ust.empspringmvc.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}


	@GetMapping("/login") //to configure Get method
	public String loginPage() {
		return "login";
	}//end of login page



	@PostMapping("/login")
	public String login(int id,String password,HttpServletRequest request) {

		EmployeeBean bean = service.login(id, password);

		if(bean == null) {

			request.setAttribute("msg", "invalid Credentials");
			return "login";

		}else {

			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";

		}
	}//end of login


	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}//end of register page


	@PostMapping("/register")
	public String register(EmployeeBean bean,ModelMap map) {

		int check = service.register(bean);

		if(check>0) {
			map.addAttribute("msg","you are registered and ID is "+check);
		}else {
			map.addAttribute("msg","Email is repeated");
		}

		return "login";

	}//end of register


	@GetMapping("/home")
	public String home(ModelMap map , @SessionAttribute(name = "bean",required = false) EmployeeBean bean) {

		if(bean == null) {
			map.addAttribute("msg","Login First!!!!");
			return "login";
		}else {
			return "home";
		}
	}//end of home


	@PostMapping("/home")
	public String home() {
		return "home";
	}//end of home


	@GetMapping("/search")
	public String search(@RequestParam("id")int id,ModelMap map) {

		EmployeeBean bean = service.searchEmployee(id);

		if(bean == null) {
			map.addAttribute("msg","Data Not Found..!");
		}else {
			map.addAttribute("bean",bean);
		}

		return "home";
	}//end of search


	@GetMapping("/logout")
	public String logout(HttpSession session) {

		session.invalidate();
		return "login";

	}//end of logout



	@GetMapping("/delete")
	public String deleteProfile(HttpSession session) {

		EmployeeBean bean = (EmployeeBean)session.getAttribute("bean");

		try {
			service.deleteEmployee(bean.getId());
		}catch (Exception e) {
			e.printStackTrace();
		}

		session.invalidate();
		return "login";

	}//end of delete


	@PostMapping("changepassword")
	public String change(@SessionAttribute(name= "bean", required = false) EmployeeBean bean,ModelMap map,String password) {
		if(bean!=null) {
			service.changePassword(bean.getId(), password);
			map.addAttribute("msg", "password changed");
			return "home";
		}else {
			map.addAttribute("msg", "Login First");
			return "login";
		}
	}
	@GetMapping("changepassword")
	public String change(HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		if(session!=null) {
			return "changepassword";
		}else {
			return "login";
		}
	}

	@GetMapping("/update")
	public String update(HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		if(session!=null) {
			return "updateprofile";
		}else {
			return "login";
		}
	}
	@PostMapping("/update")
	public String update(@SessionAttribute(name= "bean", required = false) EmployeeBean bean,ModelMap map,String name,String gender,Date doj) {
		if(bean!=null) {
			EmployeeBean bean2=bean;
			bean2.setDoj(doj);
			bean2.setGender(gender);
			bean2.setName(name);

			service.updateEmployee(bean2);
			map.addAttribute("msg", "Profile is Updated");
			return "home";
		}else {
			map.addAttribute("msg", "profile is not updated!!");
			return "home";
		}
	}

}
