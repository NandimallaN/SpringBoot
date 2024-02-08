package com.excelon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelon.entities.Ticket;
import com.excelon.request.Passenger;
import com.excelon.service.TicketService;

@RestController
public class TicketRestController {
	
	@Autowired
	private TicketService  service;
	
	@PostMapping(value = "/ticket",
			  consumes = "application/json",
			  produces = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody  Passenger passenger){
		
		Ticket ticket=service.bookTicket(passenger);
		
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/ticket/{ticketnum}",
			  produces = "application/json")
	public ResponseEntity<Ticket> getTicket(@PathVariable("ticketnum") Integer ticketnum){
		
		Ticket ticket=service.getTicket(ticketnum);
		
		return new ResponseEntity<>(ticket,HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/tickets",
			  produces = "application/json")
	public ResponseEntity<List<Ticket>> getAllTicket(){
		
		List<Ticket> alltickets=service.getAllTickets();
		
		return new ResponseEntity<>(alltickets,HttpStatus.OK);
	}
	
}
