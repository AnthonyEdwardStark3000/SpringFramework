package com.Mr_stark.springcore.LifeCycle.xmlConfig.Interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class patientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_stark/springcore/LifeCycle/xmlConfig/Interfaces/lifecycleConfig.xml");
		Patient patientValue = (Patient) context.getBean("patient");
		System.out.println(patientValue);
		context.registerShutdownHook();
	}

}
