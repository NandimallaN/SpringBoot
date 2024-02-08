package com.excelon.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addrid;
	private String city;
	private String state;
	private String country;
	private Integer empid;

	public Address() {
	}

	

	public Address(String city, String state, String country, Integer empid) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.empid = empid;
	}



	public Integer getAddrid() {
		return addrid;
	}

	public void setAddrid(Integer addrid) {
		this.addrid = addrid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "Address [addrid=" + addrid + ", city=" + city + ", state=" + state + ", country=" + country + ", empid="
				+ empid + "]";
	}

	
}
