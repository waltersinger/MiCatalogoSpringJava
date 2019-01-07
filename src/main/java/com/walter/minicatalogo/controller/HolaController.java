package com.walter.minicatalogo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi, how are you";
	}
	
	@RequestMapping("/goodbye")
	public String syGoodBye() {
		return "bye bye";
	}
	
}
