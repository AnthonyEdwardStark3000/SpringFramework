package com.Mr_Stark.spring.springorm.product.doa.impl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.Mr_Stark.spring.springorm.product.doa.ProductDao;
import com.Mr_Stark.spring.springorm.product.entity.Product;

@Component("productDoa")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

	@Transactional
	public Product find(int id) {
		Product product = hibernateTemplate.get(Product.class, id);
		return product;
	}

	@Transactional
	public List<Product> findAll(Product product) {
		List<Product> productList = hibernateTemplate.loadAll(Product.class);
		return productList;
	}

}
