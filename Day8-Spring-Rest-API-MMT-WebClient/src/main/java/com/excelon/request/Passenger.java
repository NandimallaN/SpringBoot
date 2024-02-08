package com.excelon.request;

import java.time.LocalDate;

public class Passenger {

	private String name;
	private String phno;
	private String gender;
	private String fromadd;
	private String toaddress;
	private LocalDate doj;
	private Integer trainnum;
	
	public Integer getTrainnum() {
		return trainnum;
	}
	public void setTrainnum(Integer trainnum) {
		this.trainnum = trainnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFromadd() {
		return fromadd;
	}
	public void setFromadd(String fromadd) {
		this.fromadd = fromadd;
	}
	public String getToaddress() {
		return toaddress;
	}
	public void setToaddress(String toaddress) {
		this.toaddress = toaddress;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	
}
