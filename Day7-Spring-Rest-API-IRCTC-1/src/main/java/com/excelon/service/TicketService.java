package com.excelon.service;

import java.util.List;

import com.excelon.entities.Ticket;
import com.excelon.request.Passenger;

public interface TicketService {
	
	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicket(Integer ticketnum);
    public List<Ticket> getAllTickets();
    
}
