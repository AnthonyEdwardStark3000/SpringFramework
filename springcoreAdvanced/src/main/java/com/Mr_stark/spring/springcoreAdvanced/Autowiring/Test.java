package com.Mr_stark.spring.springcoreAdvanced.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_stark/spring/springcoreAdvanced/Autowiring/config.xml");
		Employee e = (Employee)context.getBean("employee");
		System.out.println(e);
	}	

}
