package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductRepository;
import com.cts.product.entity.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		ProductRepository prodDao = ac.getBean(ProductRepository.class);
		
		Product p1=new Product();
		p1.setName("Pen");
		p1.setPrice(65);
		p1.setDescription("Ball Pen");
		
		Product p2=new Product("Laptop", "Sony", 45000);
		Product p3=new Product("Mobile", "Samsung", 12000);
		Product p4=new Product("Tab", "Apple", 70000);

		
		// find all Products
		
		//prodDao.findAll().forEach(product->{
			//System.out.println(product);
		//});
		
		// find single object
		
		//Product product = prodDao.findById(2).orElse(null);
		//System.out.println(product);
		
		//prodDao.save(p1);
		//prodDao.save(p2);
		//prodDao.save(p3);
		//prodDao.save(p4);
		
		//prodDao.findByPriceGreaterThan(15000).forEach(product->{
			//System.out.println(product);
		//});
		
		//prodDao.findByName("%a%").forEach(product->{
			//System.out.println(product);
		//});
		
		
		
	}

}
