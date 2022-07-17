package com.Mr_stark.springcore.AmbiguityProblems;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext shopping = new ClassPathXmlApplicationContext("com/Mr_stark/springcore/AmbiguityProblems/config.xml");
		Addition add = (Addition) shopping.getBean("addition");
		System.out.println(add);
	}

}
