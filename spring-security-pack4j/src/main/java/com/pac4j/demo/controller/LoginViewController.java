package com.pac4j.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginViewController {
	
	@RequestMapping(value = "/login")
	public String displayLoginPage(ModelMap model){
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "index";
	}

}
