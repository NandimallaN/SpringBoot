package com.excelon.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelon.binding.Book;

@RestController
@RequestMapping("/")
public class BookRestController {

	List<Book> list;
	@GetMapping(value = "/book/{id}", produces = { "application/xml", "application/json" })
	public ResponseEntity<Book> getBook(@PathVariable("id") Integer id) {

		Book b = new Book(1, "Java", 200.00);
		System.out.println(b);
		return new ResponseEntity<>(b, HttpStatus.OK);
	}
	
	@GetMapping(value = "/books", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<Book>> getBooks() {

		Book b1 = new Book(1, "Java", 200.00);
		Book b2 = new Book(1, "Java", 200.00);
		Book b3 = new Book(1, "Java", 200.00);
		
	 list=Arrays.asList(b1,b2,b3);
		
		
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@PostMapping(value = "/book", consumes = { "application/json", "application/xml" },
			produces = {"text/plain"}
			)
	public ResponseEntity <String> saveBook(@RequestBody Book book)
	{
		System.out.println(book);
		
		//list.add(book);
		return new ResponseEntity<>("Book Save", HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/book-update")
	public ResponseEntity <String> updateBook(@RequestBody Book book)
	{
		System.out.println(book);
		
		//list.add(book);
		return new ResponseEntity<>("Book Save", HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/book-delete")
	public ResponseEntity <String> deleteBook(@RequestBody Book book)
	{
		System.out.println(book);
		
		//list.add(book);
		return new ResponseEntity<>("Book Save", HttpStatus.CREATED);
	}
}

