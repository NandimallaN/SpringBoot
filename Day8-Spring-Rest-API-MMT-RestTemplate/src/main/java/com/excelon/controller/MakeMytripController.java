package com.excelon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.excelon.request.Passenger;
import com.excelon.response.Ticket;
import com.excelon.service.MakeMytripService;

@Controller
public class MakeMytripController {
	@Autowired
    private MakeMytripService service;
	
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("passenger",new Passenger());
		return "index";
	}
	
	@GetMapping("/search")
	public String search(Model model)
	{
		model.addAttribute("ticket",new Ticket());
		return "search";
	}
	
	@PostMapping("/ticket")
	public String handledBookTicketBtn(Passenger passenger, Model model)
	{
		Ticket ticket=service.bookTicket(passenger);
		model.addAttribute("ticket",ticket);
		return "viewalltickets";
	}
	
	@PostMapping("/search-ticket")
	public String searchTicket(@RequestParam("ticketnum") Integer ticketnum, Model model)
	{
		Ticket ticket=service.getTicket(ticketnum);
		model.addAttribute("ticket",ticket);
		return "search";
	}
	
	
	@GetMapping("/tickets")
	public String viewTickets(Model model)
	{
		List<Ticket> tickets=service.getAllTickets();
		model.addAttribute("tickets",tickets);
		return "viewalltickets";
	}
	
	
	
	
}
