package com.Mr_stark.springcore.activity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_stark/springcore/activity/countyConfig.xml");
		Country countries = (Country) context.getBean("county");
		System.out.println(countries.getId()+" : "+countries.getCountyVal());
	}

}
