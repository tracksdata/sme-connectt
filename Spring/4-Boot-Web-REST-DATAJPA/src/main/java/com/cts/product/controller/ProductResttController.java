package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.dao.ProductRepository;
import com.cts.product.entity.Product;

@RestController
@CrossOrigin()
@RequestMapping("/api/products")
public class ProductResttController {
	
	
	@Autowired
	private ProductRepository prodDao;
	
	@GetMapping("/{id}")
	public Product f6(@PathVariable int id) {
		System.out.println(">>>>>>> ID::: "+id);
		return prodDao.findById(id).orElse(null);
	}
	
	
	
	
	@GetMapping
	public List<Product> f1() {
		return prodDao.findAll();
	}
	
	@PostMapping
	public Product f2(@RequestBody Product product) {
		System.out.println(product);
		return prodDao.save(product);
	}
	
	@PutMapping
	public String f3() {
		return "PUT MAPPING DATA";
	}
	
	@PatchMapping
	public String f4() {
		return "PATCH MAPPING DATA";
	}
	
	@DeleteMapping
	public String f5() {
		return "DELETE MAPPING DATA";
	}

}
