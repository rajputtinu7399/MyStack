package com.stackroute.demomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoMvcController {
	@GetMapping("/")
	public String showMsg(Model model) 
	{
		model.addAttribute("message", "hello bhai");
		
		return "index";
	}

}
