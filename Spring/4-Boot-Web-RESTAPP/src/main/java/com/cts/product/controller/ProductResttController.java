package com.cts.product.controller;

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

import com.cts.product.model.Product;

@RestController
@CrossOrigin
@RequestMapping("/api/products")
public class ProductResttController {
	
	@GetMapping("/{id}")
	public String f6(@PathVariable int id) {
		System.out.println(">>>>>>> ID::: "+id);
		return "GET MAPPING DATA::: "+id;
	}
	
	
	
	
	@GetMapping
	public String f1() {
		return "GET MAPPING DATA";
	}
	
	@PostMapping
	public Product f2(@RequestBody Product product) {
		System.out.println(product);
		return product;
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
