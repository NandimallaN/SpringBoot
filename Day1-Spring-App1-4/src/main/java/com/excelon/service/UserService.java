package com.excelon.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.excelon.utils.AppUtils;

@Component
public class UserService {
	public UserService()
	{
		System.out.println("UserService:: Constructor");
	}

	@Bean
	public AppUtils createAppUtils2()
	{
		System.out.println("Created Utils method is called");
		
		AppUtils au=new AppUtils();
		//logic
		return au;
	}
	
}
