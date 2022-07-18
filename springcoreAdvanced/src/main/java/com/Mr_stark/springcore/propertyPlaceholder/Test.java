package com.Mr_stark.springcore.propertyPlaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_stark/springcore/propertyPlaceholder/config.xml");
		MyDAO dao = (MyDAO)context.getBean("dao");
		System.out.println(dao);
	}
}
