package com.dev.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dev.springboot.beans.Car;

@SpringBootApplication
public class Day1SpringApp13Application {

	public static void main(String[] args) {
		System.out.println(" Main class executed....");
		
		//Old Method
		
		//Car c=new Car();
		
		// Operation
		
		ConfigurableApplicationContext context= 
				SpringApplication.run(Day1SpringApp13Application.class, args);
		Car car=context.getBean(Car.class);
		
		car.show();
	}

}
