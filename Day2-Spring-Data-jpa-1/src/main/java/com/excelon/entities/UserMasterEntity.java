package com.excelon.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_master")
public class UserMasterEntity {
	
	public UserMasterEntity() {
		super();
	}

	@Id
	@Column(name="user_id ")
	private Integer id;

	@Column(name="user_name")
	private String name;
	
	@Column(name="user_email")
	private String emil;
	
	@Column(name="user_gender")
	private String gender;
	
	@Column(name="user_city")
	private String city;
	
	@Column(name="user_age")
	private Integer age;
	
	

	public UserMasterEntity(Integer id, String name, String emil, String gender, String city, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.emil = emil;
		this.gender = gender;
		this.city = city;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmil() {
		return emil;
	}

	public void setEmil(String emil) {
		this.emil = emil;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserMasterEntity [id=" + id + ", name=" + name + ", emil=" + emil + ", gender=" + gender + ", city="
				+ city + ", age=" + age + "]";
	}
	
	
	
}
