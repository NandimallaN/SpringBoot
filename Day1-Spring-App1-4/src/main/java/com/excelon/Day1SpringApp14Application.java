package com.excelon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.excelon","app.com.abc"})
public class Day1SpringApp14Application {

	public static void main(String[] args) {
		SpringApplication.run(Day1SpringApp14Application.class, args);
		System.out.println(" Main method is executed");
	}

}
