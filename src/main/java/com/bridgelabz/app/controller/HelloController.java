package com.bridgelabz.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping(value = {"","/","/home"})
	public String sayHello() {
		return "Hello";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"/query"})
	public String sayHello(@RequestParam(value = "name") String name) {
		return "Hello "+name+"!";
		
	}

}
