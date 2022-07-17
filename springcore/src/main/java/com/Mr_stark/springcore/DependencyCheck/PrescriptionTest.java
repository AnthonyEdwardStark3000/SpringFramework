package com.Mr_stark.springcore.DependencyCheck;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrescriptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_stark/springcore/DependencyCheck/PrescriptionConfig.xml");
		Prescription prescriptions = (Prescription) context.getBean("prescription");
		System.out.println(prescriptions);
		context.registerShutdownHook();
	}

}
