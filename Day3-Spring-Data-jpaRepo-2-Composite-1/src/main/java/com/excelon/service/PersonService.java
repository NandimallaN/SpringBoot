package com.excelon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelon.entities.Person;
import com.excelon.entities.PersonPK;
import com.excelon.repo.PersonRepo;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personRepo;

	public void savePerson() {

		PersonPK pk = new PersonPK();

		pk.setAadhar(737377373L);
		pk.setPassport("sdf234");

		Person p = new Person();
		p.setName("Ramana");
		p.setEmail("ramana@gmail.com");
		p.setPersonPk(pk);
		personRepo.save(p);

	}

	public void getPerson() {
		PersonPK pk = new PersonPK();

		pk.setAadhar(737377373L);
		pk.setPassport("sdf234");

		Optional<Person> findById = personRepo.findById(pk);

		if (findById.isPresent())
			System.out.println(findById.get());

	}
}
