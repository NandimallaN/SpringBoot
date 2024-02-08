package com.excelon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.excelon.service.PersonService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.excelon"})
public class Day3SpringDataJpaRepo2Composite1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(Day3SpringDataJpaRepo2Composite1Application.class, args);
		
		PersonService service=ctx.getBean(PersonService.class);
		
		//service.savePerson();
		service.getPerson();
	}

}
