package com.Mr_stark.springcore.reftypes;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_stark/springcore/reftypes/ReferenceConfig.xml");
		Student student = (Student) context.getBean("student");
		
		System.out.println(student.getScores());
		
	}

}
