package com.excelon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.excelon.service.EmpService;

@SpringBootApplication
public class Day4SpringDataJpaRepo1TxApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = 
				SpringApplication.run(Day4SpringDataJpaRepo1TxApplication.class, args);
		
		EmpService empService = context.getBean(EmpService.class);
		
		empService.saveData();
	}

}
