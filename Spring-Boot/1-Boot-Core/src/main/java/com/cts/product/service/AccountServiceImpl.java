package com.cts.product.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class AccountServiceImpl implements ProductService {

	@Override
	public void f1() {

		System.out.println(">>>>>>> AccountServiceImpl f1 method");

	}

}
