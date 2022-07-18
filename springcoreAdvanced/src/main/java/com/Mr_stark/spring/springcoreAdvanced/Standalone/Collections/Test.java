package com.Mr_stark.spring.springcoreAdvanced.Standalone.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_stark/spring/springcoreAdvanced/Standalone/Collections/config.xml");
		ProductList products = (ProductList)context.getBean("prod");
		System.out.println(products);
	}

}
