package com.Mr_Stark.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Mr_Stark.spring.springorm.product.doa.ProductDao;
import com.Mr_Stark.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_Stark/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDoa");
		Product product = new Product();
//		product.setId(1);
//		product.setName("Iphone");
//		product.setDesc("Waste");
//		product.setPrice(1500);
//		productDao.create(product);
	//	productDao.update(product);
//		productDao.delete(product);
//		Product product = productDao.find(1);
		List<Product> products = productDao.findAll(product);
		for(Product p:products){
			System.out.println(p);			
		}
		
	}

}
