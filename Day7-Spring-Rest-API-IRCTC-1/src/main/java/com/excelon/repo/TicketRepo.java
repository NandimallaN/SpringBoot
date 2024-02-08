package com.excelon.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelon.entities.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {

}
