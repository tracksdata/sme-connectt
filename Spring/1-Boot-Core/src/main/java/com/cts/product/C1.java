package com.cts.product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class C1 {
	
	@Value("${name}")
	private String personName;
	
	public C1() {
		System.out.println(">>>> C1 class object created...");
	}
	
	@Bean
	public void test() {
		System.out.println(">>>> Name is ::: "+personName);
	}

}
