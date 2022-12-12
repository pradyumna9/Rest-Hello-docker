package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/docker/in")
	public String getMessage() {
		return "Welcome to Docker World"; 
	}
}
