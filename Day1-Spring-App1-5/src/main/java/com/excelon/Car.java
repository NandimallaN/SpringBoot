package com.excelon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car {
	//Type 1 DI
	//@Autowired
	//private Engine eng;
	
	//Type 2
	//private Engine eng;
	
	@Autowired
	//public void setEng(Engine eng) {
	//	this.eng = eng;
	//}
	
	//Type 3
	private Engine eng;
	
	
	public Car(){
        System.out.println("Car :: 0 - Constructor");
    }

	@Autowired
	public Car(Engine eng)
	{
		this.eng=eng;
		System.out.println("Car Class : Constructor...");
	}
	
	public void drive() {
		int start = eng.start();
		if (start >= 1) {
			System.out.println("Journey Started....");
		}
	}
}
