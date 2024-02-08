package com.excelon;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.excelon.entities.UserMasterEntity;
import com.excelon.repo.UserMasterRepo;

@SpringBootApplication
public class Day2SpringDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(Day2SpringDataJpa1Application.class, args);
		
		UserMasterRepo usermasterrepo=context.getBean(UserMasterRepo.class);
		/*
		UserMasterEntity u1=new UserMasterEntity(101, "Ramana","Ramana@gmail.com",
				"Male", "Hyderabad", 25);
		UserMasterEntity u2=new UserMasterEntity(102, "Ramana","Ramana@gmail.com",
				"Male", "Hyderabad", 25);
		UserMasterEntity u3=new UserMasterEntity(103, "Ramana","Ramana@gmail.com",
				"Male", "Hyderabad", 25);
		
		usermasterrepo.saveAll(Arrays.asList(u1,u2,u3));*/
		
		Optional<UserMasterEntity> findById = usermasterrepo.findById(101);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
		List<UserMasterEntity>  findBycity=usermasterrepo.findByCity("Hyderabad");
		
		System.out.println(findBycity);
	}

}
