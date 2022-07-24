package com.Mr_stark.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Mr_stark.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee employee = new Employee();
		employee.setId(123456);
		employee.setName("Checker");
		employee.setSalary(18923);

		Employee employee2 = new Employee();
		employee2.setId(123456);
		employee2.setName("Checker2");
		employee2.setSalary(100);

		Employee employee3 = new Employee();
		employee3.setId(123456);
		employee3.setName("Checker3");
		employee3.setSalary(200);

		Employee employee4 = new Employee();
		employee4.setId(123456);
		employee4.setName("Checker4");
		employee4.setSalary(300);

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);

		modelAndView.addObject("employees", employees);
		return modelAndView;
	};
}
