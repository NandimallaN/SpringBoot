package com.excelon.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelon.entities.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer>{

}
