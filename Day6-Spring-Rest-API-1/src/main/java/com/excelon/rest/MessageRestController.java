package com.excelon.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MessageRestController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		return " Welcome to ExceoN First Rest Service ";
	}

	
	
	
}
