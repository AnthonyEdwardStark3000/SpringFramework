package com.Mr_stark.springcore.map;

import java.util.Map;

public class cutomer {
	private int id;
	private Map<Integer, String> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Integer, String> getProducts() {
		return products;
	}

	public void setProducts(Map<Integer, String> products) {
		this.products = (Map<Integer, String>) products;
	}
}
