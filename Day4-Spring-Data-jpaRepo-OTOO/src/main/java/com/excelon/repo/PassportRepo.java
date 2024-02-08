package com.excelon.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelon.entities.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer> {

}
