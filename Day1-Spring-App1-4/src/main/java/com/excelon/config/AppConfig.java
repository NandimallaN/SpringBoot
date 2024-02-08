package com.excelon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.excelon.utils.AppUtils;

@Configuration 
public class AppConfig {
	public AppConfig()
	{
		System.out.println("Appconfig :: Constructor..");
	}

	
	@Bean
	public AppUtils createAppUtils()
	{
		System.out.println("Created Utils method is called");
		
		AppUtils au=new AppUtils();
		//logic
		return au;
	}
}
