package com.Mr_stark.springcore.propertyPlaceholder.Activity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_stark/springcore/propertyPlaceholder/Activity/config.xml");
		External external = (External)context.getBean("external");
		System.out.println(external);
	}
}
