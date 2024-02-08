package com.app;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//convertObjToJson();
		convertJsonToObj();

	}
	
	public static void  convertJsonToObj() throws Exception
	{
		File f=new File("user.json");
		ObjectMapper mapper=new ObjectMapper();
		User user=mapper.readValue(f, User.class);
		
		System.out.println(user);
	
	}

	public static void  convertObjToJson() throws Exception
	{
	User u=new User(101, "Ramana", "Male", 983726383L);
	ObjectMapper mapper=new ObjectMapper();
	mapper.writeValue(new File("user.json"), u);
	System.out.println("Java Object converted to Json.........");
	}
}
