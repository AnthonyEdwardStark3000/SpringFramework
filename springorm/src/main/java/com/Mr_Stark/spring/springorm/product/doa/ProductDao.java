package com.Mr_Stark.spring.springorm.product.doa;

import java.util.List;

import com.Mr_Stark.spring.springorm.product.entity.Product;

public interface ProductDao {
	int create(Product product);
	void update(Product product);
	void delete(Product product);
	Product find(int id);
	List<Product> findAll(Product product);
}
