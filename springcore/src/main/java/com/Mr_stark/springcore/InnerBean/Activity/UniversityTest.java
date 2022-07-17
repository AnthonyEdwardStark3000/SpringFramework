package com.Mr_stark.springcore.InnerBean.Activity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UniversityTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_stark/springcore/InnerBean/Activity/UniversityConfig.xml");
		University university = (University) context.getBean("university");
		System.out.println(university.hashCode());
		
		University university2 = (University) context.getBean("university");
		System.out.println(university2.hashCode());
		
		context.registerShutdownHook();
		
	}

}
