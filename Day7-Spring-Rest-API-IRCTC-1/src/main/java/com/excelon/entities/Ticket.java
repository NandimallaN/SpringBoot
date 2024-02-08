package com.excelon.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ticketnum;

	private String name;
	private String phno;
	private String gender;
	public Integer getTicketnum() {
		return ticketnum;
	}
	public void setTicketnum(Integer ticketnum) {
		this.ticketnum = ticketnum;
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
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public String getTicketstatus() {
		return ticketstatus;
	}
	public void setTicketstatus(String ticketstatus) {
		this.ticketstatus = ticketstatus;
	}
	public Integer getTrainnum() {
		return trainnum;
	}
	public void setTrainnum(Integer trainnum) {
		this.trainnum = trainnum;
	}
	private String fromadd;
	private String toaddress;
	private Integer price;
	private LocalDate doj;
	private String ticketstatus;
	public Ticket() {
		super();
	}
	private Integer trainnum;
			

}
