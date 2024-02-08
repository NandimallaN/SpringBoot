package com.excelon.service;

import java.util.List;


import com.excelon.request.Passenger;
import com.excelon.response.Ticket;

import reactor.core.publisher.Mono;

public interface MakeMytripService {
	
	public Mono<Ticket> bookTicket(Passenger passenger);
	public Mono<Ticket> getTicket(Integer ticketnum);
    public Mono<Ticket[]> getAllTickets();

}
