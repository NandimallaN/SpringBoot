package com.excelon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.excelon.entities.Product_Master;
import com.excelon.repo.ProductRepo;

@SpringBootApplication
public class Day3SpringDataJpaRepo2TimeStapApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(Day3SpringDataJpaRepo2TimeStapApplication.class, args);
		
		ProductRepo prodrepo=context.getBean(ProductRepo.class);
		
		Product_Master prod = prodrepo.findById(101).get();	
		prod.setActiveSw("SSD");
		prodrepo.save(prod);
		
		System.out.println(" product is Uodated.............");
	}

}
