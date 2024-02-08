package com.excelon.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelon.entities.Address;

public interface AddrRepo extends JpaRepository<Address, Integer>{

}
