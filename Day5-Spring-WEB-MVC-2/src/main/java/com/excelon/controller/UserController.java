package com.excelon.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.excelon.binding.Employee;

@Controller
public class UserController {
	
	// Path
	@GetMapping("/user")
	public ModelAndView getUserName() {
		ModelAndView mav = new ModelAndView();

		// set data to model
		mav.addObject("data", "Ashok");

		// set view name
		mav.setViewName("index");

		return mav;
	}
	
	@GetMapping("/email")
	public String getUserEmail(Model model)
	{
		model.addAttribute("data", "ashokitschool@gmail.com");
		return "index";
	}
	
	@GetMapping("/employee")
	public String getEmployee(Model model)
	{
		
		 Employee empObj=new Employee(101,"Ramana",1000.00);
		 
		model.addAttribute("emp1", empObj);
		return "emp";
	}

	//http://localhost:9090/employee1?empno=101&empname=Ramana&salary=1000
	
	@GetMapping("/employee1")
	public String getEmployee1(@RequestParam("empno") Integer empno,
			@RequestParam("empname") String empname,
			@RequestParam("salary") Double salary,
			Model model)
	{
		
		 Employee empObj=new Employee(empno,empname,salary);
		 
		model.addAttribute("emp1", empObj);
		return "emp";
	}
	
	//http://localhost:9090/employee2/101/Ramana/1000
	
	@GetMapping("/employee2/{empno}/{empname}/{salary}")
	public String getEmployee2(@PathVariable("empno") Integer empno,
			@PathVariable("empname") String empname,
			@PathVariable("salary") Double salary,
			Model model)
	{
		
		 Employee empObj=new Employee(empno,empname,salary);
		 
		model.addAttribute("emp1", empObj);
		return "emp";
	}
	
	
	
	@GetMapping("/employees")
	public String getEmployees(Model model)
	{
		
		 Employee empObj1=new Employee(101,"Ramana",1000.00);
		 Employee empObj2=new Employee(102,"Ramana",1000.00);
		 Employee empObj3=new Employee(103,"Ramana",1000.00);
		 Employee empObj4=new Employee(104,"Ramana",1000.00);
		 
		 List<Employee> empList=Arrays.asList(empObj1,empObj2,empObj3,empObj4);
		 
		model.addAttribute("empData", empList);
		return "emps-view";
	}
	

}
