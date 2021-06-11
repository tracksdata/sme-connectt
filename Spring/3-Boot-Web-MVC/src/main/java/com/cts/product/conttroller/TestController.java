package com.cts.product.conttroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String f1(Model model) {
		String name="Praveen";
		model.addAttribute("uname",name);
		return "index";
	}
	
	

}
