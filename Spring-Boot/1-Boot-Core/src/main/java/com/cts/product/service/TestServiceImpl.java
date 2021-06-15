package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl {

	@Autowired
	@Qualifier(value="productServiceImpl")
	private ProductService ps;
	
	
	@Bean
	public void loadData() {
		System.out.println(">>>>>>> loadData execuuted....");
	}

	public void process() {
		ps.f1();
	}

}
