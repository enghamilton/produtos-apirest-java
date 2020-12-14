package com.produtos.apirest.repository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	//@RequestMapping(value = "/main", method = RequestMethod.GET)
	@RequestMapping("/main")
	public String redirect() {
		return "main";
	}	
	
	//@RequestMapping(value = "/profile", method = RequestMethod.GET)
	@RequestMapping("/profile")
	public String display() {
		return "profile";
	}
	
}
