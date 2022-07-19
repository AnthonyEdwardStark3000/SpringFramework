package com.Mr_stark.spring.springcoreAdvanced.Injecting.Interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_stark/spring/springcoreAdvanced/Injecting/Interfaces/config.xml");
		OrderBO bo = (OrderBO) context.getBean("bo");
		bo.placeOrder();
	}

}
