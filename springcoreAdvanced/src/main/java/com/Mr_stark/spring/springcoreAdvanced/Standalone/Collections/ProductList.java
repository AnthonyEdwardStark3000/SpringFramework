package com.Mr_stark.spring.springcoreAdvanced.Standalone.Collections;

import java.util.List;

public class ProductList {
	List<String> ProductNames;

	public List<String> getProductNames() {
		return ProductNames;
	}

	public void setProductNames(List<String> productNames) {
		ProductNames = productNames;
	}

	@Override
	public String toString() {
		return "ProductList [ProductNames=" + ProductNames + "]";
	}
}
