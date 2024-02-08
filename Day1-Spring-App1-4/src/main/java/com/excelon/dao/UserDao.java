package com.excelon.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.excelon.utils.AppUtils;

@Repository
public class UserDao {
	public UserDao()
	{
		System.out.println("User DAO  : Constructor");
	}

	@Bean
	public AppUtils createAppUtils1()
	{
		System.out.println("Created Utils method is called");
		
		AppUtils au=new AppUtils();
		//logic
		return au;
	}
	
}
