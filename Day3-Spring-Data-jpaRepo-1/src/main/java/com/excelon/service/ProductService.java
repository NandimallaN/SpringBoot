package com.excelon.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.excelon.entities.Product;
import com.excelon.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	public void qbeEx(String pname) {
		Product entity=new Product();
		entity.setName(pname);
		
		List<Product> products=productRepo.findAll(Example.of(entity));
		products.forEach(product->{
			System.out.println(product);
		});
	}
	
	public void pagination(int x)
	{
		int pageSize=3;
		int pageNo=x;  // Page 1
		
		PageRequest of=PageRequest.of(pageNo, pageSize);
		Page<Product> page=productRepo.findAll(of);
		
		int tottalNoOfPage=page.getTotalPages();
		System.out.println("Total pages required :: "+tottalNoOfPage);
		
		List<Product> products=page.getContent();
		products.forEach(product->{
			System.out.println(product);
		});
	}
	
	public void getProducts()
	{
		System.out.println(" dispay products");
		System.out.println("===================");
		System.out.println();
		
		List<Product> recorrds= productRepo.findAll(Sort.by("price","pname"));
		
		recorrds.forEach(record->{
			System.out.println(record);
		});
		
	}
	
	public void saveProducts()
	{
		Product p1=new Product(101,"Mouse",500.00);
		Product p2=new Product(102,"HDD",1000.00);
		Product p3=new Product(103,"Keyboard",500.00);
		Product p4=new Product(104,"Monitor",5000.00);
		Product p5=new Product(105,"RAM",6500.00);
		Product p6=new Product(106,"AC",5700.00);
		Product p7=new Product(107,"USB CONNECTOR",500.00);
		Product p8=new Product(108,"Head Set",500.00);
		productRepo.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8));
		
	}

}
