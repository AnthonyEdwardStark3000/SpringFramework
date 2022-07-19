package com.Mr_stark.spring.springcoreAdvanced.Injecting.Interfaces;

public class OrderBOImpl implements OrderBO {

	private OrderDAO dao;

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public void placeOrder() {
		System.out.println("Inside Order BO");
		dao.createOrder();
	}

}
