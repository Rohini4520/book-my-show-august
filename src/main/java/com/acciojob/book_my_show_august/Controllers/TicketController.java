package com.acciojob.book_my_show_august.Controllers;

import com.acciojob.book_my_show_august.Models.Ticket;
import com.acciojob.book_my_show_august.Requests.BookTicketRequest;
import com.acciojob.book_my_show_august.Responses.TicketResponse;
import com.acciojob.book_my_show_august.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("bookTicket")

    public String bookTicket(@RequestBody BookTicketRequest bookTicketRequest){


        return ticketService.bookTicket(bookTicketRequest);


    }
    @GetMapping("generateTicket")
    public TicketResponse generateTicket(@RequestParam("ticketId") String ticketId){
        return ticketService.generateTicket(ticketId);
    }
}
