package com.excelon.service;





import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.excelon.request.Passenger;
import com.excelon.response.Ticket;

import reactor.core.publisher.Mono;

@Service
public class MakeMytripServiceImpl implements MakeMytripService {

	@Override
	public Mono<Ticket> bookTicket(Passenger passenger) {
		
		String apiUrl="http://localhost:8080/ticket";
		
		WebClient webClient= WebClient.create();
		Mono<Ticket> bodyToMono = webClient.post()
									.uri(apiUrl)
									.body(BodyInserters.fromValue(passenger))
									.retrieve()
									.bodyToMono(Ticket.class);
	
		return bodyToMono;
	}
	
	
	

	@Override
	public Mono<Ticket> getTicket(Integer ticketnum) {
		String apiUrl="http://localhost:8080/ticket/{ticketnum}";
		
		WebClient webClient= WebClient.create();
		Mono<Ticket> bodyToMono = webClient.get()
								.uri(apiUrl)
								.retrieve()
								.bodyToMono(Ticket.class);
		
		return bodyToMono;
	}

	@Override
	public Mono<Ticket[]> getAllTickets() {
		String apiUrl="http://localhost:8080/tickets";
		
		WebClient webClient= WebClient.create();
		
		Mono<Ticket[]> bodyToMono = webClient.get()
				.uri(apiUrl)
				.retrieve()
				.bodyToMono(Ticket[].class);
		return bodyToMono;
	}

}
