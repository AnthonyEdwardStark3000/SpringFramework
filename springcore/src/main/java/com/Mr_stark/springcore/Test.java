package com.Mr_stark.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml"); 
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Employee ID\t:"+emp.getId()+"\nEmployee Name\t:"+emp.getName());
	}
}
