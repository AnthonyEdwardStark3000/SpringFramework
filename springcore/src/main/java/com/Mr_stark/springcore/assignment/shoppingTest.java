package com.Mr_stark.springcore.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class shoppingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext shopping = new ClassPathXmlApplicationContext("com/Mr_stark/springcore/assignment/shoppingList.xml");
		ShoppingCart shop = (ShoppingCart) shopping.getBean("shoppingcart");
		System.out.println(shop);
	}

}
