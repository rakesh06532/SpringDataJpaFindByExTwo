package com.ex.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	//select product_code, product_cost from product where product_name=?
	List<MyView> findByProductName(String productName);
	
	interface MyView {
		Integer getProductCode();
		Double getProductCost();
	}
	
	//select product_code, product_name, product_qnty from product where product_cost=?
	//List<MyViewTwo> findByProductCost(Double productCost);
	
	interface MyViewTwo {
		Integer getProductCode();
		String getProductName();
		Integer getProductQnty();
	}
	
	//Generic method using JDK 1.5 version
	<T> List<T> findByProductCost(Double cost, Class<T> cls);

}
