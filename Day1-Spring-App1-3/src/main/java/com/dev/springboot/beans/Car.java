package com.dev.springboot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	Engine eng;
	
	public Car()
	{
		System.out.println("Car :: Constructor Executed");
	}
	
	public void show()
	{
		
		int start=eng.start();
		if(start>=1)
		System.out.println(" Journy is started ......");
	}

}
