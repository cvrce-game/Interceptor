package com.example.Interceptor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hi Welcome!!!";
	}
}
