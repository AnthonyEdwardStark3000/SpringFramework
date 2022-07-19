package com.Mr_stark.spring.springcoreAdvanced.Injecting.Interfaces;

public class OrderDAOImpl implements OrderDAO {


	@Override
	public void createOrder() {
		System.out.println("Inside order DAO createOrder()");
	}

}
