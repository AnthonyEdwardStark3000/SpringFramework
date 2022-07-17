package com.Mr_stark.springcore.InnerBean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FinalTest {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_stark/springcore/InnerBean/config.xml");
		Employee prescriptions = (Employee) context.getBean("employee");
		System.out.println(prescriptions.hashCode());
		
		Employee prescriptions2 = (Employee) context.getBean("employee");
		System.out.println(prescriptions2.hashCode());
		
		context.registerShutdownHook();
	}

}
