package com.ex.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ex.repo.ProductRepository;
import com.ex.repo.ProductRepository.MyView;
import com.ex.repo.ProductRepository.MyViewTwo;

@Component
public class ProductTestRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
//		List<MyView> data=repo.findByProductName("Book");
//		for(MyView m:data) {
//			System.out.println("Product Code: "+m.getProductCode()+" and Product Cost: "+m.getProductCost());
//		}
		
//		List<MyViewTwo> list= repo.findByProductCost(34.80000);
//		for(MyViewTwo m1:list) {
//			System.out.println(m1.getProductName()+"  "+m1.getProductCode()+"  "+m1.getProductQnty());
//		}
		
		List<MyView> data=repo.findByProductCost(34.8, MyView.class);
		for(MyView m:data) {
			System.out.println(m.getProductCode()+" "+m.getProductCost());
		}
		
		
		System.out.println("=========================");
		List<MyViewTwo> list=repo.findByProductCost(34.8, MyViewTwo.class);
		for(MyViewTwo m1:list) {
			System.out.println(m1.getProductName()+"  "+m1.getProductCode()+"  "+m1.getProductQnty());
		}
	}

	}
