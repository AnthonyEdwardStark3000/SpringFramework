package com.Mr_stark.springcore.Set;

import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext car = new ClassPathXmlApplicationContext("com/Mr_stark/springcore/Set/carconfig.xml");
		CarDealer cars = (CarDealer) car.getBean("carDealer");
		System.out.println("Dealer is :\n"+cars.getName()+"\nHe manufactures :");
		Set<String> carmodels = cars.getModels();
		for(String model: carmodels){
			System.out.println(model);
		}
	}

}
