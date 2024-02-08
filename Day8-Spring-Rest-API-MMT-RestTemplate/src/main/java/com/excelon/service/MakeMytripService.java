package com.excelon.service;

import java.util.List;


import com.excelon.request.Passenger;
import com.excelon.response.Ticket;

public interface MakeMytripService {
	
	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicket(Integer ticketnum);
    public List<Ticket> getAllTickets();

}
