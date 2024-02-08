package com.excelon.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.excelon.request.Passenger;
import com.excelon.response.Ticket;

@Service
public class MakeMytripServiceImpl implements MakeMytripService {

	@Override
	public Ticket bookTicket(Passenger passenger) {
		String apiUrl="http://localhost:8080/ticket";
		
		RestTemplate  rt= new RestTemplate();
		ResponseEntity<Ticket> responseEntity=
		rt.postForEntity(apiUrl, passenger, Ticket.class);
		
		Ticket responseBody= responseEntity.getBody();
		
		return responseBody;
	}
	
	
	

	@Override
	public Ticket getTicket(Integer ticketnum) {
		String apiUrl="http://localhost:8080/ticket/{ticketnum}";
		
		RestTemplate  rt= new RestTemplate();
		ResponseEntity<Ticket> forEntity=rt.getForEntity(apiUrl, Ticket.class,ticketnum);
		
		Ticket  body=forEntity.getBody();
		
		return body;
	}

	@Override
	public List<Ticket> getAllTickets() {
		String apiUrl="http://localhost:8080/tickets";
		
		RestTemplate  rt= new RestTemplate();
		ResponseEntity<Ticket []> forEntity=rt.getForEntity(apiUrl, Ticket[].class);
		
		Ticket [] body=forEntity.getBody();
		List<Ticket> tickets=Arrays.asList(body);
		return tickets;
	}

}
