package com.excelon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	
	
	public MsgController()
	{
		System.out.println(" MsgController : Constructor.........");
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "All the best..!!");
		mav.setViewName("home");

		return mav;
	}

	
	@GetMapping("/home")
	public ModelAndView getWelcomeMsg() {

		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg"," This is exceon soluations...page1");
		
		mav.setViewName("home");
		
		return mav;
	}
}
