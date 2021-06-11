package com.cts.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.product.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer>{

	List<Product> findByPriceGreaterThan(double price);
	
	@Query(value = "from Product p where p.name like :name")
	List<Product> findByName(String name);
	
}
