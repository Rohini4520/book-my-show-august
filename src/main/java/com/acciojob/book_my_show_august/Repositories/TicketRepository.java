package com.acciojob.book_my_show_august.Repositories;

import com.acciojob.book_my_show_august.Models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,String> {
}
