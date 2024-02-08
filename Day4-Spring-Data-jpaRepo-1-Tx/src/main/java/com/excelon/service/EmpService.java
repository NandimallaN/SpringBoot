package com.excelon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelon.entities.Address;
import com.excelon.entities.Emp;
import com.excelon.repo.AddrRepo;
import com.excelon.repo.EmpRepo;

import jakarta.transaction.Transactional;

@Service
public class EmpService 
{

	@Autowired
	private EmpRepo empRepo;
	
	@Autowired
	private AddrRepo addrRepo;
	
	@Transactional(rollbackOn=Exception.class)
	public void saveData() {
		
		Emp emp = new Emp("Steve", 5500.00);
		
		empRepo.save(emp);
		
		//emp = empRepo.saveAndFlush(emp);
		
		//int i = 10/0;
		
		Address addr = new Address("GNT", "AP", "India", emp.getEmpid());
		
		addrRepo.save(addr);
	}
	
}
