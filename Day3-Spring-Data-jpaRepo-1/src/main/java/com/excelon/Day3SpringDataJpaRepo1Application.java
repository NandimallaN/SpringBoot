package com.excelon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.excelon.service.ProductService;

@SpringBootApplication
public class Day3SpringDataJpaRepo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= 
				SpringApplication.run(Day3SpringDataJpaRepo1Application.class, args);
		
		ProductService productService=context.getBean(ProductService.class);
		
		//productService.saveProducts();
		//System.out.println(" All products are saved");
		
		//productService.getProducts();
		//productService.pagination(2);
		productService.qbeEx("HDD");
	}

}
