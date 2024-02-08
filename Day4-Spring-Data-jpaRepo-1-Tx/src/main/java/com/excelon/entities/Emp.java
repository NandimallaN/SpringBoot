package com.excelon.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Emp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empid;
	
	private String empname;
	private Double empsalary;
	
	public Emp()
	{
	
	}
	
	public Emp(String empname, Double empsalary) {
		super();
		this.empname = empname;
		this.empsalary = empsalary;
	}
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
	public Double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(Double empsalary) {
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}
	
	

}
