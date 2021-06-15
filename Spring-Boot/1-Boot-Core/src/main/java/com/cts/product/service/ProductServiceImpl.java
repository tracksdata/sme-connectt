package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")
//@PropertySource(value = "application.properties")
@Profile(value = "prod")
public class ProductServiceImpl implements ProductService {
	
	//@Autowired
	//private Environment env;
	
	@Value("${name}")
	private String personName;
	
	@Value("${age}")
	private int maxAge;

	public ProductServiceImpl() {
		System.out.println(">>> ProductServiceImpl object created on "+System.identityHashCode(this));
	}
	
	@Override
	public void f1() {
		//System.out.println("<<<<>>>>> Name is "+env.getProperty("name"));
		System.out.println(">>>> Name:: "+personName);
		System.out.println(">>> Max Age:: "+maxAge);
		System.out.println("f1 method called on "+System.identityHashCode(this));
	}

}
