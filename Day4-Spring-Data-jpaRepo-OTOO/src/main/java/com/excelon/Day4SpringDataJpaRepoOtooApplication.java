package com.excelon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Day4SpringDataJpaRepoOtooApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(Day4SpringDataJpaRepoOtooApplication.class, args);
		
		PersonService personService=ctx.getBean(PersonService.class);
		//personService.saveData();
		personService.delete();
	}

}
