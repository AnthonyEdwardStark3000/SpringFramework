package com.Mr_stark.springcore.list;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_stark/springcore/list/Listconfig.xml");
		Hospital h = (Hospital) context.getBean("hospital");
		System.out.println("Hospital Name Is :\n"+h.getName()+"\nDepartments there is :");
		List<String> departments = h.getDepartments();
		for(String d: departments){
			System.out.println(d);
		}
	}

}
