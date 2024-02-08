package com.excelon.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelon.entities.Person;
import com.excelon.entities.PersonPK;

public interface PersonRepo extends JpaRepository<Person, PersonPK>{

}
