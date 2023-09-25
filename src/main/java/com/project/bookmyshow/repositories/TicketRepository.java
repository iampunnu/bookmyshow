package com.project.bookmyshow.repositories;

import com.project.bookmyshow.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
    Ticket save(Ticket ticket);

}
