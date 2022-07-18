package com.Mr_stark.spring.springcoreAdvanced.Autowiring.Activity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_stark/spring/springcoreAdvanced/Autowiring/Activity/config.xml");
		Reservation res = (Reservation)context.getBean("reservation");
		System.out.println(res);
	}

}
