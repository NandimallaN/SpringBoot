package com.excelon.binding;

public class Employee {
	private Integer empid;
	private String empname;
	private Double salary;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public Employee(Integer empid, String empname, Double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	
	

}
