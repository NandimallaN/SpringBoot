package com.dev.springboot.beans;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	public Engine()
	{
		System.out.println("Engine :: Constructor method");
	}

	 public int start()
	 {
		 System.out.println("Engine starting........");
		 return 1;
	 } 
}
