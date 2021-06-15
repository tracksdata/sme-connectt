package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.service.ProductService;
import com.cts.product.service.TestServiceImpl;

@SpringBootApplication // Auto Discovery
public class Application {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(Application.class, args);
		
		TestServiceImpl ps1 = ac.getBean(TestServiceImpl.class);
		//ProductService ps2 = ac.getBean(ProductService.class);
		
		ps1.process();
		//ps2.f1();
		

		

	}

}
