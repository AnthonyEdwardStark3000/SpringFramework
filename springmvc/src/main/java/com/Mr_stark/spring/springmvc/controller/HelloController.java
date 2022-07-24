package com.Mr_stark.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // to make spring understand that it can create bean for handling Http req
public class HelloController {
	@RequestMapping("/hello") // telling spring to invoke this method while getting this http request
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello"); // contains the name of the view file . Here it is hello.jsp

		// Sending value from controller to UI
		modelAndView.addObject("id", 1230);
		modelAndView.addObject("name", "Mr.Stark");
		modelAndView.addObject("salary", 219271093);
		return modelAndView;
	}
}
