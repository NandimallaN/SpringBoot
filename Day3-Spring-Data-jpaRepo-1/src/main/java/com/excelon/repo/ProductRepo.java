package com.excelon.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelon.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
