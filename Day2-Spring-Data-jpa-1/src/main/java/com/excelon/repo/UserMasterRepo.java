package com.excelon.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.excelon.entities.UserMasterEntity;

public interface UserMasterRepo extends CrudRepository<UserMasterEntity, Integer>{

	// select * from user_master where user_city= :city
	public List<UserMasterEntity> findByCity(String city);
/*
	// select * from user_master where user_age >= :age
	public List<UserMasterEntity> findByAgeGreaterThanEqual(int age);

	// select * from user_master where user_gender = :gender
	public List<UserMasterEntity> findByGender(String gender);

	// select * from user_master where user_gender=:gender and user_city=:city
	public List<UserMasterEntity> findByGenderAndCity(String gender, String city);
	*/

}
