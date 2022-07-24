package com.Mr_stark.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Mr_stark.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {
	
	@RequestMapping("/readObject")
	public ModelAndView sendObj() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		Employee employee = new Employee();
		employee.setId(123456);
		employee.setName("Checker");
		employee.setSalary(18923);
		modelAndView.addObject("employee", employee);
		return modelAndView;
	};
}
