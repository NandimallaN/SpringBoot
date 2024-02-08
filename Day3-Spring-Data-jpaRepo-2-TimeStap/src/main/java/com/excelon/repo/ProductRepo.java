package com.excelon.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.excelon.entities.Product_Master;

import jakarta.transaction.Transactional;

public interface ProductRepo extends JpaRepository<Product_Master, Integer>{
	
	/*
	@Transactional
	@Modifying
	@Query("update product_master set price=:price where pid=:id")
	public void updateProduct(Integer id, Double price);
	
	*/

}
