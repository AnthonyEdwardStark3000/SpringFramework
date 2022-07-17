package com.Mr_stark.springcore.LifeCycle.xmlConfig.Activity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TRTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_stark/springcore/LifeCycle/xmlConfig/Activity/TRconfig.xml");
		context.getBean("TicketReservation");
		context.registerShutdownHook();
	}

}
