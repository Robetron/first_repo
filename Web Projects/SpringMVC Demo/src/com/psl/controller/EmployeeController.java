package com.psl.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.psl.beans.Employee;
import com.psl.service.EmployeeService;
//		Path is http://localhost:8080/SpringMVC Demo/home
//		Servlet context path: http://localhost:8080/SpringMVC Demo
//		URL pattern: /home or /employee/home

@Controller
// @RequestMapping(value="/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String showHomepage(Model model) {
		System.out.println("In EmployeeController.showHomepage()");
		model.addAttribute("message", "Hello World");
		model.addAttribute("dept", "IT");
		model.addAttribute("employee", new Employee());

		List<Employee> list = employeeService.getAllEmployees();
		model.addAttribute("list", list);
		return "home";
	}

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.POST)
	public String register(Model model, @Valid @ModelAttribute Employee emp, BindingResult result) {
		System.out.println("In EmployeeController.register() " + emp);
		// Send e to db
		if (result.hasErrors())
			return "home";
		else {
			employeeService.createEmployee(emp);
			return "redirect:/home";
		}
	}

	@RequestMapping(value = "/{employeeName}", method = RequestMethod.GET)
	public String showEmployeePage(Model model,
			@PathVariable String employeeName, @RequestParam String param_dept) {
		System.out.println("In EmployeeController.showEmployeePage()\tClicked "
				+ employeeName);
		model.addAttribute("message", "Hello " + employeeName);
		model.addAttribute("dept", param_dept);
		return "employee";
	}
}
