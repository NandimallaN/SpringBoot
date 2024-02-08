package com.excelon;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Day1SpringApp15Application implements InitializingBean,DisposableBean {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Day1SpringApp15Application.class, args);
		
		
		Car  car=context.getBean(Car.class);
		System.out.println(car.hashCode());
		car.drive();
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(" Destroy method is executed");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("After properties set..........");
		
	}

}
