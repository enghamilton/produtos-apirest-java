package com.produtos.apirest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	//@RequestMapping(value = "/main", method = RequestMethod.GET)
	@RequestMapping("/main")
	public String redirect() {
		return "redirect:main";
	}	
	
	//@RequestMapping(value = "/profile", method = RequestMethod.GET)
	@RequestMapping("/profile")
	public String display() {
		return "profile";
	}
	
}
