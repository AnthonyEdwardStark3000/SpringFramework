package com.Mr_stark.springcore.map;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class cusomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_stark/springcore/map/customerconfig.xml");
		cutomer customers = (cutomer) context.getBean("customer");
		System.out.println(customers.getId()+" :"+customers.getProducts());
	}

}
